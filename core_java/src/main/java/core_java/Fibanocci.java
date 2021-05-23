package core_java;

public class Fibanocci
{
	public static void main(String[] args)
	{
		int n1=0,n2=1;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=1;i<=10;i++)
		{
			int sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}
	}
}
