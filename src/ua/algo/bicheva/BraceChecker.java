package ua.algo.bicheva;

public class BraceChecker {
	
	public static void main(String[] args) {
		String input = "((({})";
		
		boolean result = new BraceChecker().isValid(input);
		System.out.println(result);
	}
	
	public boolean isValid(String braces) {
		 if(braces.length() == 0 && braces.length() % 2 != 0) return false;
		 else {
			 return isCorrect(braces.toCharArray(), 0, 0) != -1;
		 }
	}

	private int isCorrect(char[] charArray, int id, int level) {
		if(isClose(charArray[id]) && id != 0) return id;
		else {
			int closeId = isCorrect(charArray, id+1, level);
			if(closeId == -1) return closeId;
			else if(isOk(charArray[id], charArray[closeId]) && closeId == charArray.length-1 && level == 0) return closeId;
			else if(isOk(charArray[id], charArray[closeId])) return isCorrect(charArray, closeId+1, level+1);
			else return -1;
		}
	}

	private boolean isOk(char c, char d) {
		switch (c) {
			case '(': return d == ')';
			case '[': return d == ']';
			case '{': return d == '}';
			default: return false;
		}
	}

	private boolean isClose(char c) {
		return c == ')' || c == ']' || c == '}';
	}
}
