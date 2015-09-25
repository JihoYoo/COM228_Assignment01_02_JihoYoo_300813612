
public class BankAccount {

	// PRIVATE INSTANCE VARIABLES ++++++++++++++++++++++++++++++
	private String _accountNumber;
	private String _ownersName;
	private int _balance;
	
	// PROPERTIES +++++++++++++++++++++++++++++++++++++++++++++++
	public String getAccountNumber(){
		return this._accountNumber;
	}
	
	public void setAccountNumber(String accountNumber){
		this._accountNumber = accountNumber;
	}
	
	public String getOwnersName(){
		return this._ownersName;
		
	}
	
	public void setOwnersName(String ownersName){
		this._ownersName = ownersName;
	}
	
	public int getBalance(){
		return this._balance;
	}
	
	public void setBalance(int balance){
		this._balance = balance; 
	}
	
	
	
	// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++++++
	
	public BankAccount(String accountNumebr, String ownersName, int balance){
		this._initialize("Unknown", "Unknown", balance);
	}
	
	
	// PRIVATE METHODS +++++++++++++++++++++++++++++++++++++++++++
	private void _initialize(String accountNumber, String ownersName, int balance){
		this.setAccountNumber(accountNumber);
		this.setOwnersName(ownersName);
		this.setBalance(balance);
	}
	
	// PUBLIC METHODS +++++++++++++++++++++++++++++++++++++++++++
	
			public void getAccountInfo(){
		    System.out.printf("*Your Account Number: %s\n*Your Name: %s\n*Your Balance: $%s", 
			this.getAccountNumber(),this.getOwnersName(),
			this.getBalance());

}
}
