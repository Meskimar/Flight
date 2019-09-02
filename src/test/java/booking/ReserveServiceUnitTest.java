package booking;

import flight.booking.dao.FlightDao;
import flight.booking.dao.FlightDaoImpl;
import flight.booking.dao.ReserveDao;
import flight.booking.dao.ReserveDaoImpl;
import flight.booking.domain.Flight;
import flight.booking.domain.Reserve;
import flight.booking.domain.SeatType;
import flight.booking.service.ReserveService;
import flight.booking.service.ReserveServiceImpl;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Collection;

public class ReserveServiceUnitTest {

    @Test
    public void testmakeReservation() {
        ReserveDao reserveDao = new ReserveDaoImpl();
        //FlightDao flightDao=new FlightDaoImpl();
        reserveDao.makeReservation(Reserve.builder().build());
        Reserve reserve1 = Reserve.builder().withAirplaneId("27")
                .withPassangerId("34").withDate("27/12")
                .withSeat(5).withFlight("EAL767")
                .withTime("12:45").build();

        /*flightDao.create(Flight.builder().withOrigin("stockholm").withSeatType(SeatType.BUSINESSCLASS).withPrice(21345d).build());
        Reserve reserve2 = Reserve.builder()
                .withAirplaneId("21")
                .withPassangerId("36")
               .withDate("21/12").withSeat(6).withTime("12:45").build();
       // Reserve.;*/


       // Assert.assertEquals(1,reserveDao);


    }
}
