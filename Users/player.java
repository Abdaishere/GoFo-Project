package Users;
import Playgrounds.Playground;
import Playgrounds.PlaygroundList;
import Playgrounds.Booking;
import Playgrounds.Playground;
import Playgrounds.PlaygroundList;
import Playgrounds.Booking;


public class player extends user {

	public player(int aID, String aUsername, String aPassword) {
		super(aID,aUsername,aPassword);
		this.setAccountType(account.Player);
	}

	public boolean send_money(double aValue, Playground aPlayground) {
		if (aValue < aPlayground.getPrice())
			return false;
		this._balance -= aValue;
		aPlayground.getOwner()._balance += aValue;
		return true;
	}

	@Override
	public void displayMenu() {
		System.out.println("this is a player");
	}
        
        @Override
	public boolean send_money(Booking book, Playground aPlayground) {
            
                double value = (book.getEnd()-book.getStart())*aPlayground.getPrice();
		if ( value < aPlayground.getPrice())
			return false;
		this._balance -= value;
		aPlayground.getOwner()._balance += value;
		return true;
	}
}