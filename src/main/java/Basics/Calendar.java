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

public class Calendar {
 private  String service_id ;
private int monday ;
private int tuesday ;
private int wednesday ;
private int thursday ;
private int friday ;
private int saturday ;
private int sunday ;
private String start_date ;
private String end_date ;

    public Calendar(String service_id, int monday, int tuesday, int wednesday, int thursday, int friday, int saturday, int sunday, String start_date, String end_date) {
        this.service_id = service_id;
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public String getService_id() {
        return service_id;
    }

    public int getMonday() {
        return monday;
    }

    public int getTuesday() {
        return tuesday;
    }

    public int getWednesday() {
        return wednesday;
    }

    public int getThursday() {
        return thursday;
    }

    public int getFriday() {
        return friday;
    }

    public int getSaturday() {
        return saturday;
    }

    public int getSunday() {
        return sunday;
    }

    public String getstart_date() {
        return start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

static private ArrayList<Calendar> List=new ArrayList<Calendar>();

    public static ArrayList<Calendar> getList() {
        return List;
    }

    
    public void AddL(Calendar object) {
    List.add(object);
    
}
}