package Java.INHERTANCE;

public class Manager extends Employee {
    int bouns;

    public Manager(String name, int salary, int id, int bouns) {
        super(name, salary, id);
        this.bouns = bouns;
    }

    public int salary() {
        int amount = salary + bouns;
        return amount;
    }
    public void getDetails(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Id: "+id);
        System.out.println("Bouns: "+bouns);
    }

}
