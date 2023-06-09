import Person.Female;
import Person.Gender;
import Person.Male;
import Person.Person;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FunctionalTest {
    @Test
    public void testPersonGengerFemale() {
        Person testFemaleObject = new Female("testFistName", "testSecondName", 18);
        Assert.assertEquals(testFemaleObject.personGender, Gender.FEMALE, "Req#1 Failed. Fem wrong gender");

    }

    @Test
    public void testPersonGengerMale() {
        Person testMaleOBject = new Male("testFistName", "testSecondName", 18);
        Assert.assertEquals(testMaleOBject.personGender, Gender.MALE, "Req#1 Failed. Person.Male wrong gender");

    }

    @Test
    public void testMarriage(){
        Female Natali = new Female("Natali", "Buzok", 16);
        Male George = new Male("George", "Miller", 28);
        Natali.setPartner(George);
        Assert.assertNotNull(Natali.getPartner());
        Assert.assertNotNull(George.getPartner());
    }

    @Test
    public void testDivorce(){
        /*
        #4
        Each person should have ability to break a marriage.
         */

        Female Natali = new Female("Natali", "Buzok", 16);
        Male George = new Male("George", "Miller", 28);
        Natali.setPartner(George);
        George.divorce(Natali);
        Assert.assertNull(Natali.getPartner());
        Assert.assertNull(George.getPartner());
    }

    @Test
    public void testRetirement(){
        Male George = new Male("George", "Miller", 80);
        Assert.assertTrue(George.isRetired());
    }

    @Test
    public void testPregnancy(){
        Female Natali = new Female("Natali", "Buzok", 16);
        Male George = new Male("George", "Miller", 28);
        Natali.makePregnant(George);
        Assert.assertTrue(Natali.getPregnancy());
    }

    @Test
    public void testBirth(){
        Female Natali = new Female("Natali", "Buzok", 16);
        Male George = new Male("George", "Miller", 28);
        Natali.makePregnant(George);
        Assert.assertNotNull(Natali.giveChild("childFName", "childSName", Gender.FEMALE));
    }

    @Test
    public void testRegisterPartnership(){
        Female Natali = new Female("Natali", "Buzok", 16);
        Male George = new Male("George", "Miller", 28);
        Natali.registerPartnership(George);
        Assert.assertEquals(Natali.getLastName(), George.getLastName());
    }
}
