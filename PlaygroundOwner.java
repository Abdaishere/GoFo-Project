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
public class PlaygroundOwner {
    
    private String name_;
    private String phone_;
    private PlaygroundList playgrounds_;
    
    public PlaygroundOwner(){
        this.name_       = "";
        this.phone_      = "";
        this.playgrounds_= new PlaygroundList();
        
    }
    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public String getPhone_() {
        return phone_;
    }

    public void setPhone_(String phone_) {
        this.phone_ = phone_;
    }
    
    public void addplayground(String name, String location, double price, int availableFrom, int availableTo) {
        
        this.playgrounds_.addPlayGround(new Playground(name, location, price, availableFrom, availableTo));
    }

    public void displaypersonalplaygrounds() {
        this.playgrounds_.displayplaygrounds();
    }
}
