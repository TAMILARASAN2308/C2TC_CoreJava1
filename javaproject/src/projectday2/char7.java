package projectday2;
import java.util.Scanner;

public class char7 {
	public static void main(String[] args) {
	System.out.println("Arithmetic operators");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number1:");
	int a=sc.nextInt();
	System.out.println("Enter the number2:");
	int b=sc.nextInt();
	String ch=sc.nextLine();
	System.out.println("sum:"+(a+b));
	System.out.println("difference:"+(a-b));
	System.out.println("product:"+(a*b));
	System.out.println("quotient:"+(a/b));
	System.out.println("remainder:"+(a%b));

}


}
