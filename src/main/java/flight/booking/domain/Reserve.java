package flight.booking.domain;

public class Reserve {

    private String id;
    private String passangerId;
    private int airPlaneId;
    private String date;
    private String time;
    private int seat;
    private Flight flight;
    private String flightNumber;

    public Reserve(Builder builder) {
        this.id=id;
        this.airPlaneId=airPlaneId;
        this.passangerId=passangerId;
        this.date= date;
        this.time = time;
        this.seat =seat;
        this.flight=flight;
        this.flightNumber=flightNumber;
    }

    public String getId() {
        return id;
    }

    public String getPassangerId() {
        return passangerId;
    }

    public int getAirPlaneId() {
        return airPlaneId;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getSeat() {
        return seat;
    }

    public Flight getFlight(){
        return flight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String PassangerId;
        private int airPlaneId;
        private String date;
        private String time;
        private int seat;
        private String flightNumber;
        private Flight flight;

        public Builder withFlight(Flight flight) {
            this.flight = flight;
            return this;}

        public Builder withId(String id) {
            this.id = id;
            return this;

        }

        public Builder withPassangerId(String passangerId) {
            this.PassangerId = passangerId;
            return this;

        }

        public Builder withAirplaneId(String airplaneId) {
            this.airPlaneId = airPlaneId;
            return this;

        }

        public Builder withDate(String date) {
            this.date = date;
            return this;

        }

        public Builder withTime(String time) {
            this.time = time;
            return this;
        }

        public Builder withFlight(String flightNumber) {
            this.flightNumber = flightNumber;
            return this;
        }

        public Builder withSeat(int seat) {
            this.seat = seat;
            return this;
        }


        public Reserve build(){return new Reserve(this);}
    }
}