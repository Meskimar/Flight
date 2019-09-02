package flight.booking.service;

import flight.booking.dao.FlightDao;
import flight.booking.dao.ReserveDao;
import flight.booking.domain.Flight;
import flight.booking.domain.Reserve;
import flight.booking.domain.SeatType;

import java.util.Set;

import static javax.management.Query.value;

public class ReserveServiceImpl implements ReserveService{

    private FlightDao flightDao;


    public ReserveServiceImpl(FlightDao flightDao){
        this.flightDao = flightDao;

    }

    @Override
    public void makeReservation(Reserve reserve,Flight flight) {


        Set<Flight> flights = flightDao.readAll(flight.getOrigin()
                .matches(String.valueOf(flight.getDestination().contains(flight.getFlightNumber()))));


        double price = 20000.00;

        boolean findFlight = false;
        int seat = flight.getNoOfSeat();
        int noOfSeat = 10;


        while (!findFlight) {

            Flight reserved ;

            for (Flight flight1 : flights) {


                if (flight1.getSeatType().equals(SeatType.ECONOMYCLASS) ? flight1.getPrice() <= price :
                        flight1.getPrice() >= price) {

                    reserved = searchedFlight
                            (flight1, flight1.getSeatType(),flight1.getPrice(), flight1.getNoOfSeat());

                    if (reserved.getSeatType().equals(noOfSeat) &&
                            reserved.getFlightNumber().equals(flight1.getPrice()))
                        break;


                 else {


                        reserved = null;


                    } }
            }
            int seatAvailable = 10;
            reserved=null;
            if (reserve != null) {
                seatAvailable = noOfSeat - reserved.getNoOfSeat();
            }
            findFlight = seatAvailable <= 10;
            seat = seatAvailable > 10 ? reserved.getNoOfSeat() : noOfSeat;
            flightDao.create(Flight.builder().withFlightNumber(flight.getFlightNumber())
                    .withDestination(flight.getDestination()).withOrigin(flight.getOrigin()).build());

        }
    }

        /* Reserve reserve = Reserve.makeReservation(Reserve.builder()
                 .withCustomerId("").withAirplaneId("").withDate("").withDate("")
                 .withFlight(Flight.builder()
                         .withOrigin("").withFlightNumber("").withPrice(0d)
                         .withOrigin("")..build()).build()));





           /* .withId(.getId())
            .withTime(reserve.getTime())
            .withDate(reserve.getDate())
            .withCustomerId(reserve.getCustomerId())
            .withSeatNo(reserve.getNoOfItems())
            .withSeatType(reserve.getSide())
            .withPrice(reserve.getMinMaxValue())
            .withNoAvilableSeat(reserve.getnoAvilableSeat() - noOfSeat)
            .build());*/








    private Flight searchedFlight(Flight flight, SeatType seatType,double price,int seatNo) {

        if (flight.getFlightNumber().equals(seatType((int) price, seatNo))) {
            return flight;

        }



                /* if (searchedFlight.getFlightNumber().equals(value(20000.0)) &&
                         searchedFlight.getNoOfSeat()(seatAvailable)) {
                     return searchedFlight.equals(SeatType.BUSINESSCLASS);
                 } else return searchedFlight.equals(SeatType.ECONOMYCLASS);

                }*/

 return flight; // to be revised
    }




    private SeatType seatType(int seatNo,double price) {
        if (seatNo <= 5 &&  price<= 20000.00) return SeatType.ECONOMYCLASS;
        else {
            return SeatType.BUSINESSCLASS;
        }
    }
}
