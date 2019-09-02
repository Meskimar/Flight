package flight.booking.service;

import flight.booking.dao.AirPlaneDao;
import flight.booking.dao.PassangerDao;
import flight.booking.dao.FlightDao;
import flight.booking.dao.ReserveDao;
import flight.booking.domain.*;

import java.util.Optional;

public class PassangerServiceImpl implements PassangerService {

    private FlightDao flightDao;
    private PassangerDao passangerDao;
    private ReserveDao reserveDao;
    private AirPlaneDao airPlaneDao;

    // flight service should reserve this a seat to Passanger;
    @Override
    public void Reservation() {

        reserveDao.makeReservation(Reserve.builder().build());


    }



    //private void bookFlight(Passanger customer){
      //  customerDao.bookTicket(customer.getCustomerId();

    }

