package bankAccount;



import java.util.ArrayList;


public class bankAccountDAO {

		ArrayList<BankAccount> list = new ArrayList<BankAccount>();
		
	    // create method: add one new customer 
	    public void createUser(BankAccount newUser) {
	         list.add(newUser);
	    }
	    
	    // read method: read all users
	    public void readUsers() {
	    	for(BankAccount user: list) {
	    		System.out.println("User name: "+user.getName());
				System.out.println("User account number :" +user.getAccountNumber());
				System.out.println("User phone number :" + user.getPhone());
				System.out.println("User email :" +user.getEmail());
				System.out.println("User ssn :" +user.getSsn());
				System.out.println("*************************");
				System.out.println();
	    	}
	    }
	    
	    
	    //update method: update phone number
	    public void updatePhone(BankAccount user,String newPhoneNumber) {
			user.setPhone(newPhoneNumber);
		}
		
	    
		//Delete Method  --> Delete a customer
		public void deleteUser(BankAccount user) {
			list.remove(user);
		}
		
}		
		