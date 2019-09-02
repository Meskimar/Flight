package flight.booking.dao;

import flight.booking.domain.AirPlane;
import flight.booking.domain.Flight;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface AirPlaneDao {


    void AddAirplane(AirPlane airPlane);
    // read flight by route and date

    Optional<AirPlane> read(Long id);
     //List<AirPlane> readByFlightByDate(String flightNumber, String date);
    List<AirPlane> findByFlightAndDate(String flight,String date);
}
