/*
	Name: Stamatina Micha
	Student Number: 3240134
*/

import java.util.Scanner;

class App3 {
	
	static int factorial(int n) {
		int fact=1;
		long fact_long=1L;
		if (n==0){
		}else{
			for(int i =2;i<=n;i++){
				fact_long=fact_long*i;
				if (fact_long>Integer.MAX_VALUE){
					fact=-1;
					break;
				}else{
					fact=(int)fact_long;
				}
			}
		}return fact;
	}
	
	static int combinations(int n, int k) {
		
		return factorial(n)/(factorial(k)*factorial(n-k));
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
			if (factorial(n)==-1){
				System.out.println("Error: Overflow occured. Integer out of bounds.");
			}else{
				int comb = combinations(n,k);
				System.out.println("The number of combinations is: "+comb);
			}
		}
	}
		
}


