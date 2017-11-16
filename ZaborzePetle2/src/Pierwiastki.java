
public class Pierwiastki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mnoznik=1;
		double suma=1;
		System.out.println((int)suma);
		for(int i=2; i<=10; i++)
		{
			suma=Math.sqrt(suma+(double)1/i*mnoznik);
			System.out.print(i+", ");
			System.out.println(mnoznik);
			mnoznik=mnoznik*(-1);
		}
		System.out.println("");
		System.out.println(suma);
	}

}
