package flight.booking.domain;


import java.util.Set;

    public class Flight  {

        private String flightNumber;
        private String origin;
        private String destination;
        private double price;
        private Integer noOfSeat;
        private SeatType seatType;
        private int seatNo;

        // to be revised
        private String date;

        public Flight(Builder builder) {
            this.flightNumber = builder.flightNumber;
            this.origin=builder.origin;
            this.destination = builder.destination;
        }

        public SeatType getSeatType() {
            return seatType;
        }

        public double getPrice() {
            return price;
        }

        public int getNoOfSeat() {
            return noOfSeat;
        }

        public String getDate() {
            return date;
        }

        public String getFlightNumber() {
            return flightNumber;
        }

        public String getOrigin() {
            return origin;
        }

        public String getDestination() {
            return destination;
        }


        public static Builder builder() {
            return new Builder();
        }



        public static class Builder {

            private String flightNumber;
            private String origin;
            private String destination;
            private double price;
            private Integer noOfSeat;
            private SeatType seatType;
            private int seatNo;

            public Builder withFlightNumber(String flightNumber) {
                this.flightNumber = flightNumber;
                return this;
            }

            public Builder withDestination(String destination) {
                this.destination = destination;
                return this;

            }

            public Builder withSeatType(SeatType seatType) {
                this.seatType = seatType;
                return this;
            }
            public Builder withOrigin(String origin) {
                this.origin = origin;
                return this;
            }
            public Builder withPrice(double price) {
                this.price = price;
                return this;
            }
            public  Flight build(){ return new Flight(this);}
        }
    }

