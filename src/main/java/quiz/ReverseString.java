package quiz;

public class ReverseString {
    /*public String reverse(String input) {
        return new StringBuffer(input).reverse().toString();
    }*/
	
	public String reverse(String input) {
		char[] tokens = new char[input.length()];
		input.getChars(0, input.length(), tokens, 0);
		
		return recurse(tokens, 0);
	}
	
	public String recurse(char[] tokens, int index) {
		if (index < tokens.length) {
			return recurse(tokens, index+1) + tokens[index];
		} else {
			return "";
		}
	}
}