package Playgrounds;
import Users.*;

public class Playground {
    
    private String name_;
    private String location_;
    private final Booking[] books_;
    private int numberOfBooks;
    private double price_;
    private user owner_;
    private double size_;
    private int playgroundID_;
    private final boolean[][] timeSlots_;
    private int availableFrom_;
    private int availableTo_;
    
    public Playground(String name, String location, double price, int availableFrom, int availableTo, user playgroundOwner, int P_ID) {
        this.name_          = name;
        this.location_      = location;
        this.price_         = price;
        this.availableFrom_ = availableFrom;
        this.availableTo_   = availableTo;
        this.books_         = new Booking[30*(availableTo-availableFrom+1)];
        this.timeSlots_     = new boolean[30][availableTo-availableFrom+1];
        this.numberOfBooks  = 0;
        this.owner_         = playgroundOwner;
        this.playgroundID_  = P_ID;
        
        for (int day = 0; day < 30; day++) {
            for (int hour = 0; hour < availableTo-availableFrom; hour++)
                timeSlots_[day][hour]= true;
        }
        
    }

    public void getTimeSlots_(int day) {
        System.out.print("| ");
            for (int hour = 0; hour < (this.availableTo_ - this.availableFrom_); hour++)
            {
                if(timeSlots_[day-1][hour]== true){
                    System.out.print((this.availableFrom_+hour)+" | ");
                }
            }
    }

    public void changeTimeSlots_(Booking book) {
        
        for (int hour = (book.getStart()- this.availableFrom_) ; hour <= (book.getEnd()- this.availableFrom_); hour++)
            timeSlots_[book.getDay_()-1][hour] = false;
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
    
    public int getPlaygroundID_() {
        return playgroundID_;
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

    public user getOwner() {
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
        System.out.println("\nPlaygroundID: "         +this.playgroundID_
                          +"\nPlayground's Name: "    +this.name_
                          +"\nPlayground's Location: "+this.location_
                          +"\nPlayground's Price: "    +this.price_
                          +"\nAvailable From: "       +this.availableFrom_
                          +"  |  Available To: "      +this.availableTo_+"\n"
        );
    }
}

