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
    public void addplayground(Playground p) {
        
        this.playgrounds_.addPlayGround(p);
    }

    @Override
    public boolean displaypersonalplaygrounds() {
        if(this.playgrounds_.displayplaygrounds())
            return true;
        return false;
    }
}
