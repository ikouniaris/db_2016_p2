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


public class Transfers {
 private int    from_stop_id ;
 private int to_stop_id ;
 private int transfer_type ;
 private int min_transfer_time;

    public Transfers(int from_stop_id, int to_stop_id, int transfer_type, int min_transfer_time) {
        this.from_stop_id = from_stop_id;
        this.to_stop_id = to_stop_id;
        this.transfer_type = transfer_type;
        this.min_transfer_time = min_transfer_time;
    }

    public int getFrom_stop_id() {
        return from_stop_id;
    }

    public int getTo_stop_id() {
        return to_stop_id;
    }

    public int getTransfer_type() {
        return transfer_type;
    }

    public int getMin_transfer_time() {
        return min_transfer_time;
    }
 
 
 ArrayList<Transfers> List = new ArrayList<Transfers>();

    public ArrayList<Transfers> getList() {
        return List;
    }
 public void AddL(Transfers object) {
    List.add(object);
    System.out.print("");
}
 
}
