import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.print("Podaj ile chcesz liczb;");
		int a =s.nextInt();
		// TODO Auto-generated method stub
		int f1=0;
		int f2=1;
		System.out.print(f1+" "+f2+" ");
		for(int i=0;i<a;i++)
		{
			int f3=f1+f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
		}
	}
}
