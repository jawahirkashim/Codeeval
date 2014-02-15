package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hexa2Decimal {
public static void main(String[]args) throws IOException{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	System.out.println("Please enter the hex num");
	String str=br.readLine();
	int num = Integer.parseInt(str, 16);
	System.out.println("the number in decimal is : "+num);
}
}
