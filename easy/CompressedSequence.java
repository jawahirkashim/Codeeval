package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompressedSequence {
	public static void main(String[]args) throws IOException {
		FileReader fr=new FileReader(args[0]);
		BufferedReader br =new BufferedReader(fr);
		String str;
		String[] astr;
		StringBuilder sb=new StringBuilder();
		
		while (( str=br.readLine())!=null) {
			astr =str.split("\\s+");
			int count=1;
			if (astr.length==1) {
				String str1= count + " "+astr[0] + " ";
				sb.append(str1);
			}
		for(int i=1;i<astr.length;i++){
			
			if(astr[i].equals(astr[i-1])){
				count=count+1;
				
			}
			else {
				String str1= count + " "+astr[i-1] + " ";
				sb.append(str1);
				count =1;
			}
			if (i==astr.length-1) {
				String str1= count + " "+astr[i] + " ";
				sb.append(str1);
			}
			 }
			System.out.println(sb);
			sb=new StringBuilder();
		}
	}
}
