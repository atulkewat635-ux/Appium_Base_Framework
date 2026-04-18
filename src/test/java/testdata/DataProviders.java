package testdata;

import org.testng.annotations.DataProvider;
import java.util.List;

public class DataProviders {

    @DataProvider(name = "loginData")
    public Object[][] getData() {

        List<LoginData> dataList = JsonReader.getLoginData();

        Object[][] data = new Object[dataList.size()][1];

        for (int i = 0; i < dataList.size(); i++) {
            data[i][0] = dataList.get(i);
        }

        return data;
    }
}
