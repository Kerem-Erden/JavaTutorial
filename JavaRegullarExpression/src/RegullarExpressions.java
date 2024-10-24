import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegullarExpressions {
	public static void main(String[] args) {
		Pattern patternObject = Pattern.compile("Visit W3Scholls!", Pattern.CASE_INSENSITIVE);
		Matcher matcherObject = patternObject.matcher("Visit W3Scholls!");
		boolean matchFound = matcherObject.find();
		if(matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}
	}

}

//https://www.w3schools.com/java/java_regex.asp