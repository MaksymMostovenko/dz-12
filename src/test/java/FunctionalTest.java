import Person.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FunctionalTest {
    @Test(dataProvider = "femalePersons", dataProviderClass = TestDataProvider.class)
    public void testPersonGengerFemale(Person testFemaleObject) {
        Assert.assertEquals(testFemaleObject.personGender, Gender.FEMALE, "Req#1 Failed. Fem wrong gender");
    }

    @Test(dataProvider = "malePersons", dataProviderClass = TestDataProvider.class)
    public void testPersonGengerMale(Person testMaleObject) {
        Assert.assertEquals(testMaleObject.personGender, Gender.MALE, "Req#1 Failed. Person.Male wrong gender");
    }

    @Test(dataProvider = "testPersonData", dataProviderClass = TestDataProvider.class)
    public void testMarriage(Female female, Male male) {
        female.setPartner(male);
        Assert.assertNotNull(female.getPartner());
        Assert.assertNotNull(male.getPartner());
    }

    @Test(dataProvider = "testPersonData", dataProviderClass = TestDataProvider.class)
    public void testDivorce(Female female, Male male){
        female.setPartner(male);
        male.divorce(female);
        Assert.assertNull(female.getPartner());
        Assert.assertNull(male.getPartner());
    }

    @Test(dataProvider = "malePersons", dataProviderClass = TestDataProvider.class)
    public void testRetirement(Male person){
        person.setPersonAge(80);
        Assert.assertTrue(person.isRetired());
    }

    @Test(dataProvider = "testPersonData", dataProviderClass = TestDataProvider.class)
    public void testPregnancy(Female female, Male male){
        female.makePregnant(male);
        Assert.assertTrue(female.getPregnancy());
    }

    @Test(dataProvider = "testPersonData", dataProviderClass = TestDataProvider.class)
    public void testBirth(Female female, Male male){
        female.makePregnant(male);
        Assert.assertNotNull(female.giveChild("childFName", "childSName", Gender.FEMALE));
    }

    @Test(dataProvider = "testPersonData", dataProviderClass = TestDataProvider.class)
    public void testRegisterPartnership(Female female, Male male){
        female.registerPartnership(male);
        Assert.assertEquals(female.getLastName(), male.getLastName());
    }
}
