package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Given a positive integer, find the sum of its constituent digits.
public class SumOfDigits {
public static void main(String[]args) throws NumberFormatException, IOException{
	int num = getInput("Enter the number");
	int sum=0;
	while(num>0){
		int unit=num%10;
		 sum= sum+unit;
		 num=num/10;
	}
	System.out.println("the sum of all the digits is :"+sum);
}

private static int getInput(String string) throws NumberFormatException, IOException {
	System.out.println(string);
	InputStreamReader isr= new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	int num = Integer.parseInt(br.readLine());
	return num;
}
}
