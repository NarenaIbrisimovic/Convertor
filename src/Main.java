<<<<<<< HEAD
=======

>>>>>>> 8dfa4704bf031d4ce60834ca7332d604c8209c07
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

<<<<<<< HEAD
		String s = "CAD";
		System.out.println(currencyOne(s));
	}

	public static double currencyOne(String str) {
		
		TextIO.readUserSelectedFile("Currency.txt");
		String part1 = "";
		String part2 = "";
		do {
		String s = TextIO.getln();
		String[] full = s.split(" ");
		part1 = full[0];
		 part2 = full[1];
		}while (str != part1 );
		
		if (str == part1) {
			num = Double.parseDouble(part2);
		}
		
		return num;

=======
>>>>>>> 8dfa4704bf031d4ce60834ca7332d604c8209c07
	}

}
