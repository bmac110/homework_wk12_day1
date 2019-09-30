import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jimmy", "J1MG54", 1000);
    }


    @Test
    public void canGetName(){
        assertEquals("Jimmy", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNum(){
        assertEquals("J1MG54", databaseAdmin.getNiNum());
    }

    @Test
    public void canGetSalary(){
        assertEquals(1000, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(1100, databaseAdmin.raiseSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(10, databaseAdmin.payBonus());
    }
}
