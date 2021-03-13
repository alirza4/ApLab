package Danesh;

public class Student {
    private String FirstName;
    private String LastName;
    private String Id;
    private int Grade;
    public Student(String fName, String lname, String sID){
        FirstName = fName;
        LastName = lname;
        Id = sID;
        Grade = 0;
    }
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public int getGrade() {
        return Grade;
    }
    public void setGrade(int grade) {
        Grade = grade;
    }
   public void print(){
       System.out.printf("%s %s(%s): %d\n ", FirstName, LastName, Id, Grade);
    }
    public static void main(String[] args){
        Student num1=new Student("mamad","mamadi", "9931074");
        Student num2=new Student("ali","alavai", "9931064");
        Student num3=new Student("Ehsan","Edalat", "9031066");

        num1.setGrade(10);
        num1.print();
        num2.setGrade(20);
        num2.print();
        num3.print();
    }

}
