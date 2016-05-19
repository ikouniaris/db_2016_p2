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

public class Stops {

    private int stop_id;
    private String stop_code;
    private String stop_name;
    private String stop_desc;
    private double stop_lat;
    private double stop_lon;
    private int zone_id;
    private String stop_url;
    private int location_type;
    private int parent_station;
    private String stop_timezone;
    private int wheelchair_boarding;

    public Stops(int stop_id, String stop_code, String stop_name, String stop_desc, double stop_lat, double stop_lon,   int location_type) {
        this.stop_id = stop_id;
        this.stop_code = stop_code;
        this.stop_name = stop_name;
        this.stop_desc = stop_desc;
        this.stop_lat = stop_lat;
        this.stop_lon = stop_lon;
        this.zone_id = 0;
        this.stop_url = "''";
        this.location_type = location_type;
        this.parent_station = 0;
        this.stop_timezone = "''";
        this.wheelchair_boarding = 0;
    }

    public int getStop_id() {
        return stop_id;
    }

    public String getStop_code() {
        return stop_code;
    }

    public String getStop_name() {
        return stop_name;
    }

    public String getStop_desc() {
        return stop_desc;
    }

    public double getStop_lat() {
        return stop_lat;
    }

    public double getStop_lon() {
        return stop_lon;
    }

    public int getZone_id() {
        return zone_id;
    }

    public String getStop_url() {
        return stop_url;
    }

    public int getLocation_type() {
        return location_type;
    }

    public int getParent_station() {
        return parent_station;
    }

    public String getStop_timezone() {
        return stop_timezone;
    }

    public int getWheelchair_boarding() {
        return wheelchair_boarding;
    }
    
    static private ArrayList<Stops> List=new ArrayList<Stops>();

    public static ArrayList<Stops> getList() {
        return List;
    }
    
    
     public void AddL(Stops object) {
    List.add(object);
    System.out.print("");
}
    
}
