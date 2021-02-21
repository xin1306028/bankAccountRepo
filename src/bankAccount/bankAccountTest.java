package bankAccount;

public class bankAccountTest {
public static void main(String args[]) {
	BankAccount xinLi = new BankAccount("XinLi","123456789",500,"xin1306028@gmail.com","6509433338");
	xinLi.makingDeposit(600);
	xinLi.withdrawFunds(800);
	xinLi.printAccountInfo();
}
}
