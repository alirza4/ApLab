import ir.huri.jcal.JalaliCalendar;

import java.util.*;
import java.util.Map.Entry;

/**
 * make a type of voting with question and candidate
 */
public class Voting {
    private int type;
    private String question;
    private ArrayList<Person> voters;
    private HashMap<String, HashSet<Vote>> polls;
    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
        voters = new ArrayList<>();
        polls = new HashMap<>();
    }

    /**
     * create new candidate for voting
     * @param choice candidate of voting
     */
    public void CreatePoll(String choice) {
        polls.put(choice,new HashSet<>());
    }
    /**
     * @return Arraylist of candidate
     */
    public ArrayList<String> getPolls() {
        ArrayList<String> choice = new ArrayList<>();
        for (Entry<String,HashSet<Vote>> jn : polls.entrySet()) {
            choice.add(jn.getKey());
        }
        return choice;
    }
    /**
     * register new vote
     * @param person voter
     * @param choice Arraylist of all candidate
     */
    public void Vote(Person person,ArrayList<String> choice) {
        JalaliCalendar jalaliCalendar = new JalaliCalendar(new GregorianCalendar());
        Vote vote = new Vote(person,jalaliCalendar.toString());
            for (String i:choice) {
                HashSet<Vote> votee = polls.get(i);
                if (votee == null) {
                    votee = new HashSet<>();
                }
                votee.add(vote);
                polls.put(i,votee);
                voters.add(person);
            }
    }

    /**
     * print votes of candidtate and info of winner
     */
    public void PrintVotes() {
        HashMap<String, Integer> Hmap = new HashMap<>();
        int counter=0;
        ArrayList<String> winner = new ArrayList<String>();
        for (Entry<String,HashSet<Vote>> jn : polls.entrySet()) {
            HashSet<Vote> Qvote = jn.getValue();
            Hmap.put(jn.getKey(),jn.getValue().size());
            System.out.println(++counter +")" + jn.getKey() + "'point: " + Qvote.size());
            for (Vote i : Qvote) {
                System.out.println(i.getPerson().toString() + " Info: " + i.getDate());
            }

        }
        int max = Collections.max(Hmap.values());
        for (Entry<String,Integer> jn : Hmap.entrySet()) {
            if (jn.getValue() == max) {
                winner.add(jn.getKey());
            }
        }
        if (winner.size()==1){
            System.out.println("the winner is :" + winner.get(0));
        }
        else if (winner.size()>1){
            System.out.println("the winners are :");
            for (String s : winner) {
                System.out.println(s);
            }
        }
    }

    /**
     * print vote question and candidate
     */
    public void PrintChoices() {
        System.out.println(question + ": ");
        ArrayList<String> condidates = getPolls();
        int counter=0;
        for (String i : condidates) {
            System.out.println(++counter + ") "+ i);
        }
        System.out.println(++counter + ") Random");
    }
}