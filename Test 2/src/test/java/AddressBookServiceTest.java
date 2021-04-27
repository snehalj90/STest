import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AddressBookServiceTest {

    @Test
    public void shouldReturnListOfPersons(){
        List<Person> people = AddressBookService.initialise();
        Assert.assertEquals(people.size(), 5);
    }

    @Test
    public void shouldReturnOnePersonInfoByName(){
        List<Person> removedList = AddressBookService.removePerson(3);
        Assert.assertEquals(removedList.size(), 4);
    }

    @Test
    public void shouldAddPersonToList(){
        List<Person> addedList = AddressBookService.addPerson();
        Assert.assertEquals(addedList.size(), 6);
    }
}
