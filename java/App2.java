/*
	Name: Stamatina Micha
	Student Number: 3240134
*/

import java.util.Scanner;

class App2 {

	/*
	* 	Returns the mathematical combinations function C(n, k)
	*/
	static int combinations(int n, int k) {
		
		return factorial(n)/(factorial(k)*factorial(n-k));
	}


	/*
	* 	Returns the factorial of n
	*/
	static int factorial(int n) {
		int fact=1;
		if (n==0){
		}else{
			for(int i =2;i<=n;i++){
				fact=fact*i;
			}
		}return fact;
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Give me 1st integer (make sure it's >0!): ");
		int n = Integer.parseInt(in.nextLine());
		System.out.print("Give me 2nd integer (make sure it's >0, but <= than the 1st!): ");
		int k = Integer.parseInt(in.nextLine());
		if(n<=0||k<=0||k>n){
			System.out.println("You didn't follow my instructions!!!");
		}else{
			int comb = combinations(n,k);
			System.out.println("The number of combinations is: "+comb);
		}

	}

} // combinations