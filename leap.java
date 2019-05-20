import java.util.Scanner;
class Leap{
public static void main(String[] qwe){
Scanner Scan=new Scanner(System.in);
int yr=Scan.nextInt();
if(yr%4==0)
if(yr%100==0)
if(yr%400==0)
System.out.println(yr+"is leap year");
else
System.out.print("not");
else
System.out.print("leap");
else
System.out.println("not a leap year");
}
}
