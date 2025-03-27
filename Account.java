/*
	Name: Stamatina Micha
	Student Number: 3240134
*/

class Account {

   	final double epitokio = 1.5/100;
	private String name;
	private String idNum;
	double balance;


   	

   	Account (String name,String idNum,double balance) {
		
		this.name=name;
		this.idNum=idNum;
		this.balance=balance;
   	}

   	double Deposit (double Amount){
		if (Amount>0){
		this.balance=this.balance+Amount;}
		else{
			System.out.println("Error: Deposit Amount is invalid");
		}
		return this.balance;
   	}

	double Withdraw (double Amount) {
		if(Amount>0|this.balance-Amount<0){
		this.balance=this.balance-Amount;
		}
		if(Amount<=0){
			System.out.println("Error: Withdraw Amount is invalid");
		}
		if (this.balance-Amount<0){
			System.out.println("Error: Insufficient funds");
		}
		return this.balance;
   	}

	double getBalance (){
		return this.balance;
		
	}

   	double addInterest (){
		
		this.balance=this.balance +this.balance*epitokio;
		return this.balance;
	}

   	public String toString(){
		this.getBalance();
		String bal=String.format("%.2f",this.balance);
		return "Account Number : "+this.idNum+"\nCustomer Name  : "+this.name+"\nBalance         : "+bal;

   	}
}
