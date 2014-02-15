package easy;
//Bits in position x,y are same or different.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitsPositionEq {
public static void main(String[] args) throws NumberFormatException, IOException{
	int n= getInput("Enter num");
	int p=getInput("Enter the position of first bit to be check");
	int q=getInput("Enter the position of second bit to be check");
	boolean isPosi = checkBitPossi(n,p,q);
	System.out.println(isPosi );
}

private static boolean checkBitPossi(int n, int p, int q) {
	
	return ((n>>p) & 1)==((n>>q) & 1);
}

private static int getInput(String string) throws NumberFormatException, IOException {
	System.out.println(string);
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	return Integer.parseInt(br.readLine());
}
}
