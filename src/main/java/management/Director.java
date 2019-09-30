package management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String niNum, int salary, String deptName, double budget){
        super("Jimmy", "J1MG23", 1000, "sausage dept");
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double raiseSalary(){
        double result = getSalary() * 1.2;
        if(result < 0){
            result = 0;
        }
        return result;
    }

    @Override
    public int payBonus(){
        int bonus = (int)(getSalary() * (2.0f/100.0f));
        return bonus;
    }
}
