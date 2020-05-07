import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); //Create scanner object
		System.out.println("Enter word");
		String newLine = scan.nextLine();  // Read user input
		String intValue = newLine.replaceAll("[^0-9]", "");
		System.out.println(intValue);
	}

}
