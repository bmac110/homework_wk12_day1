import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jimmy", "J1MG54", 1000, "egg dept");
    }

    @Test
    public void canGetDeptName(){
        assertEquals("egg dept", manager.getDeptName());
    }

    @Test
    public void canGetName(){
        assertEquals("Jimmy", manager.getName());
    }

    @Test
    public void canGetNiNum(){
        assertEquals("J1MG54", manager.getNiNum());
    }

    @Test
    public void canGetSalary(){
        assertEquals(1000, manager.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(1100, manager.raiseSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(10, manager.payBonus());
    }
}
