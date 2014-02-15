package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lowcase {
public static void main(String[]args) throws IOException{
	String str=getInput("Enter the Uppercase line");
	String lstr=str.toLowerCase();
	System.out.println(lstr);
}

private static String getInput(String string) throws IOException {
	System.out.println(string);
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	return br.readLine();
}
}
