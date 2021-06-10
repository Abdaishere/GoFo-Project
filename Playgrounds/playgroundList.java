package Playgrounds;


public class PlaygroundList {
    
    private Playground[] playgrounds_;
    private int numberOfPlaygrounds_;

    public PlaygroundList() {
        playgrounds_         = new Playground[1000000];
        numberOfPlaygrounds_ = 0;
    }

	public PlaygroundList SearchPlaygrounds(String name, String loaction) {
            PlaygroundList playgrounds= new PlaygroundList();
            for (int i = 0; i < this.numberOfPlaygrounds_ + 1; i++) {
                if(this.playgrounds_[i].getName().equals(name) && this.playgrounds_[i].getLocation().equals(loaction))
                    playgrounds.addPlayGround(this.playgrounds_[i]);
            }
            return playgrounds;
        }

	public void displayplaygrounds() {
            for (int i = 0; i < this.numberOfPlaygrounds_ + 1; i++) {
                this.playgrounds_[i].displayPlayground();
            }
	}

	public void addPlayGround(Playground playground) {
            this.playgrounds_[this.numberOfPlaygrounds_++] = playground;
	}
}
