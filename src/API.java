import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class API {
	public static void main(String[] args) {
		HttpResponse<JsonNode> response;
		try {
			response = Unirest.get("https://wordsapiv1.p.rapidapi.com/words/hatchback/typeOf")
					.header("X-RapidAPI-Key", "HttpResponse<JsonNode> response = Unirest.get(\"https://wordsapiv1.p.rapidapi.com/words/hatchback/typeOf\")\r\n" + 
							".header(\"X-RapidAPI-Key\", \"514be24f0emsh4d8d010aec01f99p1b08adjsn419c23712e80\")\r\n" + 
							".asJson();")
					.asJson();

		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
