package Users;

import java.util.Vector;
import Users.user;

public class userList {
	private Vector<user> _usersArray = new Vector<user>();

	public userList(){
		_usersArray.add(new player(0, null, null));
	}

	public user login(String aName, String aPassword) {
		for (int i=0; i<_usersArray.size(); i++){
			if (aName.equals(_usersArray.get(i).getUsername())){
				if (aPassword.equals(_usersArray.get(i).getPassword()))
					return _usersArray.get(i);
			}
		}
		return _usersArray.get(0);
	}

	public boolean addUser(String aName, String aPassword, account aType) {
		if (checkDuplicate(aName))
			return false;

		if (aType == account.Player)
			_usersArray.add(new player(_usersArray.size(),aName,aPassword));
		else
			_usersArray.add(new PlaygroundOwner(_usersArray.size(),aName,aPassword));

		return true;
	}

	public void listAccounts() {
		for (int i=1; i<_usersArray.size(); i++){
			System.out.println(_usersArray.get(i).getID());
			System.out.println(_usersArray.get(i).getAccountType());
			System.out.println(_usersArray.get(i).getUsername());
		}
	}

	public boolean checkDuplicate(String aName) {
		int i =0;
		for (; i<_usersArray.size(); i++){
			if (aName.equals(_usersArray.get(i).getUsername())){
				return true;
			}
		}
		return false;
	}

	public user Logout(){
		return _usersArray.get(0);
	}
}