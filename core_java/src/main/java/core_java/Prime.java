package core_java;

public class Prime {

	public static void main(String[] args) {
		int n=13,m=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				m++;
		}
		if(m>2)
			System.out.println("Given number is not prime");
		else
			System.out.println("Given number is  prime");

	}

}
