package staff;


public abstract class Employee {

    private String name;
    private String niNum;
    private int salary;

    public Employee(String name, String niNum, int salary){
        this.name = name;
        this.niNum= niNum;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNum() {
        return niNum;
    }

    public int getSalary() {
        return salary;
    }

    public double raiseSalary(){
        double result = getSalary() * 1.1;
        if(result < 0){
            result = 0;
        }
        return result;
    }

    public int payBonus(){
        int bonus = (int)(getSalary() * (1.0f/100.0f));
        return bonus;
    }

    public String setName(String name) {
        if(name.trim().isEmpty()) {
            return "Please enter a name";
        }
        else {
            return this.name = name;
        }
    }
}
