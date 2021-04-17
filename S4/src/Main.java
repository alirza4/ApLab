import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * voting simullation
 * @author alireza
 * @since 4-17-2021
 */
public class Main {
    /**
     * make Voting
     */
    public static void main(String[] args) {

        VotingSystem votingSystem = new VotingSystem();
        Scanner scanner=new Scanner(System.in);
        int Hwvote,NumCan;
        System.out.println("Plz enter number : (1=each person more than 1 vote) & (0=each person 1 vote)");
        Hwvote= scanner.nextInt();
        String QuesVote;
        System.out.println("Plz enter Question of Voting :");
        QuesVote=scanner.next();
        System.out.println("Plz enter number of candidate :");
        NumCan=scanner.nextInt();
        ArrayList<String> Candidate = new ArrayList<>();
        for (int j=0;j<NumCan;j++){
            System.out.println("Plz enter Candidate Number "+(j+1));
            String can=scanner.next();
            Candidate.add(can);
        }
        System.out.println("Voter Number1 Plz enter ur FirstName:");
        String Fname1=scanner.next();
        System.out.println("Voter Number1 Plz enter ur LastName:");
        String Lname1=scanner.next();
        Person Voter1 = new Person(Fname1,Lname1);
        ArrayList<String> Voter1Choices = new ArrayList<>();
        votingSystem.CreateVoting(QuesVote,Hwvote,Candidate);
        votingSystem.PrintVoting(0);
        if(Hwvote==1){
            while (true){
                System.out.println("Plz enter ur choice(String)");
                String choose=scanner.next();
                if (choose.equals("exit")) break;
                else if (choose.equals("Random")){
                    Random random = new Random();
                    int ran=random.nextInt(NumCan);
                    Voter1Choices.add(Candidate.get(ran));
                }
                else{
                    Voter1Choices.add(choose);
                }
                System.out.println(NumCan+2+") exit");
            }
            votingSystem.Vote(0,Voter1,Voter1Choices);
        }
        if(Hwvote==0){
            System.out.println("Plz enter ur choice(String)");
            String choose=scanner.next();
                if (choose.equals("Random")){
                    Random random = new Random();
                    int ran=random.nextInt(NumCan);
                    System.out.println(ran);
                    Voter1Choices.add(Candidate.get(ran));
                }
                else{
                    Voter1Choices.add(choose);
                }
            votingSystem.Vote(0,Voter1,Voter1Choices);
        }
        System.out.println("Voter Number2 Plz enter ur FirstName:");
        String Fname2=scanner.next();
        System.out.println("Voter Number2 Plz enter ur LastName:");
        String Lname2=scanner.next();
        Person Voter2 = new Person(Fname2,Lname2);
        ArrayList<String> Voter2Choices = new ArrayList<>();
        votingSystem.PrintVoting(0);
        if(Hwvote==1){
            while (true){
                System.out.println("Plz enter ur choice(String)");
                String choose=scanner.next();
                if (choose.equals("exit")) break;
                else if (choose.equals("Random")){
                    Random random = new Random();
                    int ran=random.nextInt(NumCan);
                    Voter2Choices.add(Candidate.get(ran));
                }
                else{
                    Voter2Choices.add(choose);
                }
                System.out.println(NumCan+2+") exit");
            }
            votingSystem.Vote(0,Voter2,Voter2Choices);
        }
        if(Hwvote==0){
            System.out.println("Plz enter ur choice(String)");
            String choose=scanner.next();
            if (choose.equals("Random")){
                Random random = new Random();
                int ran=random.nextInt(NumCan);
                System.out.println(ran);
                Voter2Choices.add(Candidate.get(ran));
            }
            else{
                Voter2Choices.add(choose);
            }
            votingSystem.Vote(0,Voter2,Voter2Choices);
        }
        votingSystem.PrintResult(0);
    }
}