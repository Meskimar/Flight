package flight.booking.dao;

import flight.booking.domain.AirPlane;
import flight.booking.domain.Passanger;

import java.util.Collection;

public interface PassangerDao {

    void create(Passanger passanger);
    //void readPassangerById(String id);
    Collection<Passanger>readPassangerById(String id);


}
