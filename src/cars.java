   public class cars   // This includes information about all the cars(employees) including which spot the car is currently parked, along with arrival and departure time.
    { //their number is supposed to be 7680 cars in total
        int car_id;
        int car_assignedSpotNumber;//spotnumber assigned to this specific car
        int carArrivalTime;  // it is probably given as an input file from the user
        int departure_time;  // departure timeis usually arrival time+ 8 hours
        int job_number; // job assigned to the car
        int timeSpenInThePlant;
        int turned_away;
        boolean busy;          // true if this car has a job and false if it does not
        boolean nojobsmigrated;
        
       public cars() // constructor
        {
            turned_away=-1;    // Initially set to -1.
            // turned_away=0 means Car didn't turn away orit actually found a parking space.
            // turned_away=1 - Car turned away
            car_assignedSpotNumber=-1; // initially no spot assigned toit at all
            nojobsmigrated=false;
        }

        public String ToString()  // Displays all car information 
        {          
        	String result = "";
            result = " \n " +
            "**********"+" \n "+
           "		Car Details		        "+" \n "+
            "***********"+" \n "+
            "car number : "+car_id+" \n "+
            "car spot number : "+car_assignedSpotNumber+" \n "+
            "job number assigned to this car : "+job_number+" \n "+
          "this car arrived at : "+carArrivalTime+" \n "+
            "this car left at : "+departure_time+" \n "+
           "this car stayed there for(duration): "+timeSpenInThePlant+" \n "+
            "Car Turned away: "+turned_away+" \n ";

            
            return result;

        }






        public void calculate_departure_time(){        //Calculates the departure time of a car when simulation starts. This is between 1-2560 cars

            departure_time= carArrivalTime + (8*60);                            // departure time is after arrival time by 8 hours
        }



        public void calculate_timeSpenInThePlant_of_car()                          //Calculates time stayed in the datacenter plant, which will be 8 hours.
        {
            timeSpenInThePlant = departure_time - carArrivalTime;
        }

        public String failedJobCarToString()    //This displays the details of a car which may fail if we don't do the migration.
        {
        	String result = "";
            result = "\n"+
            "***************"+" \n "+
            "		Failed Job Car Details		        "+" \n " +
           "**************"+" \n "+
            "car ID : "+car_id+" \n "+
            "job number assigned to this car : "+job_number+" \n "+
           "departure time of this car : "+departure_time+" \n  "+
           "arrival time of this car : "+carArrivalTime+" \n "+" \n ";
            
            return result;

        }

        public String SuccessJobCarToString()    //This displays the details of a car which may pass during the simulation.
        {
        	String result = "";
            result = "\n"+
            "************** "+" \n "+
            "		Failed Job Car Details		        "+" \n " +
           "************** "+" \n "+
            "car ID : "+car_id+" \n "+
            "job number assigned to this car : "+job_number+" \n "+
           "departure time of this car : "+departure_time+" \n "+
           "arrival time of this car : "+carArrivalTime+" \n "+"\n";
            
            return result;

        }

    }
