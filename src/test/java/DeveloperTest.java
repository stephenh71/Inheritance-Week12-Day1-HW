import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Neil", "NW473464", 30000);
    }

    @Test
    public void developerHasName(){
        assertEquals("Neil", developer.getName());
    }

    @Test
    public void developerHasNiNumber(){
        assertEquals("NW473464", developer.getNiNumber());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(30000, developer.getSalary());
    }


    @Test
    public void canRaiseSalary(){
        assertEquals(45000.0, developer.raiseSalary(0.5));
    }

    @Test
    public void canPayBonus(){
        assertEquals(300.0, developer.payBonus());
    }
}


