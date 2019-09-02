package flight.booking.service;

import flight.booking.dao.FlightDao;
import flight.booking.domain.Flight;
import flight.booking.domain.Reserve;

public interface ReserveService {
   void makeReservation(Reserve reserve,Flight flight);
}
