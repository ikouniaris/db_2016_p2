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
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class FileUtilities {

//Blank constructor
    public FileUtilities() {

    }

    //Loading Connections from files
    public void LoadFiles() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("agency.txt"), "UTF-8"));

        String line = null;
        while ((line = br.readLine()) != null) {
            String[] lines = line.split(",");
            Agency tempAgency = new Agency(lines[0].replaceAll("\"", "\'"), lines[1].replaceAll("\"", "\'"), lines[2].replaceAll("\"", "\'"), lines[3].replaceAll("\"", "\'"), lines[4].replaceAll("\"", "\'"));
            tempAgency.AddL(tempAgency);
        }

        br.close();

        br = new BufferedReader(new InputStreamReader(
                new FileInputStream("calendar.txt"), "UTF-8"));
        line = null;
        while ((line = br.readLine()) != null) {
            String[] lines = line.split(",");
            Calendar tempCalendar = new Calendar(lines[0].replaceAll("\"", "\'"), Integer.parseInt(lines[1]), Integer.parseInt(lines[2]), Integer.parseInt(lines[3]), Integer.parseInt(lines[4]), Integer.parseInt(lines[5]), Integer.parseInt(lines[6]), Integer.parseInt(lines[7]), lines[8].replaceAll("\"", "\'"), lines[9].replaceAll("\"", "\'"));
            tempCalendar.AddL(tempCalendar);
        }

        br.close();

        br = new BufferedReader(new InputStreamReader(
                new FileInputStream("calendardates.txt"), "UTF-8"));
        line = null;
        while ((line = br.readLine()) != null) {
            String[] lines = line.split(",");
            Calendardates tempCalendardates = new Calendardates(lines[0].replaceAll("\"", "\'"), lines[1].replaceAll("\"", "\'"), Integer.parseInt(lines[2]));
            tempCalendardates.AddL(tempCalendardates);
        }

        br.close();

        /*
         br = new BufferedReader(new FileReader("feedinfo.txt"));

         line = null;
        while ((line = br.readLine()) != null) {
            String[] lines = line.split(",");
            Feedinfo tempfeedinfo = new Feedinfo(lines[0],lines[1],lines[2],lines[3]));
            tempfeedinfo.AddL(tempfeedinfo);
        }

        br.close();
         */
        br = new BufferedReader(new InputStreamReader(
                new FileInputStream("routes.txt"), "UTF-8"));
        line = null;
        while ((line = br.readLine()) != null) {
            String[] lines = line.split(",");
            Routes tempRoutes = new Routes(lines[0].replaceAll("\"", "\'"), lines[1].replaceAll("\"", "\'"), lines[2].replaceAll("\"", "\'"), lines[3].replaceAll("\"", "\'"), lines[4].replaceAll("\"", "\'"), lines[5].replaceAll("\"", "\'"), lines[6].replaceAll("\"", "\'"));
            tempRoutes.AddL(tempRoutes);
        }

        br.close();

        /*
         br = new BufferedReader(new FileReader("shapes.txt"));

         line = null;
        while ((line = br.readLine()) != null) {
            String[] lines = line.split(",");
            Links templink = );
            templink.AddL(templink);
        }

        br.close();
         */
        br = new BufferedReader(new InputStreamReader(
                new FileInputStream("stops.txt"), "UTF-8"));
        line = null;
        while ((line = br.readLine()) != null) {
            String[] lines = line.split(",");
            Stops tempStops = new Stops(Integer.parseInt(lines[0]), lines[1].replaceAll("\"", "\'"), lines[2].replaceAll("\"", "\'"), lines[3].replaceAll("\"", "\'"), Double.parseDouble(lines[4]), Double.parseDouble(lines[5]), Integer.parseInt(lines[6]));
            tempStops.AddL(tempStops);
        }

        br.close();

        br = new BufferedReader(new InputStreamReader(
                new FileInputStream("stoptimes.txt"), "UTF-8"));
        line = null;
        while ((line = br.readLine()) != null) {
            String[] lines = line.split(",");
            StopTimes tempStoptimes = new StopTimes(lines[0].replaceAll("\"", "\'"), lines[1].replaceAll("\"", "\'"), lines[2].replaceAll("\"", "\'"), Integer.parseInt(lines[3]), Integer.parseInt(lines[4]), Integer.parseInt(lines[5]), Integer.parseInt(lines[6]));
            tempStoptimes.AddL(tempStoptimes);
        }

        br.close();

        br = new BufferedReader(new InputStreamReader(
                new FileInputStream("trips.txt"), "UTF-8"));
        line = null;
        while ((line = br.readLine()) != null) {
            String[] lines = line.split(",");
            Trips tempTrips = new Trips(lines[0].replaceAll("\"", "\'"), lines[1].replaceAll("\"", "\'"), lines[2].replaceAll("\"", "\'"), lines[3].replaceAll("\"", "\'"), Integer.parseInt(lines[4]), lines[5].replaceAll("\"", "\'"));
            tempTrips.AddL(tempTrips);
        }

        br.close();

    }

}
