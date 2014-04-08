package lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joe
 */
public class Lab1 {
    private static int counter;
    
     public static void main(String[] args) throws IOException{
         
         System.out.println("First Task: \n");
         File data = new File("src" + File.separatorChar + "Lab1.txt");
        

  if (data.exists()){
        BufferedReader in = null;
        
        
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
	   while(line != null){
		  System.out.println(line);
		  line = in.readLine();  // strips out any carriage return chars
	   }

        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
        
            System.out.println("\nSecond Task: \n");
            List<String> fileContents = new ArrayList<String>();
            try{
                in = new BufferedReader(new FileReader(data));
                String line = in.readLine();
                while(line != null){
		  fileContents.add(line);
		  line = in.readLine();  // strips out any carriage return chars
	   }

        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
            }
            for(int i = 0; i < fileContents.size(); i ++){
                if ( i > 5 && i < 10){
                    System.out.println(fileContents.get(i));
                
                    
                }
            }
            
            System.out.println("\nThird Task: \n");
            fileContents.add("\nJim Drew 2222 N Farwell Ave\nMilwaukee, WI 53202\n"
                    + "JimDrew@outlook.com\n(262)854-4525\n");
            try{
                in = new BufferedReader(new FileReader(data));
                String line = in.readLine();
                while(line != null){

		  line = in.readLine();  // strips out any carriage return chars
	   }

        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
            }
            for (String s : fileContents){
                System.out.println(s);
            
      }
    } 
  }        
} 
  
    
    

