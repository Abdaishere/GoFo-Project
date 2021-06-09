package Playgrounds;

import Users.player;
import java.time.LocalDateTime;

public class booking {
	private LocalDateTime _start;
	private LocalDateTime _end;
	private int _playerID;

	public LocalDateTime getStart() {
		return this._start;
	}

	public void setStart(LocalDateTime aStart) {
		this._start = aStart;
	}

	public LocalDateTime getEnd() {
		return this._end;
	}

	public void setEnd(LocalDateTime aEnd) {
		this._end = aEnd;
	}

	public int getPlayerID() {
		return this._playerID;
	}

	public void setPlayerID(int aPlayerID) {
		this._playerID = aPlayerID;
	}

	public booking(LocalDateTime aStart, LocalDateTime aEnd, player aPlayer) {
		_start = aStart;
		_end = aEnd;
		_playerID = aPlayer.getID();
	}
}