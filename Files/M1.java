package Files;

import java.util.Map;

public class M1 {
	 
	public static void main(String[] args) {
    String filePath = "D:\\country,capital.csv"; // Change to the path of your CSV file
   Map<String, String> countryCapitalMap = Countrymap.loadCsvFileToMap(filePath);
   for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
        System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
    }
}
}