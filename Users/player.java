package Users;

import Playgrounds.playground;
import Playgrounds.playgroundList;
import Playgrounds.booking;
import java.time.LocalDateTime;

public class player extends user {

	public player(int aID, String aUsername, String aPassword) {
		super(aID,aUsername,aPassword);
		this.setAccountType(account.Player);
	}

	public void inviteTeam(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public playgroundList seeRequests() {
		throw new UnsupportedOperationException();
	}

	public void bookPlayground(String aName, String aLoaction, LocalDateTime aDate) {

	}

	public boolean send_money(double aValue, playground aPlayground) {
		if (aValue < aPlayground.getPrice())
			return false;
		this._balance -= aValue;
		aPlayground.getOwner()._balance += aValue;
		return true;
	}

	public void request(LocalDateTime aStart_D, LocalDateTime aEnd_D, playground aPlayground) {
		aPlayground.setRequests(new booking(aStart_D,aEnd_D,this));
	}

	@Override
	public void displayMenu() {
		System.out.println("this is a player");
	}
}