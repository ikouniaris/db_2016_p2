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

public class Shapes {
   private String shape_id ;
private String shape_pt_lat ;
private String shape_pt_lon ;
private int shape_pt_sequence;
private int shape_dist_traveled;

    public Shapes(String shape_id, String shape_pt_lat, String shape_pt_lon, int shape_pt_sequence, int shape_dist_traveled) {
        this.shape_id = shape_id;
        this.shape_pt_lat = shape_pt_lat;
        this.shape_pt_lon = shape_pt_lon;
        this.shape_pt_sequence = shape_pt_sequence;
        this.shape_dist_traveled = shape_dist_traveled;
    }

    public String getShape_id() {
        return shape_id;
    }

    public String getShape_pt_lat() {
        return shape_pt_lat;
    }

    public String getShape_pt_lon() {
        return shape_pt_lon;
    }

    public int getShape_pt_sequence() {
        return shape_pt_sequence;
    }

    public int getShape_dist_traveled() {
        return shape_dist_traveled;
    }

static private ArrayList<Shapes> List=new ArrayList<Shapes>();

    public static ArrayList<Shapes> getList() {
        return List;
    }

    
    public void AddL(Shapes object) {
    List.add(object);
 System.out.print("");   
}
}