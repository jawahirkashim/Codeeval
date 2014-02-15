package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//A number is a self-describing number when (assuming digit positions are labeled 0 to N-1), the digit in each 
//position is equal to the number of times that that digit appears in the number.
public class SelfDescribngNum {
public static void main(String[]args) throws IOException{
	int[] anum=getInput("Enter the self describing array");
	
	boolean isSelfi=isSelfDescribing(anum);
	System.out.println("the array is self describing "+isSelfi);
}

private static boolean isSelfDescribing(int[] anum) {
	for (int i = 0; i < anum.length; i++) {
		int num=anum[i];
		int count=0;
		for (int j = 0; j < anum.length; j++) {
		if(num==i){
			count++;
		}
		if(count>num){
			return false;
		}
		}
		if(count!=num){
			return false;
		}
	}
	return true;
}

private static int[] getInput(String string) throws IOException {
	System.out.println(string);
	InputStreamReader isr= new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	String[] astr=br.readLine().split("\\s+");
	int[]anum=new int[astr.length];
	for (int i = 0; i < astr.length; i++) {
		anum[i]=Integer.parseInt(astr[i]);
	}
	return anum;
}
}
