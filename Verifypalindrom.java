
public class Verifypalindrom {

	public static void main(String[] args) {
		String str = "java devloper";

		char[] arr = str.toCharArray();
		String rev = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			rev = rev + arr[i];
			if (str.equals(rev)) {
				System.out.println("palindrome");
			} else {
				System.out.println("not palindrome");
			}
		}
	}

}
