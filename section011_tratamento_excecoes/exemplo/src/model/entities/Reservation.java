package model.entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import model.entities.exceptions.DomainException;

//import model.entities.exceptions.DomainException;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        if(!checkOut.isAfter(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}

        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }
    
    public int duration() {
        Period duration = Period.between(checkOut, checkIn);
        return Math.abs(duration.getDays());
    }
    
    public void update(LocalDate checkIn, LocalDate checkOut) {
        LocalDate now = LocalDate.now();
        if(!checkOut.isAfter(checkIn)) {
            throw new DomainException("Check out deve ser após o check in");
        }
        if(checkIn.isBefore(now) || checkOut.isBefore(now)) {
            throw new DomainException("Deve ser datas futuras");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
	public String toString() {
		return "Room "
			+ roomNumber
			+ ", check-in: "
			+ checkIn.format(fmt)
			+ ", check-out: "
			+ checkOut.format(fmt)
			+ ", "
			+ duration()
			+ " nights\n";
	}
}
