import java.util.Scanner;

public class Tablica {

	public static void wczytaj(int[] a)
	{
		Scanner scanner = new Scanner(System.in);

		//1. wczytaj zemienne od usera
		for(int i=0; i< a.length; i++)
		{
			a[i] = scanner.nextInt();
		}

		scanner.close();
	} //koniec funkcji wczytaj(...)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= new int[10];
		wczytaj(a);

		//2. sortuj
		for(int i =a.length-1; i>=2; i--)
		{
			for(int j=0; j<i; j++)
			{
				if(a[j]>a[j+1])
				{
					//zamieñ
					int bok = a[j];
					a[j] = a[j+1];
					a[j+1] = bok;
				}
			}
		}

		//3. wypisz sortowane
		for(int i=0; i< a.length; i++)
		{
			System.out.print(a[i] + ", ");
		}
	}

}
