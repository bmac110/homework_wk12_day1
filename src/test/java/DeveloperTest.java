import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Jimmy", "J1MG54", 1000);
    }


    @Test
    public void canGetName(){
        assertEquals("Jimmy", developer.getName());
    }

    @Test
    public void canGetNiNum(){
        assertEquals("J1MG54", developer.getNiNum());
    }

    @Test
    public void canGetSalary(){
        assertEquals(1000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(1100, developer.raiseSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(10, developer.payBonus());
    }
}
