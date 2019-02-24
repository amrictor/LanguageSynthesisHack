import org.json.JSONArray;
import org.json.JSONObject;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class API {
	
	public static String[] buildArray(JSONArray jsonArray) {
		String[] stringsArray = new String[jsonArray.length()];
		for (int i = 0; i < jsonArray.length(); i++) {
		    stringsArray[i] = jsonArray.getString(i);
		}
		return stringsArray;
	}
	
	public static JSONObject word(String word, String request) {
		HttpResponse<JsonNode> response;
		try {
			response = Unirest.get("https://wordsapiv1.p.rapidapi.com/words/"+ word +"/"+request)
					.header("X-RapidAPI-Key", "a7bfc1cc81mshb8fc52f94772cdcp1a8afajsn4644e0e5ab6d")
					.asJson();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		System.out.println(response.getBody().getObject());
		return response.getBody().getObject();
	}
	
	public static void main(String[] args) {
		HttpResponse<JsonNode> response;
		try {
			response = Unirest.get("https://wordsapiv1.p.rapidapi.com/words/hatchback/typeOf")
					.header("X-RapidAPI-Key", "a7bfc1cc81mshb8fc52f94772cdcp1a8afajsn4644e0e5ab6d")
					.asJson();
			System.out.println(response.getBody().getObject());
			

		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
