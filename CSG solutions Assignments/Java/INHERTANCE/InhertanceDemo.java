package Java.INHERTANCE;


public class InhertanceDemo {
    public static void main(String[] args) {
           Manager m = new Manager("Raj", 10000, 1, 5000);
           int s= m.salary();
           
           m.getDetails();
           System.out.println("Salary of "+m.name+" is: "+s);
    }
 

}