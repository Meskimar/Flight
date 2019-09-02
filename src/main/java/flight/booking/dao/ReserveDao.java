package flight.booking.dao;

import flight.booking.domain.Flight;
import flight.booking.domain.Reserve;

import java.util.List;
import java.util.Optional;

public interface ReserveDao {
    void makeReservation(Reserve reserve);
    public Optional<Reserve> read(String id);
    public List<Reserve> findByReservation(String flight, String date);
   // void makeReservation(ReserveDao reserveDao,FlightDao flightDao);
}
