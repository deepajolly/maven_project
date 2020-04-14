package java_training;

public class Deepa {
	public static void main(String args[])
	{
	int n=153;
	int temp=n;
	int r;
	int a=0;
	while(n!=0)
	{
	r=n%10;
	a=a+(r*r*r);
	n=n/10;
	}
	if(temp==a)
	{
	System.out.print("number is Armstrong");
	}
	else
	{
	System.out.print("number is Not Armstrong");
	}
	}
}


