package flight.booking.dao;

import flight.booking.domain.Passanger;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PassangerDaoImpl implements PassangerDao {


    private Map<String, Passanger> passangers = new HashMap<>();
    @Override
    public void create(Passanger passanger) {
        if(passangers.containsKey(passanger.getPassangerId(""))){
            throw new RuntimeException("Passanger already exists");
        }
        passangers.put(passanger.getPassangerId(""),passanger);


    }

    @Override
    public Collection<Passanger> readPassangerById(String id) {
         return passangers.values().stream().filter(passanger ->  passanger.getPassangerName("").equals(id))
                .collect(Collectors.toList());
    }


}
