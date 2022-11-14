package entities;

public class AccountData {

	private Integer numberAccount;
	private String name;
	private Double amount;
	private Double initialDeposit;
	
	public AccountData(Integer numberAccount, String name, Double initialDeposit) {
		this.numberAccount = numberAccount;
		this.name = name;
		this.initialDeposit = initialDeposit;
	}

	public Integer getNumberAccount() {
		return numberAccount;
	}

		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public Double getInitialDeposit() {
		return initialDeposit;
	}

	public void deposit(Double depositValue) {
		this.amount += depositValue;
	}
	
	public void withdraw(Double withdrawValue) {
		this.amount -= withdrawValue;
	}
}
