package bankAccount;

public class BankAccount {
	

		private String name;
		private String accountNumber;
		private int balance;
		private String email;
		private String phone;
		
	    public BankAccount(String name, String accountNumber, int balance, String email, String phone ) {
		   this.name = name;
		   this.accountNumber = accountNumber;
		   this.balance = balance;
		   this.email = email;
		   this.phone = phone;
	    }
	    
	    
	    public void makingDeposit(int amount) {
	    	balance = balance + amount;
	    	System.out.println("after depositing " + amount + " my new balance is " +balance);
	    }
	    
	    
	    public  void withdrawFunds(int amount) {
	    	if(amount <= balance) {
	    	   balance = balance - amount;
	           System.out.println("after withdraw " + amount + " my new balance is " +balance);
	        }else {
	        	System.out.println("Insufficient balance.");
	        }
	    }
	    public void printAccountInfo() {
	    	System.out.println("Here is the account information:");
	    	System.out.println("Customer name is " + name);
	    	System.out.println("Account number is " + accountNumber);
	    	System.out.println("Account balance is " + balance);
	    	System.out.println("Email address is " + email);
	    	System.out.println("Phone number is " + phone);
	    }
	}


