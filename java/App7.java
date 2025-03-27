/*
	Name: Stamatina Micha
	Student Number: 3240134
*/

import java.util.Scanner;

class App7  {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Creating an account\nAccount Number : ");
		String idn = in.nextLine();
		System.out.print("Customer Name : ");
		String nam = in.nextLine();
		System.out.print("Initial balance : ");
		double bal = Double.parseDouble(in.nextLine());

		
    	Account Account1 = new Account (nam,idn,bal);

    		
		for (;;){
			System.out.println ("\n---------------");
			System.out.println ("1. Deposit");
			System.out.println ("2. Withdraw");
			System.out.println ("3. Account Details");
			System.out.println ("4. Add Interest");
			System.out.println ("0. Exit");
			System.out.println ("---------------");
			System.out.print ("> ");
			int choice = in.nextInt();
			if (choice == 1){
				
				System.out.println("Deposit . . .");
				System.out.println(Account1.toString());
				System.out.print("Amount: ");
				double am = Double.parseDouble(in.nextLine());
				Account1.Deposit(am);
				System.out.println("New Balance   : "+Account1.getBalance());

			}
			else if (choice == 2) {
				
				System.out.println("Withdraw . . .");
				Account1.toString();
				System.out.print("Amount: ");
				double am = Double.parseDouble(in.nextLine());
				Account1.Withdraw(am);
				System.out.println("New Balance   : "+Account1.getBalance());
			}
			else if (choice == 3) {
				
				System.out.println(Account1.toString());
			}
			else if (choice == 4) {
				
				System.out.println("Add Interest");
				System.out.println(Account1.toString());
				Account1.addInterest();
				System.out.println("New Balance :"+Account1.getBalance());
			}
			else if (choice == 0) break;
		}

   }

}