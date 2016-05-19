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

public class Trips {
private   String  route_id ;
private String service_id;
private String trip_id ;
private String trip_headsign ;
private String  trip_short_name ;
private int direction_id ;
private String block_id ;
private String  shape_id ;
private int wheelchair_accessible;
private int bikes_allowed ;

    public Trips(String route_id, String service_id, String trip_id, String trip_headsign,  int direction_id, String block_id) {
        this.route_id = route_id;
        this.service_id = service_id;
        this.trip_id = trip_id;
        this.trip_headsign = trip_headsign;
        this.trip_short_name = "''";
        this.direction_id = direction_id;
        this.block_id = block_id;
        this.shape_id = "";
        this.wheelchair_accessible = 0;
        this.bikes_allowed = 0;
    }

    public String getRoute_id() {
        return route_id;
    }

    public String getService_id() {
        return service_id;
    }

    public String getTrip_id() {
        return trip_id;
    }

    public String getTrip_headsign() {
        return trip_headsign;
    }

    public String getTrip_short_name() {
        return trip_short_name;
    }

    public int getDirection_id() {
        return direction_id;
    }

    public String getBlock_id() {
        return block_id;
    }

    public String getShape_id() {
        return shape_id;
    }

    public int getWheelchair_accessible() {
        return wheelchair_accessible;
    }

    public int getBikes_allowed() {
        return bikes_allowed;
    }
ArrayList<Trips> List = new ArrayList<Trips>();

    public ArrayList<Trips> getList() {
        return List;
    }

    
   public void AddL(Trips object) {
    List.add(object);
    System.out.print("");
}
    
}

