
package task2;

import java.util.ArrayList;

public class Competition {
    private ArrayList<Compititor> competitors;
    private ArrayList<Event> events ;
    private ArrayList<CommitteeMember> committemembers;

    public Competition(ArrayList<Compititor> competitors, ArrayList<Event> events, ArrayList<CommitteeMember> committemembers) {
        this.competitors = competitors;
        this.events = events;
        this.committemembers = committemembers;
    }

    public ArrayList<Compititor> getCompetitors() {
        return competitors;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public ArrayList<CommitteeMember> getCommittemembers() {
        return committemembers;
    }

    public void setCompetitors(ArrayList<Compititor> competitors) {
        this.competitors = competitors;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public void setCommittemembers(ArrayList<CommitteeMember> committemembers) {
        this.committemembers = committemembers;
    }
    
     public ArrayList getcompetitor(String name ,String time)
    {
        ArrayList comp = new ArrayList();
       
            for (int j=0; j<events.size(); j++)
            {
                Event e2 = (Event) events.get(j);
                Compititor c = (Compititor) competitors.get(j);
                if (e2.getDescription().trim().equalsIgnoreCase(name.trim()) &&e2.getStarttime().trim().equalsIgnoreCase(time.trim()) )
                {
                    comp.add(c.getName());
                }
            }
        
        return comp;
        
    }

    public void toStringDisplayCompetition()
    {
        ArrayList compet ;
        ArrayList checked = new ArrayList();
        for (int i=0; i<events.size(); i++)
        {
            Event e = (Event) events.get(i);
            CommitteeMember cm = (CommitteeMember) committemembers.get(i);
            
            if (!checked.contains(e.getDescription()))
            {
                    compet =  getcompetitor(e.getDescription(), e.getStarttime());
                    checked.add(e.getDescription());
                    System.out.println("Event Name :"+e.getDescription());
                    System.out.println("Event Time :"+e.getStarttime());
                    System.out.println("Competitors:"+compet);
                    System.out.println("Committe Member:"+cm.getCommitteeMemberName());
                    System.out.println(".................................");
            }
        }
    }
}
    
