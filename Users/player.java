package Users;
import Playgrounds.Playground;
import Playgrounds.Booking;
import static java.lang.Math.abs;

/**
 *  @author  20190329    Abdallah Mohmad Abdullatif
 *  the player user used to store the balance of the player and store his money
 */
public class player extends user {

	/**
	 * inslize the player
	 * @param aID
	 * @param aUsername
	 * @param aPassword
	 */
	public player(int aID, String aUsername, String aPassword) {
		super(aID,aUsername,aPassword);
		this.setAccountType(account.Player);
	}

	/**
	 * send money to the owner of a playground
	 * @param book	the booking the was place
	 * @param aPlayground	for which playground
	 * @return	true if transaction was complete and false otherwise
	 */
        @Override
	public boolean send_money(Booking book, Playground aPlayground) {
            
                double value = (abs(book.getEnd()-book.getStart())+1)*aPlayground.getPrice();
                System.out.println("Total Cost is: " + value);
		if ( this._balance < value)
			return false;
		this._balance -= value;
		aPlayground.getOwner().addBalance(value);
		return true;
	}
}