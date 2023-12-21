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

}
