package task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Handler {

    public Scanner ReadData;
    public ArrayList competitor = new ArrayList<>();
    public ArrayList attemptarr = new ArrayList<>();
    public ArrayList routinearr = new ArrayList<>();
    public ArrayList event = new ArrayList<>();
    public ArrayList commiteemenber = new ArrayList<>();
    public Competition compet;
    public String filename = "gymnastics.txt";

    public void read() {
        String id, name, Score, routine, attempt, difficultyrating, eventname, time, committeemember;
        try {
            ReadData = new Scanner(new File(filename));
            ReadData.useDelimiter("[,\n]");
            while (ReadData.hasNext()) {
                id = ReadData.next();
                name = ReadData.next();
                Score = ReadData.next();
                routine = ReadData.next();
                attempt = ReadData.next();
                difficultyrating = ReadData.next();
                eventname = ReadData.next();
                time = ReadData.next();
                committeemember = ReadData.next();

                competitor.add(new Compititor(id, name));
                attemptarr.add(new Attempt(Integer.parseInt(attempt.trim()), Integer.parseInt(Score.trim())));
                routinearr.add(new Routine(routine, Integer.parseInt(difficultyrating.trim())));
                event.add(new Event(eventname, time));
                commiteemenber.add(new CommitteeMember(committeemember));
                compet = new Competition(competitor, event, commiteemenber);
            }
        }
        catch (FileNotFoundException | NumberFormatException e)
       {
           System.out.println("Unexptected Error Occured " + e);   
           System.out.println("There's something wrong with the file: " + filename);
       }
    }

    public void displayEventInfo(String searchevent) {
        
        String res = "| Competitor Number | Competitor Name | Committe Member |";
        int i = 0;
        for (Object ev : event) {
            Event e = (Event) ev;
            Compititor c = (Compititor) competitor.get(i);
            CommitteeMember cm = (CommitteeMember) commiteemenber.get(i);

            if (e.getDescription().toLowerCase().contains(searchevent.toLowerCase())) {
                res += "\n          " + c.getCompititorNumber() + "              " + c.getName() + "                " + cm.getCommitteeMemberName();

                i++;

            } else {
                i++;
            }

        }
        System.out.println(res);

    }

    public void displaycompetitorevent(String cname) {
        String res = "Event Names: ";
        boolean found = false;
        ArrayList<String> eventlist = new ArrayList<String>();
        int i = 0;
        for (Object comp : competitor) {
            Compititor c = (Compititor) comp;
            Event e = (Event) event.get(i);

            if (c.getName().toLowerCase().trim().equals(cname.toLowerCase().trim())) {
                res += "\n" + e.getDescription();
                eventlist.add(e.getDescription());
                found = true;
                i++;
            } else {
                i++;
            }
        }

        if (found) {
            System.out.println(res);
            for (int j = 0; j < eventlist.size(); j++) {
                displayroutineandrating(eventlist.get(j));
                System.out.println("...................................................");
            }
        } else {
            System.out.println("Competitor not found:");
            System.out.println("Please Try Again");
        }

    }

    private void displayroutineandrating(String searchevent) {

        System.out.println("\n" + searchevent + " :");
        String res = "| Routine Description | Difficulty Rating |";
        int i = 0;
        for (Object ev : event) {
            Event e = (Event) ev;
            Routine r = (Routine) routinearr.get(i);

            if (e.getDescription().toLowerCase().contains(searchevent.toLowerCase().trim())) {
                res += "\n     " + r.getDescription() + "               " + r.getDifficultyRating();
                i++;
            } else {
                i++;
            }

        }

        System.out.println(res);
    }

    public void displayeventattempts(String searchevent) {

        String res = "| Attempts | Competitor Name | Routine description | Dificulty Rating | Score |";
        int i = 0;
        for (Object ev : event) {
            Event e = (Event) ev;
            Compititor c = (Compititor) competitor.get(i);
            Routine r = (Routine) routinearr.get(i);
            Attempt a = (Attempt) attemptarr.get(i);

            if (e.getDescription().toLowerCase().equals(searchevent.toLowerCase().trim())) {
                res += "\n      " + a.getAttempt() + "           " + c.getName() + "               " + r.getDescription() + "             " + r.getDifficultyRating() + "              " + a.getScore();
                i++;
            } else {
                i++;
            }
        }
        System.out.println(res);
    }

    public void displaycompetition() {
        compet.toStringDisplayCompetition();
    }
}
