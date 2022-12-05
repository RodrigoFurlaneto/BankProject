package entities;

public class PersonalAccount extends Account{

	public PersonalAccount() {
		super();
	}

	@Override
	public void deposit(double value) {
		balance += value;
	}

	@Override
	public void withdraw(double value) {
		balance -= value * 1.05;
	}
}
