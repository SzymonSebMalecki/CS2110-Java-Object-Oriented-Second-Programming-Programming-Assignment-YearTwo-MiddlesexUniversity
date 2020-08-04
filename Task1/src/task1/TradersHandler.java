package task1;
import java.io.*;
import java.util.*;

public class TradersHandler {
    Trader Objtrader;
    ArrayList trader = new ArrayList();
    public String filename = "traders.txt";
    
    public void readTraderDataFromFile()
    { 
        int i = 1;
        Scanner ReadData;
        String companyName, location, services, noemployees, dailyrate, description;
        
        try {
           ReadData = new Scanner(new File(filename));
           ReadData.useDelimiter("[,\n]");
           while (ReadData.hasNext())
           {
               companyName= ReadData.next();
               location = ReadData.next();
               services = ReadData.next();
               noemployees= ReadData.next();
               dailyrate= ReadData.next();
               description= ReadData.next();
               trader.add(new Trader(i,companyName, location, services, Integer.parseInt(noemployees.trim()), Integer.parseInt(dailyrate.trim()), description));
               i++;
             }
           }
       
       catch (FileNotFoundException | NumberFormatException e)
       {
           System.out.println("Unexptected Error Occured " + e);   
           System.out.println("There's something wrong with the file: " + filename);
       }
    }
    
    public void displayAllTraderData()
    {
        System.out.println("......................................................................................................................");
        System.out.println("| ID | Company Name | Location | Services Offered |");
        System.out.println("......................................................................................................................");
       
        for(Object tr:trader)
        {
            Trader t = (Trader) tr;
            System.out.println("|"+ t.getId() +" | "+t.getCompanyName()+" | "+t.getLocation()+" | "+ t.getServices().replace('.', ',')+" | ");
        }
        System.out.println("......................................................................................................................");
    }
    
    public void displayCompanyName(int id)
    {
        System.out.println("...................................................................................................................... ");
        System.out.println("");
        System.out.println(trader.get(id-1));
        System.out.println("...................................................................................................................... ");
        
    }
    
    public void searchSpecificLocation(String location)
    {
        boolean check = false;
        System.out.println("......................................................................................................................");
        System.out.println("| ID | Company Name | Location | Services Offered  |");
        System.out.println("......................................................................................................................");
       
        for (Object tr:trader)
        {
            Trader t = (Trader) tr;
            if (t.getLocation().trim().toLowerCase().equals(location.trim().toLowerCase()))
            {
                 System.out.println("| "+t.getId() +" | "+t.getCompanyName()+" | "+t.getLocation()+" | "+ t.getServices().replace('.', ',')+" | ");
                 check = true;
            }
        }
         System.out.println("...................................................................................................................... ");
        if (!check)
        {
            System.out.println("No Such Location Exists: " + location);
            System.out.println("Please Try Again");
        }
    }
    
    public void searchCompanyServices(String Service)
    {
        boolean check =false;
        System.out.println("......................................................................................................................");
        System.out.println("| ID | Company Name | Location | Services Offered  |");
        System.out.println("......................................................................................................................");
        
        for (Object tr:trader)
        {
            Trader t = (Trader) tr;
            if (t.getServices().trim().toLowerCase().contains(Service.trim().toLowerCase()))
            {
                System.out.println("| "+t.getId() +" | "+t.getCompanyName()+" | "+t.getLocation()+" | "+ t.getServices().replace('.', ',')+" | ");
                check = true;
            }
        }
         System.out.println("......................................................................................................................");
        
        if (!check)
        {
            System.out.println("No Such Service Exists" + Service);
            System.out.println("Please Try Again");
        } 
    }
}
