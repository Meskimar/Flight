package flight.booking.domain;

import java.util.Objects;

public class Passanger {
    private String passangerName;
    private String passangerId;

    public Passanger(Builder builder) {
        this.passangerId = Objects.requireNonNull(builder.passangerId);
        this.passangerName = Objects.requireNonNull(builder.passangerName);
    }

    public String getPassangerName(String passangerName){
        return passangerName;
    }

    public String getPassangerId(String PassangerId){
        return passangerId;
    }


    public static Builder builder(){ return new Builder ();
    }



    public static class Builder{

        private String passangerName;
        private String passangerId;


        public Builder withPassangerName(String passangerName){
            this.passangerName = passangerName;
            return this;
        }

        public Builder withPassangerId(String PassangerId){
            this.passangerId = passangerId;
            return this;
        }

        public Passanger build(){ return new Passanger(this); }
    }

}
