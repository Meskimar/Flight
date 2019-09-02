package flight.booking.dao;
import flight.booking.domain.AirPlane;
import flight.booking.domain.Flight;
import flight.booking.domain.Reserve;

import java.util.*;
import java.util.stream.Collectors;

public class AirPlainDaoImpl implements AirPlaneDao {



    Map<String, AirPlane> airplanes = new HashMap<>();

    @Override
    public void AddAirplane(AirPlane airPlane) {
        if(airplanes.containsKey(airPlane.getId())){
            throw new RuntimeException("Airplane already exists");
        }
        airplanes.put(airPlane.getId(),airPlane);
    }

    @Override
    public Optional<AirPlane> read(Long id) {
        return Optional.ofNullable(airplanes.get(id));
    }



    @Override
    public List<AirPlane> findByFlightAndDate(String flight,String date) {

        return airplanes.values().stream().filter(airPlane ->  airPlane.getDate().equals(date))
                .collect(Collectors.toList());
    }
}



