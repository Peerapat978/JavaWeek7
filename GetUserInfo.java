package week7;

import java.util.Scanner;
public class GetUserInfo {
	public static void main() {
		String name;
		int age;
		int a,b,c;
		a=5;
		b=10;
		c=20;
		int total=a*b+c;//5*10+20=
		int total2=a+b*c;//5+10*20=
		double total3=a/b*c;//5/10*20=
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter your name >> ");
		name = inputDevice.nextLine();
		System.out.print("Please enter your age >> ");
		age = inputDevice.nextInt();
		System.out.print("Your name is "+name);
		System.out.println("Your age is "+age);
		System.out.println("Total a*b+c = "+total);
		System.out.println("Total a+b*c = "+total);
		System.out.println("Total a/b*c = "+total);
		
	}

}
