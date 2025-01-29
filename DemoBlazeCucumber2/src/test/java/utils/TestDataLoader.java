package utils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.InputStream;
import java.io.InputStreamReader;

public class TestDataLoader {

    /*
     * Load a JSON file from theresources folder.

     * @param resourceFileName The name of the JSON file (e.g., "testdata.json").
     * @return JSONObject containing the test data.
     */
    public static JSONObject loadJson(String resourceFileName) {
        JSONParser parser = new JSONParser();
        try (InputStream inputStream = TestDataLoader.class.getClassLoader().getResourceAsStream(resourceFileName);
             InputStreamReader reader = new InputStreamReader(inputStream)) {

            return (JSONObject) parser.parse(reader);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error loading JSON file: " + resourceFileName, e);
        }
    }
}
