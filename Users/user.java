package Users;

import Playgrounds.Booking;
import Playgrounds.Playground;

/**
 *  @author  Abdallah Mohmad Abdullatif
 *  the defaul user of the system used only when logedout or as a base class for player and playground owner
 */
public class user {
	protected String _username;
	protected String _password;
	protected double _balance;
	protected account _accountType;
	protected int _iD;

	/**
	 *
	 * @return the username of the account
	 */
	public String getUsername() {
		return this._username;
	}

	/**
	 *
	 * @param aUsername the new username
	 */
	public void setUsername(String aUsername) {
		this._username = aUsername;
	}

	/**
	 *
	 * @return the password of the account
	 */
	public String getPassword() {
		return this._password;
	}

	/**
	 *
	 * @param aPassword the new password
	 */
	public void setPassword(String aPassword) {
		this._password = aPassword;
	}

	/**
	 *
	 * @return	check the balance of the account
	 */
	public double checkBalance() {
		return _balance;
	}

	/**
	 * add balance to the account
	 * @param aBalance	the value to be added
	 */
	public void addBalance(double aBalance) {
		this._balance += aBalance;
	}

	/**
	 *
	 * @return	the type of account used
	 */
	public account getAccountType() {
		return this._accountType;
	}

	/**
	 *
	 * @param aAccountType	change the type of the account
	 */
	public void setAccountType(account aAccountType) {
		this._accountType = aAccountType;
	}

	/**
	 *
	 * @return	get the id of the account
	 */
	public int getID() {
		return this._iD;
	}

	/**
	 *
	 * @param aID the new Id of the account
	 */
	public void setID(int aID) {
		this._iD = aID;
	}

	/**
	 * initialize the user when first created
	 * @param aID
	 * @param aUsername
	 * @param aPassword
	 */
	public user(int aID, String aUsername, String aPassword) {
		_iD= aID;
		_username = aUsername;
		_password = aPassword;
		_balance = 0;

	}

    public boolean send_money(Booking book, Playground playgroundByID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void addplayground(String name, String location, double price, int availableFrom, int availableTo, int P_ID){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean displaypersonalplaygrounds() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
