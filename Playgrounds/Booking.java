
package Playgrounds;

/**
 * @author  Mohamed Essam Said Hanafi
 * Booking class used for booking a playground with the day and start and end date and who booked the playground
 *
 */
public class Booking {
    private int day_;
    private int start_;
    private int end_;
    private int playerID_;
    private final Playground playground_;

    /**
     * @param day   day of the booking
     * @param start start time of the booking
     * @param end   end time of the booking
     * @param playground    which playground did he choose
     * @param playerID      who is the player that booked the playground
     */
    public Booking(int day, int start, int end, Playground playground, int playerID) {
        this.day_        = day;
        this.start_      = start;
        this.end_        = end;
        this.playground_ = playground;
        this.playerID_   = playerID;
    }

    /**
     * @return start time
     */
    public int getStart() {
        return this.start_;
    }

    /**
     * @param Start set the start time
     */
    public void setStart(int Start) {
        this.start_ = Start;
    }

    /**
     * @return end time
     */
    public int getEnd() {
        return this.end_;
    }

    /**
     * @param End set the end time
     */
    public void setEnd(int End) {
        this.end_ = End;
    }

    /**
     * @return get the day of the booking
     */
    public int getDay_() {
        return day_;
    }

    /**
     * @param day_ set the day of the booking
     */
    public void setDay_(int day_) {
        this.day_ = day_;
    }

    /**
     * @return the player id that booked the playground
     */
    public int getPlayerID() {
        return this.playerID_;
    }

    /**
     * @param PlayerID set the id to the player who booked the playground
     */
    public void setPlayerID(int PlayerID) {
        this.playerID_ = PlayerID;
    }
}