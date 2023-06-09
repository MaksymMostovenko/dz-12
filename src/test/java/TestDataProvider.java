import org.testng.annotations.DataProvider;
import Person.*;

public class TestDataProvider {

    @DataProvider(name = "femalePersons")
    public static Object[][] getFemalePersons() {
        return new Object[][]{
                {new Female("testFistName", "testSecondName", 18)},
                // Add more test data for Female objects if needed
        };
    }

    @DataProvider(name = "malePersons")
    public static Object[][] getMalePersons() {
        return new Object[][]{
                {new Male("testFistName", "testSecondName", 18)},
                // Add more test data for Male objects if needed
        };
    }

    @DataProvider(name = "testPersonData")
    public static Object[][] getMarriageTestData() {
        return new Object[][]{
                {new Female("Natali", "Buzok", 16), new Male("George", "Miller", 28)},
                // Add more test data for marriage if needed
        };
    }

//    @DataProvider(name = "divorceTestData")
//    public static Object[][] getDivorceTestData() {
//        return new Object[][]{
//                {new Female("Natali", "Buzok", 16), new Male("George", "Miller", 28)},
//                // Add more test data for divorce if needed
//        };
//    }
//
//    @DataProvider(name = "retirementTestData")
//    public static Object[][] getRetirementTestData() {
//        return new Object[][]{
//                {new Male("George", "Miller", 80)},
//                // Add more test data for retirement if needed
//        };
//    }
//
//    @DataProvider(name = "pregnancyTestData")
//    public static Object[][] getPregnancyTestData() {
//        return new Object[][]{
//                {new Female("Natali", "Buzok", 16), new Male("George", "Miller", 28)},
//                // Add more test data for pregnancy if needed
//        };
//    }
//
//    @DataProvider(name = "birthTestData")
//    public static Object[][] getBirthTestData() {
//        return new Object[][]{
//                {new Female("Natali", "Buzok", 16), new Male("George", "Miller", 28)},
//                // Add more test data for birth if needed
//        };
//    }
//
//    @DataProvider(name = "partnershipTestData")
//    public static Object[][] getPartnershipTestData() {
//        return new Object[][]{
//                {new Female("Natali", "Buzok", 16), new Male("George", "Miller", 28)},
//                // Add more test data for partnership if needed
//        };
}
