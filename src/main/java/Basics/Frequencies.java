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

public class Frequencies {
  private String   trip_id ;
 private String start_time ;
 private String end_time ;
private int headway_secs ;
private int exact_times ;
 private String fare_id ;

    public Frequencies(String trip_id, String start_time, String end_time, int headway_secs, int exact_times, String fare_id) {
        this.trip_id = trip_id;
        this.start_time = start_time;
        this.end_time = end_time;
        this.headway_secs = headway_secs;
        this.exact_times = exact_times;
        this.fare_id = fare_id;
    }

    public String getTrip_id() {
        return trip_id;
    }

    public String getStart_time() {
        return start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public int getHeadway_secs() {
        return headway_secs;
    }

    public int getExact_times() {
        return exact_times;
    }

    public String getFare_id() {
        return fare_id;
    }
 
 ArrayList<Frequencies> List = new ArrayList<Frequencies>();

    public ArrayList<Frequencies> getList() {
        return List;
    }
 
 
    public void AddL(Frequencies object) {
    List.add(object);
  System.out.print("");  
}}
