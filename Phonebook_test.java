import org.example.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class Phonebook_test {
    @Test
    public void testPersonConstructor_ValidPhone() {
        Person person = new Person("Jo March", "09962223344");
        assertEquals("Jo March", person.getName());
        assertEquals("09962223344", person.getPhone());
    }
    @Test
    public void testSetName() {
        Person person = new Person("Jo March", "09962223344");
        person.setName("Jo March");
        assertEquals("Jo March", person.getName());
    }
    @Test
    public void testSetPhone_ValidNumber() {
        Person person = new Person("Jo March", "09962223344");
        person.setPhone("09112163845");
        assertEquals("09112163845", person.getPhone());
    }
    @Test
    public void testSetHidden() {
        Person person = new Person("Jo March", "09962223344");
        person.setHidden();
        assertTrue(person.isHidden());
    }
    @Test
    public void testSetUnHidden() {
        Person person = new Person("Jo March", "09962223344");
        person.setHidden();
        person.setUnHidden();
        assertFalse(person.isHidden());
    }
    @Test
    public void testToString() {
        Person person = new Person("Jo March", "09962223344");
        String expectedOutput = "Name: Jo March - Phone number: 09962223344";
        assertEquals(expectedOutput, person.toString());
    }
    @Test
    public void testIdUniqueness() {
        Person person1 = new Person("Person1", "09111111111");
        Person person2 = new Person("Person2", "09222222222");

        assertNotEquals(person1.getId(), person2.getId());
    }






}
