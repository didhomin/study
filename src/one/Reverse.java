package one;

public class Reverse {
	public static void main(String args[]) {
		String str = "Hello World";
		char[] tempStr = str.toCharArray();
		char tempCh;
		for (int i = 0; i < (tempStr.length / 2); i++) {
			tempCh = tempStr[i];
			tempStr[i] = tempStr[(tempStr.length - 1) - i];
			tempStr[(tempStr.length - 1) - i] = tempCh;
		}

		System.out.println("before : " + str);
		System.out.println("after : " + new String(tempStr));
	}
}
