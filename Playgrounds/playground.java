package Playgrounds;

import Users.playgroundOwner;
import java.util.Vector;

public class playground {
	private booking _requests;
	private complaint _complaints;
	private String _name;
	private String _location;
	private booking _books;
	private status _status;
	private double _price;
	private playgroundOwner _owner;
	private double _size;
	private int _playgroundID;
	public playgroundList _unnamed_playgroundList_;
	public status _unnamed_status_;
	public Vector<complaint> _unnamed_complaint_ = new Vector<complaint>();


	public booking getRequests() {
		return this._requests;
	}

	public void setRequests(booking aRequests) {
		this._requests = aRequests;
	}

	public complaint getComplaints() {
		return this._complaints;
	}

	public void setComplaints(complaint aComplaints) {
		this._complaints = aComplaints;
	}

	public String getName() {
		return this._name;
	}

	public void setName(String aName) {
		this._name = aName;
	}

	public String getLocation() {
		return this._location;
	}

	public void setLocation(String aLocation) {
		this._location = aLocation;
	}

	public booking getBooks() {
		return this._books;
	}

	public void addBook(booking aBooking) {
		throw new UnsupportedOperationException();
	}

	public status getStatus() {
		return this._status;
	}

	public void setStatus(status aStatus) {
		this._status = aStatus;
	}

	public playground(String aName, String aLocation, double aSize, double aPrice) {
		throw new UnsupportedOperationException();
	}

	public double getPrice() {
		return this._price;
	}

	public void setPrice(double aPrice) {
		this._price = aPrice;
	}

	public playgroundOwner getOwner() {
		return this._owner;
	}

	public void setOwner(playgroundOwner aOwnerID) {
		this._owner = aOwnerID;
	}

	public double getSize() {
		return this._size;
	}

	public void setSize(double aSize) {
		this._size = aSize;
	}
}