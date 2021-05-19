public class Deposit extends Transaction{

	private double amount;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Deposit(double amount) {
		super();
		this.amount = amount;
	}
	
	public void execute()
	{
		System.out.println("Amount deposited: "+amount);
	}
}