package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonachiSeries {
public static void main(String[] args) throws NumberFormatException, IOException{
	int num=getInput("Enter a positive position to get the fibonachi number ");
	int fnum=getFibonachinum(num);
	System.out.println("the fibonachi num is : "+ fnum);
}

private static int getFibonachinum(int num) {
	if(num==0){return 0;}
	if(num==1){return 1;}
	else{
	int fnum= getFibonachinum(num-1)+getFibonachinum(num-2);
	return fnum;	
	}
}

private static int getInput(String string) throws NumberFormatException, IOException {
	System.out.println(string);
	InputStreamReader isr= new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	return Integer.parseInt(br.readLine());
}
}
