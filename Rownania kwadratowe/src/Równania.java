import java.util.Scanner;

public class R�wnania {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
Scanner scanner =new Scanner (System.in);
System.out.println("Podaj a:");
double a=scanner.nextDouble();
System.out.println("Podaj b:");
double b=scanner.nextDouble();
System.out.println("Podaj c:");
double c=scanner.nextDouble();
if(a==0)
{
	if(b==0)
	{
		if(c==0)
		{
			System.out.println("Niesko�czone nie wiele rozwi�za�:");
		}
	}
	if(b!=0)
	{
		double x=-c/b;
		System.out.println("Rozwi�zaniem r�wnania jest:"+x);
	}
}
if(a!=0)
{
	double delta=b*b-4*a*c;
	if(delta==0)
	{
		double x3=-b/2*a;
		System.out.println("Roziw�zaniem r�wnania jest:+x3);
	}
	if(delta>0)
	{
		double x1=(-b-(int)Math.squrt(delta)/2);
		double x2=(-b+(int)Math.squrt(delta)/2;
		System.out.println("x1wynosi"+x1"\n x2 wynosi"+x2);
	}
}
Scanner.close();
}
}

