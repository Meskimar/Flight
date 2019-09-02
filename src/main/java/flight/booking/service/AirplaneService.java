package flight.booking.service;

import flight.booking.dao.AirPlaneDao;
import flight.booking.dao.FlightDao;
import flight.booking.domain.AirPlane;
import flight.booking.domain.Flight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AirplaneService {

    /*public AirplaneService(AirPlaneDao airPlaneDao, FlightDao flightDao) {

    }

    public static ClassPathXmlApplicationContext ApplicationContext;

    public List<AirPlane> findAvailableAirplane(Flight flight, String date) {

       /* AirPlaneDao airPlaneDao = findAvailableAirplane(flight.getFlightNumber()
                .contains(flight.getDate())).iterator()
                .forEachRemaining(airPlane ->airPlane.getAvailablityCount()).;
                ApplicationContext.getBean("airplaneDao", AirPlaneDao.class);

        return airPlaneDao.findByFlightAndDate(flight, date);
    }

    private Iterable<AirPlane> findAvailableAirplane(boolean contains) {
        return null;
    }
}
       return null;
    }*/
}
