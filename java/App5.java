/*
	Name: Stamatina Micha
	Student Number: 3240134
*/

class App5 {
	
	public static void main(String args[]){
		int x = 0;
		int y = 1;
		int n = Integer.parseInt(args[0]);
		boolean boo = false;
		System.out.println("Fibonacci number = 0");
		if (n==0){
			System.out.println("0 is a fibonacci number");
			boo=true;
		}
		while (x<n){
			int temp = y;
			y = x+y;
			x=temp;
			System.out.println("Fibonacci number = "+x);
			if (x==n){
				System.out.println(n+" is a fibonacci number");
				boo=true;
			}
		}if (boo==false){
			System.out.println(n+" is not a fibonacci number");
		}		
	}
}

