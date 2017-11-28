import java.util.Scanner;

public class J¹kacz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		String text= scanner.next();
		int a = text.length();
		System.out.println("Jak bardzo mam siê j¹kaæ?");
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
