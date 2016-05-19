/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basics;

/**
 *
 * @author Cryowynd
 */
import java.util.ArrayList;

public class StopTimes {
 private String  trip_id ;
private String  arrival_time ;
private String departure_time ;
private int stop_id ;
private int stop_sequence ;
private String stop_headsign ;
private int pickup_type ;
private int drop_off_type ;
private int shape_dist_traveled ;
private int timepoint ;

    public StopTimes(String trip_id, String arrival_time, String departure_time, int stop_id, int stop_sequence,  int pickup_type, int drop_off_type) {
        this.trip_id = trip_id;
        this.arrival_time = arrival_time;
        this.departure_time = departure_time;
        this.stop_id = stop_id;
        this.stop_sequence = stop_sequence;
        this.stop_headsign = "''";
        this.pickup_type = pickup_type;
        this.drop_off_type = drop_off_type;
        this.shape_dist_traveled = 0;
        this.timepoint = 0;
    }

    public String getTrip_id() {
        return trip_id;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public int getStop_id() {
        return stop_id;
    }

    public int getStop_sequence() {
        return stop_sequence;
    }

    public String getStop_headsign() {
        return stop_headsign;
    }

    public int getPickup_type() {
        return pickup_type;
    }

    public int getDrop_off_type() {
        return drop_off_type;
    }

    public int getShape_dist_traveled() {
        return shape_dist_traveled;
    }

    public int getTimepoint() {
        return timepoint;
    }

static private ArrayList<StopTimes> List=new ArrayList<StopTimes>();

    public static ArrayList<StopTimes> getList() {
        return List;
    }
    
    
    public void AddL(StopTimes object) {
    List.add(object);
System.out.print("");
}
}