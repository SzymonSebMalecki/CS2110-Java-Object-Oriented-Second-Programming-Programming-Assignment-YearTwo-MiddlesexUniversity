package task1;

public class Trader {
    private int id;
    private String companyName;
    private String location;
    private String services;
    private int numEmployees;
    private double dailyRate;
    private String description;
  
    public Trader(int id ,String companyName, String location, String services, int numEmployees, double dailyRate, String description) {
        this.companyName = companyName;
        this.location = location;
        this.services = services;
        this.numEmployees = numEmployees;
        this.dailyRate = dailyRate;
        this.description = description;
        this.id =id;
    }

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getLocation() {
        return location;
    }

    public String getServices() {
        return services;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public String getDescription() {
        return description;
    }
    
    //To String Method
    @Override
    public String toString()
    {
        String CompanyData = 
                "Company name:  "+ companyName + "\n" 
                + "Location: "+ location +"\n"
                +"Service offered: " + services +"\n"
                +"Number of employees: "+ numEmployees +"\n"
                +"Daily call out rate(£): "+ dailyRate +"\n"
                +"Other information: "+ description +"\n";
        return CompanyData;
    }  
}
