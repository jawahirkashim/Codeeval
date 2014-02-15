package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//153=>(1^3+5^3+3^3)=153=>153 is an armstrong num,3 is the no of digits in the no.
public class ArmstrongNUm {
public static void main(String[]args) throws IOException{
	String str= getInput("Enter the number");
	int len=str.length();
	double sum=0;
	for (int i = 0; i < len; i++) {
		sum=sum+Math.pow(Integer.parseInt(str.charAt(i)+""), len);
	}
	System.out.println("the num is armstrong: " + "sum: "+sum+"  "+(sum==Integer.parseInt(str)));
}

private static String getInput(String string) throws IOException {
	System.out.println(string);
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	return br.readLine();
}
}
