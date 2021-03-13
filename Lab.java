package Danesh;

public class Lab {
    private Student[] students;
    private float avg;
    private String day;
    private String Cname;
    private String Tname;
    private int capacity;
    private int currentSize;
    public Lab(int cap, String d,String cname,String tname ) {
        capacity=cap;
        day=d;
        Cname=cname;
        Tname=tname;
        students= new Student[capacity];
    }
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Danesh.Lab is full!!!");
        }
    }
    public void print() {
        calculateAvg();
        for (int i = 0; i < currentSize; i++) {
            System.out.println("std fname: " + students[i].getFirstName()
                     + " std id:" + students[i].getId()
                     + " std grade:"+ students[i].getGrade());
        }
        System.out.println("Danesh.Lab AVG:" + getAvg());

    }

    public String getCname() {
        return Cname;
    }

    public String getTname() {
        return Tname;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public float getAvg() {
        return avg;
    }

    public void calculateAvg() {
        int n=0 ;
        float temp,sum=0;
     for (int j=0;j<currentSize;j++){
         temp=students[j].getGrade();
         sum+=temp;
         n++;
     }
     avg=sum/n;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public static void main(String[] args){

        Student num1=new Student("mamad","mamadi", "9931074");
        Student num2=new Student("ali","alavai", "9931064");
        Student num3=new Student("Ehsan","Edalat", "9031066");
        Lab c1= new Lab(15,"sun","AP","Edalat");
        num1.setGrade(10);
        num2.setGrade(20);
        num3.setGrade(14);
        c1.enrollStudent(num1);
        c1.enrollStudent(num2);
        c1.enrollStudent(num3);
        c1.print();

    }

}
