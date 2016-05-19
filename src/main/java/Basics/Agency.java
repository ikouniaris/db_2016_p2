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

public class Agency {
  private  String agency_id;
 private   String agency_name;
  private  String agency_url;
 private   String agency_timezone;
 private   String agency_lang;
private    String agency_phone;
 private   String agency_fare_url;
 private   String agency_email;

    public Agency( String agency_name, String agency_url, String agency_timezone, String agency_lang, String agency_phone) {
        this.agency_id = "'1'";
        this.agency_name = agency_name;
        this.agency_url = agency_url;
        this.agency_timezone = agency_timezone;
        this.agency_lang = agency_lang;
        this.agency_phone = agency_phone;
        this.agency_fare_url = "''";
        this.agency_email = "''";
    }

    public String getAgency_id() {
        return agency_id;
    }

    public String getAgency_name() {
        return agency_name;
    }

    public String getAgency_url() {
        return agency_url;
    }

    public String getAgency_timezone() {
        return agency_timezone;
    }

    public String getAgency_lang() {
        return agency_lang;
    }

    public String getAgency_phone() {
        return agency_phone;
    }

    public String getAgency_fare_url() {
        return agency_fare_url;
    }

    public String getAgency_email() {
        return agency_email;
    }
 
 static private ArrayList<Agency> List =new ArrayList<Agency>();

    public static ArrayList<Agency> getList() {
        return List;
    }
 
    public void AddL(Agency object) {
    List.add(object);
 
}}
