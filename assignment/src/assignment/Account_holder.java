
package assignment;

import java.io.Serializable;

public class Account_holder  implements Serializable {

	private static final long serialVersionUID = -1046423331373315067L;

	// eg. SB20001 / CA2380842
	// account number has characters in it hence taken String
	// instances variables are private, not allowed to set from outside of class,
	//providing getter-setter methods to get and set values from outside of class.
	private String account_number;
	
	private String account_holder_name;
	
	// if account type are fixed, enum can be used here, but for program string works fine.
	private String account_type;
	
	// for money always tak BigDecimal, for program double works fine.
	private double balance;
	
	//default constructor
	public Account_holder(){
		super();
	}

	
	//constuctor overload
	public Account_holder(String account_number, String account_holder_name,
			String account_type, double balance) {
		super();
		this.account_number = account_number;
		this.account_holder_name = account_holder_name;
		this.account_type = account_type;
		this.balance = balance;
	}



	//getter setter methods to access from outside
	public String getAccount_number() {
		return account_number;
	}


	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}


	public String getAccount_holder_name() {
		return account_holder_name;
	}


	public void setAccount_holder_name(String account_holder_name) {
		this.account_holder_name = account_holder_name;
	}


	public String getAccount_type() {
		return account_type;
	}


	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	

	
}
