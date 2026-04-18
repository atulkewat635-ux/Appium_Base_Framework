package testdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.List;

public class JsonReader {

    public static List<LoginData> getLoginData() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(
                new File("C:\\Users\\atulkewat\\Downloads\\Appium_mobile_Automation 1\\Appium_mobile_Automation\\src\\test\\java\\testdata\\testdata.json"),
                mapper.getTypeFactory().constructCollectionType(List.class, LoginData.class)
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
