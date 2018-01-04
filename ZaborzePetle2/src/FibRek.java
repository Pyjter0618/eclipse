import java.util.Scanner;

public class FibRek {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner( System.in );
		System.out.print("Który element ciagu chcesz znaæ: ");
		int ktory = s.nextInt();
		
		int wynik = Fib( ktory );
		System.out.println("wybrany element to: "+ wynik);
		
	}

	private static int Fib(int ktory)
	{
		if( ktory == 1) return 1;
		if( ktory == 2) return 1;
		
		if( ktory > 2 ) return Fib( ktory - 1 ) + Fib( ktory - 2 );
		else return 0;
	}
}
