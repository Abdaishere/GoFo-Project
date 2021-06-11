package Playgrounds;

/**
 * @author  Mohamed Essam Said Hanafi
 * @version 1.0
 * a class that hold a complaint for a playground and who complained and what was the reason
 */
public class complaint {
	private int _playerID;
	private String _complaint;

	/**
	 *
	 * @return the player who complained
	 */
	public int getPlayerID() {
		return this._playerID;
	}

	/**
	 *
	 * @param aPlayerID set the player who complained
	 */
	public void setPlayerID(int aPlayerID) {
		this._playerID = aPlayerID;
	}

	/**
	 *
	 * @return get the message of the complaint
	 */
	public String getComplaint() {
		return this._complaint;
	}

	/**
	 *
	 * @param aComplaint set the message of the complaint
	 */
	public void setComplaint(String aComplaint) {
		this._complaint = aComplaint;
	}


}