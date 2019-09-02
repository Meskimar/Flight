package flight.booking.dao;

import flight.booking.domain.Flight;

import java.util.*;
import java.util.stream.Collectors;

public class FlightDaoImpl implements FlightDao {


    private Map<String,Flight>flights = new HashMap<>();



    @Override
    public void create (Flight flight) {

        if (flights.containsKey(flight.getFlightNumber())){
            throw new RuntimeException("Flight already exists");
        }
         flights.put(flight.getFlightNumber(), flight);

      /* Optional<Flight> optional =flightDao.read(flight.getFlightNumber());

        if(optional.isPresent()){
            flights.put(flight.getFlightNumber(),Flight.builder().withFlightName(flight.getFlightName())
                    .withFlightNumber(flight.getFlightNumber()).build());
        }*/


    }

    @Override
    public Optional<Flight> read(String origin) {
        return Optional.ofNullable(flights.get(origin));
    }

    @Override
    public Collection<Flight> readFlightByOrigin(String origin) {

        return flights.values().stream().filter(flight ->flight.getOrigin().contains(flight.getFlightNumber()))
                .collect(Collectors.toSet());

    }

  /*  @Override
    public Flight readAll() {
        return null;
    }*/

    @Override
    public Set<Flight> readAll(boolean matches) {
        return flights.values().stream().map(f->Flight.builder()
                .withDestination(f.getDestination())
                .withFlightNumber(f.getFlightNumber())
                .withFlightNumber(f.getFlightNumber()).build()).collect(Collectors.toSet());
    }
}
