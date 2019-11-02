import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input number a (type int)");
		String a = bufferedReader.readLine();

		if( a.contains(".")||a.contains(",")) System.out.println("You input wrong type of number");
		else if(Integer.parseInt(a)%2==0) System.out.println("a is a pair number");
		else System.out.println("a is a non pair number");




	
	}

}
