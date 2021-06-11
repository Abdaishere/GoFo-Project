package Users;

import java.util.Vector;

/**
 *  @author  Abdallah Mohmad Abdullatif
 *  this list is used only for storing all the user registerd in the system
 */
public class userList {
	/**
	 * the list of users in the system
	 */
	private final Vector<user> _usersArray = new Vector<user>();

	/**
	 * initialize the list and use the user with id 0 as the null user
	 * used to know when the system is logged out
	 */
	public userList(){
		_usersArray.add(new user(0, null, null));
	}

	/**
	 * login into the system by finding the name and password in the list matching the given ones
	 * @param aName
	 * @param aPassword
	 * @return	the user if found or stay logged out otherwise
	 */
	public user login(String aName, String aPassword) {
		for (int i=0; i<_usersArray.size(); i++){
			if (aName.equals(_usersArray.get(i).getUsername())){
				if (aPassword.equals(_usersArray.get(i).getPassword()))
					return _usersArray.get(i);
			}
		}
		return _usersArray.get(0);
	}

	/**
	 * first check if the username is repeated in the system or not and then add the user
	 * @param aName
	 * @param aPassword
	 * @param aType
	 * @return	true if operation was successful false otherwise
	 */
	public boolean addUser(String aName, String aPassword, account aType) {
		if (checkDuplicate(aName))
			return false;

		if (aType == account.Player)
			_usersArray.add(new player(_usersArray.size(),aName,aPassword));
		else
			_usersArray.add(new PlaygroundOwner(_usersArray.size(),aName,aPassword));

		return true;
	}

	/**
	 * list the account in the system using this format
	 * 		ID
	 * 		Type of the account
	 * 		Username of the account
	 */
	public void listAccounts() {
		for (int i=1; i<_usersArray.size(); i++){
			System.out.println(_usersArray.get(i).getID());
			System.out.println(_usersArray.get(i).getAccountType());
			System.out.println(_usersArray.get(i).getUsername());
		}
	}

	/**
	 * check if the given name exists in the list or not
	 * @param aName
	 * @return	true if found false otherwise
	 */
	public boolean checkDuplicate(String aName) {
		int i =0;
		for (; i<_usersArray.size(); i++){
			if (aName.equals(_usersArray.get(i).getUsername())){
				return true;
			}
		}
		return false;
	}

	/**
	 * logout of the system (chose the null user)
	 * @return	the null user
	 */
	public user Logout(){
		return _usersArray.get(0);
	}
}