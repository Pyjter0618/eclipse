
public class WejscieWyjscie {

	public static double mojePolicz()
	{
		double wynik = 100/20; // 5
		System.out.println("Jestem bez wejœcia" );
		return wynik;
	}
	public static double mojePolicz(int a)
	{
		double wynik = a/20.0; // 5
		System.out.println("Jestem w funkcji z weijœciem" );
		return wynik;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starat programu");
		double w = mojePolicz(19);
		System.out.println("Wynik po funkcji: " + w);
		System.out.println("Koniec programu");
	}

}
