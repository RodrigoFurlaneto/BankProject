package entities;

abstract class Account {

	protected Double balance = 0.0;

	public Account() {
		super();
	}

	public Double getBalance() {
		return balance;
	}

	abstract void deposit(double value);
	
	abstract void withdraw(double value);
}
