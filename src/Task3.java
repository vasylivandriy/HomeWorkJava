import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


		System.out.println("Input number a");
		String a = bufferedReader.readLine();

		System.out.println("Input number b");
		String b = bufferedReader.readLine();

		if (a.contains(".") || a.contains(","))
			System.out.println("You input wrong type of number a ");

		else if (b.contains(".") || b.contains(","))
			System.out.println("You input wrong type of number b ");

		else System.out.println("Sum of these numbers = " + (Integer.parseInt(a) + Integer.parseInt(b)));


	}

}
