package PrintDeckOfCards;
import java.util.Arrays;
import java.util.Scanner;
public class SortArray {

	public static void main(String[] args) {
		//getting the number of strings in an Array
		System.out.println("Please enter a number of strings you would like to add.");
		Scanner in=new Scanner(System.in);
		int quant=in.nextInt();
		String [] strings=new String [quant];
		
		//adding strings in an Array
		for(int i=0;i<quant;i++){
			
			strings[i]=in.nextLine();
			
		}
		Arrays.sort(strings);
		for(int i=0;i<quant;i++){
			System.out.printf("%s%n",strings[i]);
		}
			
		in.close();

	}

}
