package ch7Assignmen;


class NegativeBalanceException extends Exception {
	public NegativeBalanceException() {
	}
}

class BankAccount {

	int balance;

	public BankAccount() {
		balance = 0;
	}

	public void deposit(int amount) {
		balance += amount;
		System.out.println("예금: " + amount + "원 입금되었습니다.");
	}

	public void withdraw(int amount) throws NegativeBalanceException {
		if (balance < amount) {
			System.out.print("출금: " + amount + "원 ");
			throw new NegativeBalanceException();
		}
		balance -= amount;
		System.out.println("출금: " + amount + "원 출금되었습니다.");
	}
}

public class EX4_4 {

	public static void main(String[] args) throws NegativeBalanceException {

		BankAccount account = new BankAccount();
		try { // 예와 같이 출력하기 위한 설정
			
			account.deposit(20000);
			account.withdraw(15000);
			account.withdraw(10000);
		} catch (NegativeBalanceException e) {
			System.out.println("잔액이 부족합니다.");
		}

	}

}
