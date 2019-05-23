import java.util.Scanner;
class SumArray{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("enter the of n");
System.out.println("enter the of k");
int n=scan.nextInt();
int k=scan.nextInt();
int[] arr=new int[n];
int sum=0;
for(int i=0;i<n;i++){
int temp=scan.nextInt();
arr[i]=temp;
}
for(int j=0;j<k;j++){
sum=sum+arr[j];
}
System.out.println(sum);
}
}
