package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Given numbers x and n, where n is a power of 2, print out the smallest multiple of n which
//is greater than or equal to x. Do not use division or modulo operator.
//13,8=>16
public class MultipleNumber {
public static void main(String[]args) throws IOException{
	String line = getInput("Please Enter the number eg: 13,8");
	int a = 0;
	int b = 0;
	
		String[] astr= line.split(",");
		 a=Integer.parseInt(astr[0]);
		 b=Integer.parseInt(astr[1]);
	
	int numMulti = getMultiple(a,b);
	System.out.println(numMulti);
}

private static String getInput(String string) throws IOException {
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String line = br.readLine();
	return line;
}

private static int getMultiple(int a, int b) {
	if(a<b){return b;}
	else{
		b=b<<1;
		return getMultiple(a, b);
	}
}
}
