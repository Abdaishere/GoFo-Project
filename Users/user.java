package Users;

import Playgrounds.Booking;
import Playgrounds.Playground;

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

    public boolean send_money(Booking book, Playground playgroundByID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addplayground(String playgroundName, String playgroundLocation, double playgroundPrice, int playgroundFrom, int playgroundTo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean displaypersonalplaygrounds() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
