import Staff.Management.Director;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Stephen", "NW473465", 100000, "cleaning", 5000000.00 );
    }

    @Test
    public void directorHasName(){
        assertEquals("Stephen", director.getName());
    }

    @Test
    public void directorHasNiNumber(){
        assertEquals("NW473465", director.getNiNumber());
    }

    @Test
    public void directorHasSalary(){
        assertEquals(100000, director.getSalary());
    }

    @Test
    public void directorHasBudget(){
        assertEquals(5000000.0, director.getBudget());
    }

    @Test
    public void directorHasDeptName(){
        assertEquals("cleaning", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(150000.0, director.raiseSalary(0.5));
    }

    @Test
    public void canPayBonus(){
        assertEquals(2000.0, director.payBonus());
    }

//    source :https://stackoverflow.com/questions/156503/how-do-you-assert-that-a-certain-exception-is-thrown-in-junit-4-tests/41032596
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void cannotHaveNegativeSalaryIncrease() throws IllegalArgumentException{
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Salary increase cannot be negative.");
        director.raiseSalary(-0.5);
    }

    @Test
    public void nameCannotBeNull() throws IllegalArgumentException{
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Name cannot be blank");
        director.setName(null);
    }

}
