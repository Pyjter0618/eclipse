import java.util.Scanner;

public class PetlaDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number;
		int sum = 0;
		double sr = 0;
		int i = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE; 
		do
		{
			System.out.print("Podaj liczbê: ");
			number = scanner.nextInt();
			sum = sum+number;
			System.out.println("suma to:+" + sum);
			i++;
			if((number > max) && (number != 0) )
			{
				max = number;
			}
			if((number < min) && (number != 0) )
			{
				min = number;
			}
			sr = (double) sum/i;
			System.out.println("œrednia wynosi" + sr);
		} while( number != 0);
		System.out.println("min wynosi:" + min);
		System.out.println("max wynosi:" + max);
		System.out.println("suma wynosi:" + sum);
		System.out.println("Srednia wynosi:" + sr);
		scanner.close();
	}

}
