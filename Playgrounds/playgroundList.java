/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofo;

/**
 *
 * @author hp
 */
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
                if(this.playgrounds_[i].getName()==name && this.playgrounds_[i].getLocation()==loaction)
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
