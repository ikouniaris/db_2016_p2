/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;


/**
 *
 * @author Ilianna
 */
import java.io.IOException;
//Main Class.
public class Main {

    public static void main(String[] args) throws IOException {

        
       
       
       FileUtilities fl=new FileUtilities();
       
       
       //Loading information from files
       fl.LoadFiles();
         

    /* 
       //Database managment
        Database dtbs=new Database();
        dtbs.Connect();
      
        //Writting data to database
        try {      
        dtbs.writeToDB();
       
        }catch (DBHasDataException e) {
            //if database has data, resets it
            dtbs.resetDatabase();
            e.printStackTrace();
        } 

        
        //Closes the connection
        dtbs.closeConnection();
        */
    }

}
