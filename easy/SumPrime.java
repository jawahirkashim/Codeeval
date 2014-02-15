package easy;
//Sum of first 1000 primes
public class SumPrime {
public static void main(String[]args){
	int num = 10;
	int sum=0;
	int[] aprime=getPrime(num);
	for (int i : aprime) {
		sum = sum + i;
	}
	System.out.println("the sum of the prime till 1000 is : "+ sum);
}

private static int[] getPrime(int num) {
	int[] anum= new int[num];
	for (int i = 0; i < anum.length; i++) {
		anum[i]=i;
	}
	anum[1]=0;
	for (int i = 2; i < anum.length; i++) {
		for (int j = 2; j <= (anum.length-1)/i; j++) {
			anum[i*j]=0;
		}
	}
	return anum;
}
}
