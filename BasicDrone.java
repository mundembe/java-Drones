public class  BasicDrone{
    private double latitude;
    private double longitude;
    private double altitude;
    private String registration;

    public static void main(String[] args) {
        //new BasicDrone();
        BasicDrone drone1 = new BasicDrone("Drone1", 0, 0, 0);
        BasicDrone drone2 = new BasicDrone("Drone2", 10, 0, 0);

        double dist = drone1.distanceTo(drone1, drone2);
        System.out.println("Distance: ");
        System.out.println(dist);
    }

    public BasicDrone(){
        registration = "unknown";
        altitude = 0.0;
        longitude = 0.0 ;
        latitude = 0.0 ;
    }

    public BasicDrone( String registration, double latitude, double longitude, double altitude){
        this.registration = registration;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public String getRegistration(){
        return registration;
    }
    public void setRegistration(String registration){
        this.registration = registration;
    };
    public double getLatitude(){
        return latitude;
    }
    public void setLatitude(double latitude){
        this.latitude = latitude;
    };
    public double getLongitude(){
        return longitude;
    }
    public void setLongitude(double longitude){
        this.longitude = longitude;
    };
    public double getAltitude(){
        return altitude;
    }
    public void setAltitude(double altitude){
        this.altitude = altitude;
    }

    public void printInfo(){
        System.out.println("Registration: " +registration);
        System.out.println("Current position:\n    Alt: "+ altitude);
        System.out.println("    Lat: " + latitude);
        System.out.println("    Long: "+ longitude);
    }

    public double distanceTo(BasicDrone drone1, BasicDrone drone2){

        double Lat_1 = drone1.getLatitude();
        double Lat_2 = drone2.getLatitude();
        double Alt_1 = drone1.getAltitude();
        double Alt_2 = drone2.getAltitude();
        double Lon_1 = drone1.getLongitude();
        double Lon_2 = drone2.getLongitude();

        double Lat_dif = Math.pow((Lat_1 - Lat_2), 2);
        double Alt_dif = Math.pow((Alt_1 - Alt_2), 2);
        double Lon_dif = Math.pow((Lon_1 - Lon_2), 2);
        double distance = Math.sqrt(Lat_dif + Alt_dif + Lon_dif);

        return distance;
    }

}
