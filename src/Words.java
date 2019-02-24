import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONObject;

public class Words {

	public static void main(String[] args) {
		getDefinitions("fuckwad");
	}
	
	public static String[] getSynonyms(String word) {
		JSONObject response = API.word(word, "synonyms");
		if (!response.getBoolean("success")) return null;
		return API.buildArray(response.getJSONArray("synonyms"));
	}
	
	public static String[] getDefinitions(String word) {
		JSONObject response = API.word(word, "definitions");
		if (!response.getBoolean("success")) return null;
		return API.buildArray(response.getJSONArray("definitions"));
	}
	
	public static String[] getAntonyms(String word) {
		JSONObject response = API.word(word, "antonyms");
		if (!response.getBoolean("success")) return null;
		return API.buildArray(response.getJSONArray("antonyms"));	
	}
	
	public static String[] getExamples(String word) {
		JSONObject response = API.word(word, "examples");
		if (!response.getBoolean("success")) return null;
		return API.buildArray(response.getJSONArray("examples"));		
	}
	
	public static String[] getRhymes(String word) {
		JSONObject response = API.word(word, "rhymes");
		if (!response.getBoolean("success")) return null;
		return API.buildArray(response.getJSONArray("rhymes"));
	}

	public static String[] getPronunciation(String word) {
		JSONObject response = API.word(word, "definitions");
		if (!response.getBoolean("success")) return null;
		return API.buildArray(response.getJSONArray("definitions"));	
	}
	
	public static int getSyllableCount(String word) {
		JSONObject response = API.word(word, "syllables");
		if (!response.getBoolean("success")) return -1;
		return response.getJSONObject("syllables").getInt("count");
	}
	
	public static String[] getSyllables(String word) {
		JSONObject response = API.word(word, "syllables");
		if (!response.getBoolean("success")) return null;
		return API.buildArray(response.getJSONObject("syllables").getJSONArray("list"));
	}

	public static double getUsesPerMillion(String word) {
		JSONObject response = API.word(word, "frequency");
		if (!response.getBoolean("success")) return -1;
		return response.getJSONObject("frequency").getDouble("perMillion");	
	}
	
	public static String[] getPartsOfSpeech(String word) {
		JSONObject response = API.word(word, "");
		if (!response.getBoolean("success")) return null;
		JSONArray results = response.getJSONArray("results");
		String[] partsOfSpeech = new String[results.length()];
		for (int i = 0; i<results.length(); i++) {
			partsOfSpeech[i] = results.getJSONObject(i).getString("partOfSpeech");
		}
		return partsOfSpeech;	
	}
	
	public static JSONObject getSummary(String word) {
		return API.word(word, "");
	}
	
	
	
	
	
}
