/** Class created to provide debugging practice
 * @ author pwaite
 */
public class DebugOne {
	/* method writes out weekday and weather word pairs if the first letter of each matches. 
     * example: Windy Wednesday or Foggy Friday
	 * @#param args Command line arguments - not used in this example
	 */
	public static void main(String[]  args) {	
		
		String[] weekdays = {"Monday","Tuesday", "Wednesday", "Thursday", "Friday"}; 
		
		String[] weather = {"Sunny", "Cloudy", "Rainy", "Foggy", "Windy"};		
		
		for (String day : weekdays) {
			for (String weatherWord: weather) {
				if (day.substring(0,1) == (weatherWord.substring(0,1))) {
					System.out.println(weatherWord + " " + day);
				}
			}
		}
	}
}