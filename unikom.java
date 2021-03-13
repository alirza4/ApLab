package Danesh;
public class unikom {

    private Lab[] labs;
    private float avg;
    private String nameT;
    private int capacity;
    private int currentSize;

    public unikom(int cap, String name ) {
        capacity=cap;
        nameT=name;
        labs= new Lab[capacity];
    }

    public void enrollLab(Lab clss) {
        if (currentSize < capacity) {
            labs[currentSize] = clss;
            currentSize++;
        } else {
            System.out.println("unicomp is full");
        }
    }
    public void print() {
        for (int i = 0; i < currentSize; i++) {
            System.out.println("cls name: " + labs[i].getCname()
                    + "\n cls teacher name:" + labs[i].getTname()
                    + " cls days:"+ labs[i].getDay());
        }

    }
    public String getNameT() {
        return nameT;
    }

    public void setNameT(String nameT) {
        this.nameT = nameT;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrentSize() {
        return currentSize;
    }


    public static void main(String[] args){
        Student num1=new Student("mamad","mamadi", "9931074");
        Student num2=new Student("ali","alavai", "9931064");
        Student num3=new Student("Ehsan","Edalat", "9031066");
        Student num4=new Student("Edalat","Ehsan", "9031062");
        Student num5=new Student("E","E", "9031043");


        Lab c1= new Lab(15,"Sat,Sun","AP","Edalat");
        Lab c2= new Lab(20,"Sat,Fri","Math","Kiani");
        Lab c3= new Lab(10,"Sun,Fri","Kargah","Ghasemi");


        num1.setGrade(10);
        num2.setGrade(20);
        num3.setGrade(14);
        c1.enrollStudent(num1);
        c1.enrollStudent(num2);
        c2.enrollStudent(num3);
        c2.enrollStudent(num4);
        c3.enrollStudent(num5);
        unikom u1=new unikom(5,"mamad");
        u1.enrollLab(c1);
        u1.enrollLab(c2);
        u1.enrollLab(c3);
        u1.print();



    }
}
