import java.util.Scanner;

public class J�kacz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		String text= scanner.next();
		int a = text.length();
		System.out.println("Jak bardzo mam si� j�ka�?");
		int b=scanner.nextInt();
		for(int i=0;i<a;i++)
		{
			char c=text.charAt(i);
			for(int j = 0;j<b;j++)
			{
				System.out.print(c);	
			}	
		}
		scanner.close();	
	}

}
