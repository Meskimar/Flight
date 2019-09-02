package flight.booking.dao;

import flight.booking.domain.Flight;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

public interface FlightDao {



    void create (Flight flight);
    Optional<Flight> read(String id);

    Collection<Flight> readFlightByOrigin(String origin);
    //Flight readAll();

    Set<Flight> readAll(boolean matches);
}
