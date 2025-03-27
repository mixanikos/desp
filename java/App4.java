/*
	Name: Stamatina Micha
	Student Number: 3240134
*/

import java.util.Scanner;

class App4 {
	
	static double diakrinousa (double a,double b,double c){
		double diakr =  Math.pow(b,2) -4*a*c;
		return diakr;

	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double a = Double.parseDouble(in.nextLine());
		System.out.print("Enter the second number: ");
		double b = Double.parseDouble(in.nextLine());
		System.out.print("Enter the third number: ");
		double c = Double.parseDouble(in.nextLine());
		double diakr = diakrinousa(a,b,c);
		if(diakr<0){
			System.out.println("There are no real values for the quadratic equation.");
		}else{
			double x1 = (-b + Math.sqrt(diakr))/(2*a);
			x1 = Math.round(x1*Math.pow(10,3))/Math.pow(10,3);
			double x2 = (-b - Math.sqrt(diakr))/(2*a);
			x2 = Math.round(x2*Math.pow(10,3))/Math.pow(10,3);
			System.out.println("The first solution is : "+x1);
			System.out.println("The second solution is : "+x2);
		}
		
	}
}
