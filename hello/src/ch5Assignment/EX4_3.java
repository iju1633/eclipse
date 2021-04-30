package ch5Assignment;

class Account {

	String name;
	int balance;

	public Account(String name) {
		this.name = "철수/영희";
		balance = 0;

		this.name = name;
		System.out.println("새로운 " + name + " 계좌가 생성되었습니다.");
	}

	public void withdraw(int amount) {
		if (balance < amount) { // balance가 인출하려는 값보다 적게 있으면 인출 못하므로 호출 시점에서 시스템이 끝나게 함
			System.out.println("잔금이 부족합니다.");
			System.exit(0);
		}
		balance -= amount;
		System.out.println(amount + "원 인출");
	}

	public void deposit(int amount) {
		balance += amount;
		System.out.println(amount + "원 저축");
	}

	public void transfer(int amount, Account account) { // 현재 계좌에서 매개변수의 계좌로 amount만큼 전송
		if (balance < amount) { // balance가 전송하려는 값보다 적게 있으면 전송 못하므로 호출 시점에서 시스템이 끝나게 함
			System.out.println("잔금이 부족합니다.");
			System.exit(0);
		}
		balance -= amount;
		account.balance += amount;
		System.out.println(this.name + "가 " + account.name + "에게 " + amount + "원 이체함");
	}

	public void print() {
		System.out.println("고객 " + this.name + " 계좌잔고=" + balance + "원");
	}
}

public class EX4_3 {

	public static void main(String[] args) {

		Account account1 = new Account("철수");
		account1.deposit(50000);
		Account account2 = new Account("영희");
		account2.deposit(100000);

		account1.print();
		account2.print();
		account2.transfer(50000, account1);
		account1.print();
		account2.print();

	}

}
