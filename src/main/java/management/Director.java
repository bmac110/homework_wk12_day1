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
}
