package testdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Paths;
import java.util.List;

public class JsonReader {

    public static List<LoginData> getLoginData() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(
                Paths.get(System.getProperty("user.dir"), "src", "test", "java", "testdata", "testdata.json").toFile(),
                mapper.getTypeFactory().constructCollectionType(List.class, LoginData.class)
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
