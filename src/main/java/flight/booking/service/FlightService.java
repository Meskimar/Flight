package flight.booking.service;

import flight.booking.domain.Flight;

import java.util.Collection;

public interface FlightService {

    //String getReservation(Flight flight, Passanger passanger);
    Collection<Flight> getOrigins();
    Collection<Flight> readAll(String flightNumber);

}
