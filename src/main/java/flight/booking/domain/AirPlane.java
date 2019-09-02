package flight.booking.domain;

public class AirPlane {

    private String id;
    private String flightNumber;
    private boolean ac;
    private Double price;
    private String departureTime;
    private String arrivalTime;
    private int availablityCount;
    private String date;

    public AirPlane(Builder builder) {
        this.id = builder.id;
        this.flightNumber= builder.flightNumber;
        this.departureTime=builder.departureTime;
        this.arrivalTime = builder.arrivalTime;
        this.date =builder.date;

    }

    public String getDate() {
        return date;
    }

    public String getId() {
        return id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public boolean isAc() {
        return ac;
    }

    public Double getPrice() {
        return price;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public int getAvailablityCount() {
        return availablityCount;
    }



    public static Builder builder(){ return new Builder();}

    @Override
    public String toString() {
        return "AirPlane{" +
                "id=" + id +
                ", flightNumber='" + flightNumber + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", date='" + date + '\'' +
                '}';
    }


    public static class Builder{

        private String flightNumber;
        private boolean ac;
        private Double price;
        private String departureTime;
        private String arrivalTime;
        private int availablityCount;
        private String date;
        private String id;

        public  Builder withFlightNumber(String flightNumber){
            this.flightNumber = flightNumber;
            return this;
        }
        public  Builder withPrice(Double price){
            this.price = price;
            return this;
        }
        public  Builder withDepartureTime(String departureTime){
            this.departureTime = departureTime;
            return this;
        }
        public  Builder withArrivalTime(String arrivalTime){
            this.arrivalTime = arrivalTime;
            return this;
        }
        public  Builder withDate(String date){
            this.date = date;
            return this;
        }
        public Builder withId(String id){
            this.id= id;
            return this;
        }
        public AirPlane build(){
            return new AirPlane(this);
        }

    }
}
