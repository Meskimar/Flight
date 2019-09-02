package flight.booking.dao;

import flight.booking.domain.AirPlane;
import flight.booking.domain.Flight;
import flight.booking.domain.Reserve;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReserveDaoImpl implements ReserveDao {

    Map<String, Reserve> reserves = new HashMap<>();

    @Override
    public void makeReservation(Reserve reserve) {
        if(reserves.containsKey(reserve.getId())){
            throw new RuntimeException("flight already reserved");
        }
        reserves.put(reserve.getId(),reserve);
    }


    @Override
    public Optional<Reserve> read(String id) {
        return Optional.ofNullable(reserves.get(id));
    }


    @Override
    public List<Reserve> findByReservation(String flight, String date) {

        return reserves.values().stream().filter(airPlane ->  airPlane.getDate().equals(date))
                .collect(Collectors.toList());
    }

}

