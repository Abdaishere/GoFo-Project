package Playgrounds;
import Users.*;

/**
 * @author  20190462	Mohamed Essam Said Hanafi
 * The playground is class used to store and mannage the information about the playground and avalible slot of that playground and the bookings for the playground
 */
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

    /**
     * Create the playground and initialize the available time slots of the playground for the whole month
     * @param name
     * @param location
     * @param price
     * @param availableFrom
     * @param availableTo
     * @param playgroundOwner
     * @param P_ID              the ID of the playground
     */
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

    /**
     * get the time slots of the day if the time slot was available show it else don't
     * Notice that every number is one hour and a time slot
     * @param day   the day to show its time slots
     */
    public void getTimeSlots_(int day) {
        System.out.print("| ");
            for (int hour = 0; hour < (this.availableTo_ - this.availableFrom_); hour++)
            {
                if(timeSlots_[day-1][hour]== true){
                    System.out.print((this.availableFrom_+hour)+" | ");
                }
            }
    }

    /**
     * update the time slots of the day after booking
     * @param book  get the day you book was on and the start and end of the booking
     */
    public void changeTimeSlots_(Booking book) {
        
        for (int hour = (book.getStart()- this.availableFrom_) ; hour <= (book.getEnd()- this.availableFrom_); hour++)
            if (timeSlots_[book.getDay_()-1][hour])
            timeSlots_[book.getDay_()-1][hour] = false;
            else throw new Error("Option was not available");
    }

    /**
     *
     * @return the opening time
     */
    public int getAvailableFrom_() {
        return availableFrom_;
    }

    /**
     *
     * @return  get the closing time
     */
    public int getAvailableTo_() {
        return availableTo_;
    }

    /**
     * update the opening time
     * @param availableFrom new opening time
     */
    public void setAvailableFrom_(int availableFrom) {
        this.availableFrom_ = availableFrom;
    }

    /**
     *  update the closing time
     * @param availableTo_ new closing time
     */
    public void setAvailableTo_(int availableTo_) {
        this.availableTo_ = availableTo_;
    }

    /**
     *
     * @return the ID of the playground
     */
    public int getPlaygroundID_() {
        return playgroundID_;
    }

    /**
     *
     * @return  the name of the playground
     */
    public String getName() {
        return this.name_;
    }

    /**
     *
     * @param aName the new name
     */
    public void setName(String aName) {
        this.name_ = aName;
    }

    /**
     *
     * @return  the location of that playground
     */
    public String getLocation() {
        return this.location_;
    }

    /**
     *
     * @param aLocation the new location of that playground
     */
    public void setLocation(String aLocation) {
        this.location_ = aLocation;
    }

    /**
     *
     * @return  all the bookings in that playground
     */
    public Booking[] getBooks() {
        return this.books_;
    }

    /**
     * add a new book to the playground
     * @param book
     */
    public void addBook(Booking book) {
        this.books_[this.numberOfBooks++]= book;
    }

    /**
     *
     * @return  the price of one slot in the playground
     */
    public double getPrice() {
        return this.price_;
    }

    /**
     *
     * @param aPrice new price of one slot in the playground
     */
    public void setPrice(double aPrice) {
        this.price_ = aPrice;
    }

    /**
     *
     * @return  the owner of the playground
     */
    public user getOwner() {
        return this.owner_;
    }

    /**
     *
     * @param aOwnerID  the new owner of the playground
     */
    public void setOwner(PlaygroundOwner aOwnerID) {
        this.owner_ = aOwnerID;
    }

    /**
     *
     * @return  the size of the playground
     */
    public double getSize() {
        return this.size_;
    }

    /**
     *
     * @param Size  the new size of the playground
     */
    public void setSize(double Size) {
        this.size_ = Size;
    }

    /**
     * display the Playground (Used when searching to chose a playground)
     */
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

