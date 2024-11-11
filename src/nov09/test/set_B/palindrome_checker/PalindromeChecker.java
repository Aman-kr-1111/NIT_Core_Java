package nov09.test.set_B.palindrome_checker;

public class PalindromeChecker {
	private String text;

	public PalindromeChecker(String text) {
		super();
		this.text = text;
	}

	public boolean isPalindrome() {
		String cleanedText = text.replaceAll("\\s+", "").toLowerCase();

		int left = 0;
		int right = cleanedText.length() - 1;

		while (left < right) {
			if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public void printResult() {
		System.out.println("Is '" + text + "' a palindrome?");
		if (isPalindrome()) {
			System.out.println("Yes, it is a palindrome.");
		} else {
			System.out.println("No, it is not a palindrome.");
		}
	}
}
