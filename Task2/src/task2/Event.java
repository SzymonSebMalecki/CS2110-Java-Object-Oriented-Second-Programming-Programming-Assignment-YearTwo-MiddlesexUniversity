
package task2;


public class Event {
    private String description;
    private String starttime;

    public Event(String description, String starttime) {
        this.description = description;
        this.starttime = starttime;
    }

    public String getDescription() {
        return description;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }
    
    
}
