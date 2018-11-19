import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Stephen", "NW473465", 100000, "cleaning" );
    }

    @Test
    public void managerHasName(){
        assertEquals("Stephen", manager.getName());
    }

    @Test
    public void managerHasNiNumber(){
        assertEquals("NW473465", manager.getNiNumber());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(100000, manager.getSalary());
    }

    @Test
    public void managerHasDeptName(){
        assertEquals("cleaning", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(150000.0, manager.raiseSalary(0.5));
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000.0, manager.payBonus());
    }


}


