package entities;

public class BusinessAccount extends Account{
	
	public BusinessAccount() {
		super();
	}

	@Override
	public void deposit(double value) {
		balance += value;
	}

	@Override
	public void withdraw(double value) {
		balance -= value * 1.1;
	}
}
