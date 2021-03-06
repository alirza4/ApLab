import java.util.Objects;

public class Vote {
    private Person person;
    private String date;
    public Vote(Person person,String date){
        this.person=person;
        this.date=date;
    }

    /**
     * @return person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * @return data
     */
    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return person.equals(vote.person) && date.equals(vote.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, date);
    }
}