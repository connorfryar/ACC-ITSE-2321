public class Proj02 {
	public static void main(String[] args) {
		honorStatement();

		// new line for readability && match instructions.
		System.out.println();

		int totalSum = 0;

		// typically would want to do input validation.
		for (String s: args) {
			System.out.println(s);
			totalSum+=Integer.parseInt(s);
		}
		System.out.println(totalSum);
}
	// Method for honor statement
	public static void honorStatement() {
		System.out.println(
		"I certify that this program is my own work\n" +
		"and is not the work of others. I agree not\n" +
		"to share my solution with others.\n" +
		"Andrew Connor Fryar"
		);
	}
}
