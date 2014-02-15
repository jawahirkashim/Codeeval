package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReverseWord {
public static void main(String[] args){
	File file= new File(args[0]);
	FileReader fr = null;
	try {
		fr = new FileReader(file);
	} catch (FileNotFoundException e) {
		e.getMessage();
	}
	BufferedReader br=new BufferedReader(fr);
	String str;
	String[] rstr = null;
	try {
		while ((str = br.readLine())!=null) {
		 String[]astr=str.split("\\s");	
		 rstr= reverseString(astr);
		 }
	} catch (IOException e) {
		e.getMessage();
	}
	
	for (String string : rstr) {
		System.out.print(string+" ");
	}
}

private static String[] reverseString(String[] astr) {
	String temp;
	for(int i=0;i<astr.length/2;i++){
		temp = astr[i];
		astr[i]=astr[astr.length-1-i];
		astr[astr.length-1-i]=temp;
	}
	return astr;
} 
}
