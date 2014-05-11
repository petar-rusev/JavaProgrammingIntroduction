package PrintDeckOfCards;
import java.util.Scanner;

public class AdditionNumbers {

	public static void main(String[] args) {
		System.out.println("Please enter the first number");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		System.out.println("Please enter the second number");
		int b=input.nextInt();
		int result=a+b;
		System.out.printf("%d+%d=%d",a,b,result);
		input.close();
	}

}
