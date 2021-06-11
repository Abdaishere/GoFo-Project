package Users;
import Playgrounds.Playground;
import Playgrounds.PlaygroundList;
import Playgrounds.Booking;
import Playgrounds.Playground;
import Playgrounds.PlaygroundList;
import Playgrounds.Booking;
import static java.lang.Math.abs;


public class player extends user {

	public player(int aID, String aUsername, String aPassword) {
		super(aID,aUsername,aPassword);
		this.setAccountType(account.Player);
	}
     
        @Override
	public boolean send_money(Booking book, Playground aPlayground) {
            
                double value = (abs(book.getEnd()-book.getStart())+1)*aPlayground.getPrice();
                System.out.println("Total Cost is: " + value);
		if ( this._balance < value)
			return false;
		this._balance -= value;
		aPlayground.getOwner().setBalance(value);
		return true;
	}
}