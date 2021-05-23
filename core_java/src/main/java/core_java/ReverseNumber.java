package core_java;

public class ReverseNumber {
	
	public static void main(String[] args) {
		int num=34562;
	int sum=0;
	while(num>0) {
		int i=num%10;
		sum=(sum*10)+i;
		num=num/10;
	}
	System.out.println(sum);
	}

}
