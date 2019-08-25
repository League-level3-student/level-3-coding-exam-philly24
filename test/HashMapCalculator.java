import java.util.HashMap;

public class HashMapCalculator {

	public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		// TODO Auto-generated method stub
		int sameHash = 0;
		for (String key : hashmap1.keySet()) {
			if (hashmap2.containsKey(key) && hashmap2.containsValue(hashmap1.get(key))) {
			
					sameHash++;
			}
		}
		return sameHash;
	
	}

}
