package easy;

//Sum of first 1000 primes
public class SumPrime {
public static void main(String[]args){
int sum=0;
int count=0;
int current=2;

while(count<1000){
	if(isPrime(current)){
		sum=sum+current;
		count++;
	}
	current++;
}

System.out.println(sum);
}
private static boolean isPrime(int num){
	if(num<2)return false;
	if(num==2||num==3)return true;
	if(num%2==0||num%3==0)return false;
	for (int i = 3; i*i <= num; i +=2) {
		if(num%i==0){return false;}
	}	
	return true;
	}
}