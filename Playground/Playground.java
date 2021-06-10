/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofo;


public class Playground {
    
    private String name_;
    private String location_;
    private Booking[] books_;
    private int numberOfBooks;
    private double price_;
    private PlaygroundOwner owner_;
    private double size_;
    private int playgroundID_;
    private boolean[][] timeSlots_;
    private int availableFrom_;
    private int availableTo_;
    
    public Playground(String name, String location, double price, int availableFrom, int availableTo) {
        this.name_          = name_;
        this.location_      = location_;
        this.price_         = price_;
        this.availableFrom_ = availableFrom_;
        this.availableTo_   = availableTo_;
        this.books_         = new Booking[30*(availableTo-availableFrom+1)];
        this.timeSlots_     = new boolean[30][availableTo-availableFrom+1];
        this.numberOfBooks  = 0;
        
        for (int day = 0; day < 30; day++) {
            for (int hour = 0; hour < availableTo-availableFrom+1; hour++)
                timeSlots_[day][hour]= true;
        }
        
    }

    public boolean[][] getTimeSlots_() {
        return timeSlots_;
    }

    public void changeTimeSlots_(Booking book) {
        
        for (int hour = (book.getStart()- this.availableFrom_) ; hour < (book.getEnd()- this.availableFrom_); hour++)
            timeSlots_[book.getDay_()][hour] = false;
    }

    public int getAvailableFrom_() {
        return availableFrom_;
    }

    public int getAvailableTo_() {
        return availableTo_;
    }

    public void setAvailableFrom_(int availableFrom) {
        this.availableFrom_ = availableFrom;
    }

    public void setAvailableTo_(int availableTo_) {
        this.availableTo_ = availableTo_;
    }

    public String getName() {
        return this.name_;
    }

    public void setName(String aName) {
        this.name_ = aName;
    }

    public String getLocation() {
        return this.location_;
    }

    public void setLocation(String aLocation) {
        this.location_ = aLocation;
    }

    public Booking[] getBooks() {
        return this.books_;
    }

    public void addBook(Booking book) {
        this.books_[this.numberOfBooks++]= book;
    }

    public double getPrice() {
        return this.price_;
    }

    public void setPrice(double aPrice) {
        this.price_ = aPrice;
    }

    public PlaygroundOwner getOwner() {
        return this.owner_;
    }

    public void setOwner(PlaygroundOwner aOwnerID) {
        this.owner_ = aOwnerID;
    }

    public double getSize() {
        return this.size_;
    }

    public void setSize(double Size) {
        this.size_ = Size;
    }
    
    public void displayPlayground() {
        System.out.println("\nPlayground's Name: "+this.name_
                          +"\nPlayground's Location: "+this.location_
                          +"\nAvailable From: "+this.availableFrom_
                          +"  |  Available To: "+this.availableTo_+"\n"
        );
    }
}

