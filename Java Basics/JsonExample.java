//JSON
import org.json.JSONObject;

public class JsonExample {
    public static void main(String[] args) {
        // Creating a JSON Object
        JSONObject obj = new JSONObject();
        obj.put("name", "Amarjit");
        obj.put("age", 21);

        // Convert JSONObject to String
        String jsonString = obj.toString();
        System.out.println("JSON Object: " + jsonString);

        // Parsing JSON String to JSONObject
        JSONObject parsedObj = new JSONObject(jsonString);
        System.out.println("Parsed Name: " + parsedObj.getString("name"));
    }
}
