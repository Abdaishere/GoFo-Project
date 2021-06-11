package Users;

import Playgrounds.Playground;
import Playgrounds.PlaygroundList;

/**
 *  @author  Abdallah Mohmad Abdullatif
 * an owner user to store his balance and add his playgrounds to
 */

public class PlaygroundOwner extends user{
    /**
     * the list of personal playgrounds
     */
    private final PlaygroundList playgrounds_;

    /**
     * initialize the playground Owner
     * @param aID
     * @param aUsername
     * @param aPassword
     */
    public PlaygroundOwner(int aID, String aUsername, String aPassword) {
        super(aID, aUsername, aPassword);
	this.setAccountType(account.playgroundOwner);
     
        this.playgrounds_= new PlaygroundList();
    }

    /**
     *
     * @return  all personal playgrounds
     */
    public PlaygroundList getPlaygrounds_() {
        return playgrounds_;
    }

    /**
     * add a playground to the system and store it in the owners list of personal playgrounds
     * @param name
     * @param location
     * @param price
     * @param availableFrom
     * @param availableTo
     * @param P_ID
     */
    @Override
    public void addplayground(String name, String location, double price, int availableFrom, int availableTo, int P_ID) {
        
        this.playgrounds_.addPlayGround(new Playground(name, location, price, availableFrom, availableTo , this, P_ID));
    }

    /**
     * see all the playground that the owner has
     * @return true if he has at least one playground false otherwise
     */
    @Override
    public boolean displaypersonalplaygrounds() {
        return this.playgrounds_.displayplaygrounds();
    }
}
