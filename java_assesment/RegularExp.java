package java_assesment;
import java.util.regex.*;
public class RegularExp {

		public static void main(String[] args) {

		    String pattern = "[a-z]+";
		    String check = "Normal Exp Demo";
		    Pattern a = Pattern.compile(pattern);
		    Matcher b = a.matcher(check);
		    
		    while (b.find())
		          System.out.println( check.substring( b.start(), b.end() ) );
		    }
		}
