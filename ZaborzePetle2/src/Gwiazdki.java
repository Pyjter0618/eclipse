import java.util.Scanner;

public class Gwiazdki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj liczbê wierszy: ");
		a=scanner.nextInt();
		System.out.print("\n");
		System.out.print("podaj liczbê kolumn: ");
		b=scanner.nextInt();
		System.out.print("\n");
		System.out.println("Podaj znak: ");
		char c=scanner.next().charAt(0);
		System.out.print("\n");
		scanner.close();
		for(int i=0; i<a; i++)
		{
			for(int j=0; j<b; j++)
			{
				System.out.print(c);
			} //koniec for j

			System.out.println("");

		} //koniec for i

	}
}
