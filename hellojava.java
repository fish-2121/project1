import java.util.Scanner;

public class hellojava {
	public static void main (String[] args) {
		System.out.println("hello! what is your name?");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Hello " + name + "! it is good to meet you!");
	}
}
