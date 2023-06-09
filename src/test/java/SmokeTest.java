import Person.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest {
        @Test
        public void testFirstNameSetter(){
            Person testFemaleObject = new Female("testFistName", "testSecondName", 18);
            testFemaleObject.setFirstName("New_Name");
            Assert.assertEquals(testFemaleObject.getFirstName(), "New_Name");
        }

        @Test
        public void testLastNameSetter(){
            Person testFemaleObject = new Female("testFistName", "testSecondName", 18);
            testFemaleObject.setLastName("New_Name");
            Assert.assertEquals(testFemaleObject.getLastName(), "New_Name");
        }

        @Test
        public void testSetAge(){
            Person testFemaleObject = new Female("testFistName", "testSecondName", 18);
            testFemaleObject.setPersonAge(42);
            Assert.assertEquals(testFemaleObject.getPersonAge(), 42);
        }

        @Test
        public void testGetFirstName(){
            Person testFemaleObject = new Female("testFistName", "testSecondName", 18);
            Assert.assertEquals(testFemaleObject.getFirstName(), "testFistName");
        }

        @Test
        public void testGetLastName(){
            Person testFemaleObject = new Female("testFistName", "testSecondName", 18);
            Assert.assertEquals(testFemaleObject.getLastName(), "testSecondName");
        }

        @Test
        public void testGetAge(){
            Person testFemaleObject = new Female("testFistName", "testSecondName", 18);
            Assert.assertEquals(testFemaleObject.getPersonAge(), 18);
        }
}
