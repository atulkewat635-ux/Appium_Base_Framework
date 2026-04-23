package utils;

import base.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportManager implements ITestListener {

    private static final Logger log = LogManager.getLogger(ExtentReportManager.class);
    private ExtentReports extent;
    private final ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onStart(ITestContext context) {
        log.info("===== Test Execution Started: {} =====", context.getName());

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String reportPath = System.getProperty("user.dir") + File.separator + "reports"
                + File.separator + "Test-Report-" + timeStamp + ".html";

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
        sparkReporter.config().setDocumentTitle("Automation Report");
        sparkReporter.config().setReportName("Appium Functional Testing");
        sparkReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("Application", "Sauce Labs Demo App");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("User Name", System.getProperty("user.name"));
        extent.setSystemInfo("Operating System", System.getProperty("os.name"));
        extent.setSystemInfo("Java Version", System.getProperty("java.version"));

        log.info("Extent report will be generated at: {}", reportPath);
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        extentTest.assignCategory(result.getTestClass().getRealClass().getSimpleName());
        test.set(extentTest);
        log.info("Test STARTED: {}", result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().log(Status.PASS, result.getName() + " executed successfully");
        log.info("Test PASSED: {}", result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.get().log(Status.FAIL, result.getName() + " failed");
        test.get().log(Status.FAIL, result.getThrowable());
        log.error("Test FAILED: {}", result.getName(), result.getThrowable());

        attachScreenshot(result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.get().log(Status.SKIP, result.getName() + " skipped");
        if (result.getThrowable() != null) {
            test.get().log(Status.INFO, result.getThrowable());
        }
        log.warn("Test SKIPPED: {}", result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        if (extent != null) {
            extent.flush();
        }
        test.remove();
        log.info("===== Test Execution Finished: {} =====", context.getName());
    }

    private void attachScreenshot(ITestResult result) {
        Object testInstance = result.getInstance();
        if (!(testInstance instanceof BaseTest)) {
            log.debug("Skipping screenshot because test instance is not a BaseTest.");
            return;
        }

        try {
            String screenshotPath = ((BaseTest) testInstance).captureScreen(result.getName());
            if (screenshotPath != null) {
                test.get().addScreenCaptureFromPath(screenshotPath);
            }
        } catch (Exception e) {
            log.error("Failed to attach screenshot for test: {}", result.getName(), e);
        }
    }
}
