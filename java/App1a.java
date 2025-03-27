/*
	Name: Stamatina Micha
	Student Number: 3240134
*/

import java.util.Scanner;

class App1a {
	
		
    

	private boolean isPrime(int a){
		for(int i =2;i<a;i++){
			if (a%i==0){
				return false;
			}
		}
		return true;


	}
		
  	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Give me an integer: ");
		int a = Integer.parseInt(in.nextLine());
		App1a check = new App1a();
		if (check.isPrime(a)){
			System.out.println(a + " is a prime number");
		} else{
			System.out.println(a + " is NOT a prime number");
		}
     	
   	}

}

