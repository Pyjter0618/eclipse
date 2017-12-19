import java.util.Random;

public class LosowanieTablice {

	public static void losujLiczby(int[] liczby)
	{
		losujLiczby( liczby, 0);
	}
	public static void losujLiczby(int[] liczby, int start)
	{
		Random generator = new Random();
		for(int i=0; i< liczby.length; i++)
		{
			liczby[i] = ( generator.nextInt() % 10 );
			if(liczby[i] < 0) liczby[i] *= -1;
			liczby[i] += start;
		}
	}

	public static void wypisz(int[] liczby)
	{
		for(int i=0; i< liczby.length; i++)
		{
			System.out.print(liczby[i] + ", ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] liczby = new int[10000];
		//1. losowanie liczb
		losujLiczby( liczby, 100 );

		//2. cos z nimi, np. sortowanie

		//3. wypisz na ekranie
		wypisz( liczby );

	}

}
