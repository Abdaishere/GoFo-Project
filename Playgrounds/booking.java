/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Playgrounds;

import Users.player;
import java.time.LocalDateTime;

public class Booking {
     private int day_;
    private int start_;
    private int end_;
    private int playerID_;
    private Playground playground_;

    public Booking(int day, int start, int end, Playground playground, int playerID) {
        this.day_        = day;
        this.start_      = start;
        this.end_        = end;
        this.playground_ = playground;
        this.playerID_   = playerID;
    }

    public int getStart() {
        return this.start_;
    }

    public void setStart(int Start) {
        this.start_ = Start;
    }

    public int getEnd() {
        return this.end_;
    }

    public void setEnd(int End) {
        this.end_ = End;
    }

    public int getDay_() {
        return day_;
    }

    public void setDay_(int day_) {
        this.day_ = day_;
    }

    public int getPlayerID() {
        return this.playerID_;
    }

    public void setPlayerID(int PlayerID) {
        this.playerID_ = PlayerID;
    }
}