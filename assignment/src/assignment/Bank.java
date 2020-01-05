package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Bank implements Serializable {

	private static final long serialVersionUID = -4193850587775763901L;
	private Account_holder[] account_holders = new Account_holder[1000];
	private int counter = 0;// to keep counter in array
	
	
	public void addAccountHolder(Account_holder newCustomer) {
		account_holders[counter] = newCustomer;
		counter++;
	}

	public void printAccountHolderInformation(String account_number) {

		for (int i = 0; i < counter; i++) {
			if (account_holders[i].getAccount_number().equals(account_number)) {
				System.out.print(" account_number: "
						+ account_holders[i].getAccount_number());
				System.out.print(" account_holder_name: "
						+ account_holders[i].getAccount_holder_name());
				System.out.print(" account_type: "
						+ account_holders[i].getAccount_type());
				System.out
						.print(" balance: " + account_holders[i].getBalance());
				System.out
				.println("");
			}
		}
	}

	public void printAllAccountHolderInformation() {

		for (int i = 0; i < counter; i++) {
			System.out.print(" account_number: "
					+ account_holders[i].getAccount_number());
			System.out.print(" account_holder_name: "
					+ account_holders[i].getAccount_holder_name());
			System.out.print(" account_type: "
					+ account_holders[i].getAccount_type());
			System.out.print(" balance: " + account_holders[i].getBalance());
			System.out
			.println("");
		}
	}
	
	public void openBankOperation() {
		FileInputStream fos;
		ObjectInputStream oos;
		try {
			fos = new FileInputStream(new File("bank.txt"));
			oos = new ObjectInputStream(fos);
		    Bank bank= (Bank) oos.readObject();	
		    this.account_holders= bank.account_holders;
		    counter=oos.readInt();
		    oos.close();
		} catch (Exception e) {
			System.err.print("Exception while reading file"+e.getMessage());
		}
	}

	public void closeBankOperation() {
		try {
			FileOutputStream fos = new FileOutputStream(new File("bank.txt"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this);
			oos.writeInt(counter);
			oos.flush();
            oos.close();
		} catch (IOException e) {
			System.err.println("Failed to read file" + e.getMessage());
			e.printStackTrace();
		} 
	}
}
