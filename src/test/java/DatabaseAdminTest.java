import Staff.techStaff.DatabaseAdmin;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Gillian", "NW473463", 20000);
    }

    @Test
    public void databaseAdminHasName(){
        assertEquals("Gillian", databaseAdmin.getName());
    }

    @Test
    public void databaseAdminHasNiNumber(){
        assertEquals("NW473463", databaseAdmin.getNiNumber());
    }

    @Test
    public void databaseAdminHasSalary(){
        assertEquals(20000, databaseAdmin.getSalary());
    }


    @Test
    public void canRaiseSalary(){
        assertEquals(30000.0, databaseAdmin.raiseSalary(0.5));
    }

    @Test
    public void canPayBonus(){
        assertEquals(200.0, databaseAdmin.payBonus());
    }


}

