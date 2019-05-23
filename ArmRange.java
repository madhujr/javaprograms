import java.util.Scanner;
class ArmRange{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
  int num1, num2;
      System.out.println("Enter the first number ::");
      num1 = scan.nextInt();
      System.out.println("Enter the second number ::");
      num2 = scan.nextInt();
for (int i = num1; i<num2; i++){
         int check, rem, sum = 0;
         check = i;
         while(check != 0) {
            rem = check % 10;
            sum = sum + (rem * rem * rem);
            check = check / 10;
         }
         if(sum == i){
            System.out.println(""+i+" is an Armstrong number.");
         }
      }
   }
}
