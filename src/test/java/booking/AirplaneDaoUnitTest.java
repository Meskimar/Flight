package booking;

import flight.booking.dao.AirPlainDaoImpl;
import flight.booking.dao.AirPlaneDao;
import flight.booking.domain.AirPlane;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class AirplaneDaoUnitTest {

    @Test
    public void AddAirPlane(){

        AirPlaneDao dao = new AirPlainDaoImpl();
        dao.AddAirplane(AirPlane.builder().withId("21l").withFlightNumber("EAL569").withDepartureTime("th12")
                .withArrivalTime("87").withDate("30/08").build());
        System.out.println(dao.findByFlightAndDate("EAL569","30/08"));
    }

    @Test
    public void AddAirPlainAndReadByFlightAndDate() {
        AirPlaneDao airPlainDao = new AirPlainDaoImpl();
        airPlainDao.AddAirplane(AirPlane.builder().withId("707l").withFlightNumber("AEL456").withDate("30/08").withArrivalTime("12:08").withDepartureTime("06:10").build());
      //airPlainDao.AddAirplane(AirPlane.builder().withId(87l).withFlightNumber("AEL456").withDate("30/08").withArrivalTime("12:09").withDepartureTime("06:10").build());
        //airPlainDao.AddAirplane(AirPlane.builder().withFlightNumber("EAL568").withArrivalTime("12:08").withDepartureTime("06:10").build());
        airPlainDao.AddAirplane(AirPlane.builder().withId("676l").withFlightNumber("ARL59").withDate("30/08").withArrivalTime("18:08").withDepartureTime("06:10").build());
        Assert.assertNotNull("1",airPlainDao.findByFlightAndDate("AEL456","30/08"));
        System.out.println(airPlainDao.findByFlightAndDate("AEL456","30/08"));

        Collection<AirPlane> airplines =airPlainDao.findByFlightAndDate("ARL59","30/08");
        Assert.assertEquals(2,airplines.size());

    }
}
