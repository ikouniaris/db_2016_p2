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

public class Farerules {
  private String   fare_id ;
private String route_id ;
private String origin_id ;
private int destination_id ;
private String contains_id ;

    public Farerules(String fare_id, String route_id, String origin_id, int destination_id, String contains_id) {
        this.fare_id = fare_id;
        this.route_id = route_id;
        this.origin_id = origin_id;
        this.destination_id = destination_id;
        this.contains_id = contains_id;
    }

    public String getFare_id() {
        return fare_id;
    }

    public String getRoute_id() {
        return route_id;
    }

    public String getOrigin_id() {
        return origin_id;
    }

    public int getDestination_id() {
        return destination_id;
    }

    public String getContains_id() {
        return contains_id;
    }

ArrayList<Farerules> List = new ArrayList<Farerules>();

    public ArrayList<Farerules> getList() {
        return List;
    }

    public void AddL(Farerules object) {
    List.add(object);
    
}}
