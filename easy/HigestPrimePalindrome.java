public class Main{
    int num=1000;
public static void main(String[]args){
	for(int i=1000;i>2;--i){
		if(isPrime(i)&& isPalindrom(i)){
				System.out.println(i);
				break;
			}
		}
	}

private static boolean isPalindrom(int i) {
	int rec=i;
	int copy=0;
	while(i>0){
		int rec1=i%10;
		copy=copy*10+rec1;
		i=i/10;
	}
	return copy==rec;
}
private static boolean isPrime(int i) {
	if(i%2 == 0 || i%3 == 0)return false;
	for (int j = 5; j*j <= i; j+=2) {
		if(i%j == 0){
			return false;
		}
		
	}return true;
}
}
