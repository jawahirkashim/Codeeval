package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Simple_Sort {
public static void main(String[]args) throws IOException{
	FileReader fr=new FileReader(args[0]);
	BufferedReader br =new BufferedReader(fr);
	String str;
	String[] astr;
	float[] afloat;
	float[] asorted;
	while (( str=br.readLine())!=null) {
		astr =str.split("\\s+");
		 afloat = new float[astr.length];
		for (int i=0;i<astr.length;i++) {
			afloat[i] = Float.parseFloat(astr[i]);
		}
		asorted = mergesort(afloat);
		for (float f : asorted) {
			System.out.print(f+" ");
		}
		System.out.println();
	}
}

private static float[] merge(float[] c, float[] d) {
	int cCount=0;
	int dCount=0;
	int mCount=0;
	float[]aMerged=new float[c.length+d.length];
	while(mCount<aMerged.length){
	if(cCount==c.length){
		aMerged[mCount++]=d[dCount++];
	}
	else if(dCount==d.length){
		aMerged[mCount++]=c[cCount++];
	}
	else if(c[cCount]<d[dCount]){
		aMerged[mCount++]=c[cCount++];
	}
	else{
		aMerged[mCount++]=d[dCount++];
	}
	
}
	return aMerged;}

private static float[] mergesort(float[] afloat) {
	if(afloat.length==1)return afloat;
	else{
		float[] A=Arrays.copyOfRange(afloat, 0, afloat.length/2);
		float[] B=Arrays.copyOfRange(afloat, afloat.length/2, afloat.length);
		float[]C=mergesort(A);
		float[]D=mergesort(B);
		float[]E=merge(C,D);
		return E;
	}
	
}
}
