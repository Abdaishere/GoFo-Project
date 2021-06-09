package Users;

import Users.account;

public class user {
	protected String _username;
	protected String _password;
	protected double _balance;
	protected account _accountType;
	protected int _iD;

	public String getUsername() {
		return this._username;
	}

	public void setUsername(String aUsername) {
		this._username = aUsername;
	}

	public String getPassword() {
		return this._password;
	}

	public void setPassword(String aPassword) {
		this._password = aPassword;
	}

	public double checkBalance() {
		return _balance;
	}

	public void setBalance(double aBalance) {
		this._balance = aBalance;
	}

	public account getAccountType() {
		return this._accountType;
	}

	public void setAccountType(account aAccountType) {
		this._accountType = aAccountType;
	}

	public int getID() {
		return this._iD;
	}

	public void setID(int aID) {
		this._iD = aID;
	}

	public user(int aID, String aUsername, String aPassword) {
		_iD= aID;
		_username = aUsername;
		_password = aPassword;
		_balance = 0;

	}

	public void displayMenu() {
		throw new UnsupportedOperationException();
	}

}