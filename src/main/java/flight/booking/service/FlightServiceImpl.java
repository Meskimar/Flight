package flight.booking.service;

import flight.booking.dao.PassangerDao;
import flight.booking.dao.FlightDao;
import flight.booking.domain.Flight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class FlightServiceImpl implements FlightService {

    private FlightDao flightDao;

    private PassangerDao passangerDao;

    public FlightServiceImpl(FlightDao flightDao, PassangerDao passangerDao) {
        this.flightDao = flightDao;
        this.passangerDao = passangerDao;

    }

    @Override
    public Collection<Flight> getOrigins() {

        return flightDao.readFlightByOrigin("");
    }

    @Override
    public Collection<Flight> readAll(String flightNumber) {
        Collection<Flight> flights = new ArrayList<Flight>();
        return flights.stream().filter(flight -> flight.getOrigin().equals(flightNumber))
                .collect(Collectors.toList());


        //@Override
        //  public String getReservation() {
    /* return customerDao.getReservation(Flight.builder().withFlightNumber(flight.getFlightNumber())
             .withFlightName(flight.getFlightName()).
                     build());
    }*/


    /*private SeatType OtherSide(SeatType seatType) {
        if (seatType == SeatType.BUSINESSCLASS) return SeatType.ECONOMYCLASS;
        return SeatType.BUSINESSCLASS;
    }*/
        // return null;
    }
}

