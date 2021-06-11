package Playgrounds;
import java.util.Vector;


public class PlaygroundList {
    
    private Vector<Playground> playgrounds_= new Vector<Playground>();

    
    public Playground getPlaygroundByID(int id){
        for (int i = 0; i < playgrounds_.size(); i++) {
            if(this.playgrounds_.get(i).getPlaygroundID_()==id)
                return this.playgrounds_.get(i);
        }
        return null;
    }

	public PlaygroundList SearchPlaygrounds(String name, String loaction) {
            PlaygroundList playgrounds= new PlaygroundList();
            for (int i = 0; i < playgrounds_.size(); i++) {
                if(this.playgrounds_.get(i).getName().equals(name) && this.playgrounds_.get(i).getLocation().equals(loaction))
                    playgrounds.addPlayGround(this.playgrounds_.get(i));
            }
            return playgrounds;
        }

	public boolean displayplaygrounds() {
            if(!playgrounds_.isEmpty()){
            for (int i = 0; i < this.playgrounds_.size(); i++) {
                this.playgrounds_.get(i).displayPlayground();
            }
            return true;
            }
            return false;
	}

	public void addPlayGround(Playground playground) {
            this.playgrounds_.add(new Playground(playground.getName(), playground.getLocation(), playground.getPrice(), playground.getAvailableFrom_(), playground.getAvailableTo_(), playground.getOwner()));
            this.playgrounds_.get(this.playgrounds_.size()-1).setID(this.playgrounds_.size()-1);
	}
}
