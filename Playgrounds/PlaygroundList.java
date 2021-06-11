package Playgrounds;
import java.util.Vector;

/**
 * @author  Mohamed Essam Said Hanafi
 * List all the playground in the system or for an owner to easily add new playgrounds and search in them
 */
public class PlaygroundList {
    
    private final Vector<Playground> playgrounds_= new Vector<Playground>();

    /**
     * search the playgrounds by the id given
     * @param id the id of the playground to search for
     * @return a playground with the id of null if it doesn't exits
     */
    public Playground getPlaygroundByID(int id){
        for (int i = 0; i < playgrounds_.size(); i++) {
            if(this.playgrounds_.get(i).getPlaygroundID_()==id)
                return this.playgrounds_.get(i);
        }
        return null;
    }

    /**
     * search the playground using the location and name of them
     * @param name      name of the playground
     * @param loaction  the location of that playground
     * @return  list of playgrounds with the location and name given
     */
	public PlaygroundList SearchPlaygrounds(String name, String loaction) {
        PlaygroundList playgrounds = new PlaygroundList();
        for (int i = 0; i < playgrounds_.size(); i++) {
            if (this.playgrounds_.get(i).getName().equals(name) && this.playgrounds_.get(i).getLocation().equals(loaction))
                playgrounds.addPlayGround(this.playgrounds_.get(i));
        }
        return playgrounds;
    }

    /**
     * display the playgrounds one by one
      * @return true if there are playground to display false otherwise
     */
	public boolean displayplaygrounds() {
            if(!playgrounds_.isEmpty()){
            for (int i = 0; i < this.playgrounds_.size(); i++) {
                this.playgrounds_.get(i).displayPlayground();
            }
            return true;
            }
            return false;
	}

    /**
     * add a playground to the list
     * @param playground    the playground to add
     */
	public void addPlayGround(Playground playground) {
            this.playgrounds_.add(playground);
	}
}
