import java.util.Scanner;
class DigitCount{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("enter the value of n:");
int n=scan.nextInt();
int c=0;
while(n!=0){
n=n/10;
c++;
}
System.out.println(c);
}
}
