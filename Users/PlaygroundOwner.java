package Users;

import Playgrounds.Playground;
import Playgrounds.PlaygroundList;

public class PlaygroundOwner extends user{
    
    private PlaygroundList playgrounds_;
    
    
    public PlaygroundOwner(int aID, String aUsername, String aPassword) {
        super(aID, aUsername, aPassword);
	this.setAccountType(account.playgroundOwner);
     
        this.playgrounds_= new PlaygroundList();
    }
    
    @Override
    public void addplayground(String name, String location, double price, int availableFrom, int availableTo) {
        
        this.playgrounds_.addPlayGround(new Playground(name, location, price, availableFrom, availableTo , this));
    }

    @Override
    public boolean displaypersonalplaygrounds() {
        if(this.playgrounds_.displayplaygrounds())
            return true;
        return false;
    }
}
