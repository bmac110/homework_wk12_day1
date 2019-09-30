package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String niNum, int salary, String deptName){
        super("Jimmy", "J1MG54", 1000);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
