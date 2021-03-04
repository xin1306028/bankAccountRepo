package bankAccount;
import java.sql.*;
import java.util.ArrayList;


public class bankAccountDAO {

		
		
		String DELETE = "DELETE FROM usertable WHERE name = ?";
	    String FINDUSER = "SELECT * FROM usertable WHERE accountnumber = ?";
		String INSERT = "INSERT INTO usertable(accountnumber,name, phone, email,ssn) VALUES(?, ?, ?,?,?)";
		String UPDATE = "UPDATE usertable SET name = ?, phone = ?, email = ? WHERE accountnumber = ?";
		
		Connection con = connectingDB.getConnection();
	
        
	    // create method: add one new customer to the user table
	    public boolean insertUser(BankAccount account) {
        	
	        try{
	        	
	        	PreparedStatement st = con.prepareStatement(INSERT);
	        	st.setString(1, account.getAccountNumber());
	        	st.setString(2, account.getName());
	        	st.setString(3, account.getPhone());
	        	st.setString(4, account.getEmail());
	        	st.setString(5, account.getSsn());
	        	int success = st.executeUpdate();
	        	if(success == 1) {
	        		System.out.println("Successfully add one user");
	        		return true;
	        	}
	        	
	        }catch(SQLException e) { 
	            e.printStackTrace(); 
	        } 	    
	         
	        return false;
	    }
	    
	    
	    
	    // read method: read user with user id
	    public void findUser(BankAccount account) {
	    	try {
	    		PreparedStatement st = con.prepareStatement(FINDUSER);
				st.setString(1, account.getAccountNumber());
				int success = st.executeUpdate();
				if(success == 1) {
					System.out.println("Successfully find a user, User's account is  " + account.getAccountNumber());
					System.out.println("User's name is: " + account.getName());
					System.out.println("User's email is: " + account.getEmail());
					System.out.println("User's phone is: " + account.getPhone());
					System.out.println("User's SSN is: " + account.getSsn());
				    
				}
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
			 
	    	
	    }
	    
	    
	    
	    //update method: update
	    public boolean updateUser(BankAccount account) {
	    	 try{
	    		 
	    		 PreparedStatement st = con.prepareStatement(UPDATE);
		        	st.setString(1, account.getAccountNumber());
		        	st.setString(2, account.getName());
		        	st.setString(3, account.getPhone());
		        	st.setString(4, account.getEmail());
		        	st.setString(5, account.getSsn());
		        	int success = st.executeUpdate();
		        	if(success == 1) {
		        		System.out.println("Successfully update user's information!");
		        		return true;
		        	}
		        	
		        }catch(SQLException e) { 
		            e.printStackTrace(); 
		        } 	    
		         return false;
		}
		
	    
		//Delete Method  --> Delete a user from user table
		public boolean deleteUser(BankAccount account) {
			try {
				
				PreparedStatement st = con.prepareStatement(DELETE);
				st.setString(1, account.getAccountNumber());
				int success = st.executeUpdate();
				if(success == 1) {
					System.out.println("Successfully delete a user, user's account is  " + account.getAccountNumber());
				    return true;
				}
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return false;
		}
		
}		
		