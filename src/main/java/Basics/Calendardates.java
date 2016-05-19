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

public class Calendardates {

    private String service_id;
    private String calendar_date;
    private int exception_type;

    public Calendardates(String service_id, String calendar_date, int exception_type) {
        this.service_id = service_id;
        this.calendar_date = calendar_date;
        this.exception_type = exception_type;
    }

    public String getService_id() {
        return service_id;
    }

    public String getCalendar_date() {
        return calendar_date;
    }

    public int getException_type() {
        return exception_type;
    }
static private ArrayList<Calendardates> List=new ArrayList<Calendardates>();

    public static ArrayList<Calendardates> getList() {
        return List;
    }
    
    public void AddL(Calendardates object) {
    List.add(object);

}}
