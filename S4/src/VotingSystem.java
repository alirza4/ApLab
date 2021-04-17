import java.util.ArrayList;
import java.util.Iterator;

public class VotingSystem {
    private ArrayList<Voting> votingList;

    public VotingSystem() {
        votingList = new ArrayList<>();
    }
    /**
     * create voting
     * @param question question of voting
     * @param type type of voting
     * @param candidatelist Arraylist of candidate
     */
    public void CreateVoting(String question, int type,ArrayList<String> candidatelist) {
        Voting voting=new Voting(type,question);
        Iterator<String > it=candidatelist.iterator();
        while(it.hasNext()){
            voting.CreatePoll(it.next());
        }
        votingList.add(voting);
    }
    /**
     * print question and candidate in voting.
     * @param index index of voting.
     */
    public void PrintVoting(int index){
        votingList.get(index).PrintChoices();
    }
    /**
     * add vote to voting
     * @param index index of voting
     * @param person voter
     * @param choice Arraylist of voter'choices
     */
    public void Vote(int index,Person person,ArrayList<String> choice) {
        votingList.get(index).Vote(person,choice);

    }
    /**
     * print result of voting
     * @param index index of voting
     */
    public void PrintResult(int index){
        votingList.get(index).PrintVotes();
    }
}