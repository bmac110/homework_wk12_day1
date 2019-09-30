import management.Director;
import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Jimmy", "J1MG54", 1000, "boss dept", 200.00);
    }

    @Test
    public void canGetBudget(){
        assertEquals(200.00, director.getBudget(), 0.01);
    }


    @Test
    public void canGetName(){
        assertEquals("Jimmy", director.getName());
    }

    @Test
    public void canGetNiNum(){
        assertEquals("J1MG54", director.getNiNum());
    }

    @Test
    public void canGetSalary(){
        assertEquals(1000, director.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(1100, director.raiseSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(10, director.payBonus());
    }
}
