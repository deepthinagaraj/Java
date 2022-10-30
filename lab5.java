import java.util.Scanner;

public class lab5 {
	public static String mnemonist(String input) {
		String[] maps = {"none", "none", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "XYWZ"};
		String output = "";
		for(int i=0; i<input.length(); i++) {
			char in = input.charAt(i);
			if(Character.isDigit(in)) {
				output += input.charAt(i);
			}
			else if(Character.isAlphabetic(in)){
				for(int j=0; j<maps.length; j++) {
					if(maps[j].indexOf(in) >= 0) {
						output += (j);
					}
				}
			}
			else {
				output += in;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Enter a phone number string in the format XXX-XXX-XXXX: ");
		String input = sc.nextLine();
		
		String output = mnemonist(input);
		System.out.println(output);
		
		sc.close();
	}
}

