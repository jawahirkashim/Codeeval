package easy;
//it didnot work for dublicate entries
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class SetIntersection {
public static void main(String[]args) throws IOException{
	int[] anum1=getInput("Enter the first array of num : ");
	int[] anum2=getInput("Enter the second array of num: ");
	ArrayList<Integer> aInter=getIntersectionSet(anum1,anum2);
	System.out.println(aInter);
}

private static ArrayList<Integer> getIntersectionSet(int[] anum1, int[] anum2) {
	Arrays.sort(anum1);
	Arrays.sort(anum2);
	int maxSize=Math.max(anum1.length, anum2.length);
	int count1=0;
	int count2=0;
	ArrayList<Integer> alist= new ArrayList<Integer>();
	for(int i=0;i<maxSize;i++){
		if(anum1[count1]<anum2[count2]){
			count1++;
		}
		else if(anum1[count1]>anum2[count2]){
			count2++;
		}
		else{
			alist.add(anum1[count1]);
			count1++;
			count2++;
		}
	}
	return alist;
}

private static int[] getInput(String string) throws IOException {
	System.out.println(string);
	InputStreamReader isr= new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(isr);
	String[] astr= br.readLine().split("\\s+");
	int[] anum=new int[astr.length];
	for(int i=0;i<astr.length;i++){
		anum[i]=Integer.parseInt(astr[i]);
	}
	return anum;
}
}
