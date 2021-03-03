package bankAccount;

public class bankAccountTest {
public static void main(String args[]) {
	
	bankAccountDAO students = new bankAccountDAO();
	
	BankAccount XinLi = new BankAccount();
	XinLi.setName("Xin Li");
	XinLi.setAccountNumber("123456");
	XinLi.setPhone("111111");
	XinLi.setEmail("xin1306028@gmail.com");
	XinLi.setSsn("99999");
	
	students.createUser(XinLi);
	students.readUsers();
}
}
