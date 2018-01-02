import java.util.Scanner;

public class Dodawanie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. spytaj jak du¿¹ liczbê dodawaæ
		Scanner s = new Scanner(System.in);
		System.out.print("Jak du¿a liczba: ");
		int rozmiar = s.nextInt();
		
		// 2. wczytaj liczbê a i b do tablic
		byte[] a = new byte[rozmiar];
		byte[] b = new byte[rozmiar];
		byte[] c = new byte[rozmiar+1];
		
		for(int i = rozmiar-1; i>=0; i--)
		{
			System.out.print("a: Podaj cyfrê nr: "+i+": ");
			a[i] = s.nextByte();
		}
		
		for(int i = rozmiar-1; i>=0; i--)
		{
			System.out.print("b: Podaj cyfrê nr: "+i+": ");
			b[i] = s.nextByte();
		}
		
		// 3. dodaj metod¹ w s³upku
		byte p = 0;
		for(int i=0; i<rozmiar; i++)
		{
			c[i] = (byte) (a[i] + b[i]+ p);
			if(c[i] > 9)
			{
				p = 1;
				c[i] = (byte) (c[i] % 10);
			} else
			{
				p = 0;
			}
		
		}
		
		// 3. uwzglêdnij ostatnie przeniesienie
		c[rozmiar] = p;
		// 4. wypisz wynik
		for(int i=rozmiar-1; i>=0; i--)
		{
			System.out.print(c[i]);
		}
	
	}

}
