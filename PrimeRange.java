import java.util.Scanner;
class PrimeRange{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
int s1, s2,count = 0, i, j;
		System.out.print("Enter the lower limit : "); 
		s1 = scan.nextInt();
		System.out.print("Enter the upper limit :"); 
		s2 = scan.nextInt();
		System.out.println("Prime numbers between given range are :");

		for(i = s1; i <= s2; i++)
		{
			for( j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					count = 0;
					break;
				}
				else
				{
					count = 1;
				}
			}
			if(count == 1)
			{
				System.out.println(i);
			}
		}
	}
}
