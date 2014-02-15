package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RightMostCharacter  {
public static void main(String[]args) throws IOException{
	File f=new File("rmc.txt");
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	String str=br.readLine();
	int charPosition=0;
	while (str!=null) {
		String [] sarray=str.split(",");//since separted by comas
		char[] carray=sarray[0].toCharArray();
		char[] carray2=sarray[1].toCharArray();
		
		for (int i = carray.length-1; i > 0; i--) {
			if(carray[i]== carray2[0]){
				charPosition=i;
				System.out.println("the position of the rightmost character is "+charPosition);
				break;
			}
		}
		str=br.readLine();
	}
}
}
