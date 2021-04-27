import java.util.*;

public class AddressBookService {


    public static void main(String args[]) {
        List<Person> people = initialise();
        // Print all information
        printAll(people);

        // Get all information about one specific person, depending on firstName
        Person person = getPersonInfo("Alan", people);
        System.out.println("***** Get all information about one specific person, depending on firstName *****");
        printInfo(person);

        // Add new person to list
        List<Person> addPeople = addPerson();
        System.out.println("*** Adding a person ***");
        printAll(addPeople);

        // Sort list of Person by firstName
        List<Person> sortedFNPeople =  sortByFirstName(people);
        System.out.println("***** Sort list of Person by firstName *****");
        printAll(sortedFNPeople);

        List<Person> removedPeople = removePerson(3);
        System.out.println(" *** Removes person by Id ****");
        printAll(removedPeople);

        List<Person> editedPeople = editPerson(2, "Fionna", "Mayer");
        System.out.println(" **** Edit person by id ****");
        printAll(editedPeople);

    }

    public static List<Person> initialise() {

         List<Person> people = new ArrayList<>();

        AddressBook addressBook1 = new AddressBook("D14GH90", "alan@gmail.com", 1234567);
        AddressBook addressBook2 = new AddressBook("D15H990", "bill@gmail.com", 12645374);
        AddressBook addressBook3 = new AddressBook("D01PR90", "paul@gmail.com", 1234886);
        AddressBook addressBook4 = new AddressBook("D09T910", "mark@gmail.com", 3467678);
        AddressBook addressBook5 = new AddressBook("D18PF90", "ruth@gmail.com", 4357653);

        Person person1 = new Person(1, "Alan", "Zeer", addressBook1);
        Person person2 = new Person(2, "Billy", "Yaa", addressBook2);
        Person person3 = new Person(3, "Paul", "Costa", addressBook3);
        Person person4 = new Person(4, "Mark", "Ruffelo", addressBook4);
        Person person5 = new Person(5, "Ruth", "Breder", addressBook5);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        return people;
    }

    public static void printInfo(Person person) {
        System.out.println(person.getFirstName() + " " + person.getLastName() + " " +
                person.getAddressBook().getAddress() + " " + person.getAddressBook().getEmailId()
                + " " + person.getAddressBook().getMobileNumber());
    }

    public static void printAll(List<Person> people){
        for(Person person: people){
            printInfo(person);
        }
    }

    public static Person getPersonInfo(String firstName, List<Person> people){
        for(Person person: people){
            if(firstName == person.getFirstName()) {
                return person;
            }
        }
        return null;
    }

    public static List<Person> sortByFirstName(List<Person> people){
        people.sort(new NameSorter());
        return people;
    }

    public static List<Person> editPerson(int id, String newFirstName, String newLastName){
        List<Person> people = initialise();
        for(int i = 0; i < people.size(); i++){
            if(id == people.get(i).getId()){
                people.get(id).setFirstName(newFirstName);
                people.get(id).setLastName(newLastName);
            }
        }
        return people;
    }

    public static List<Person> removePerson(int id){
        List<Person> people = initialise();
        for(int i = 0; i < people.size(); i++){
            if(id == people.get(i).getId()){
                people.remove(people.get(i).getId());
            }
        }
        return people;
    }

    public static List<Person> addPerson(){
        List<Person> people = initialise();
        Person person = new Person(6, "Alice", "Wonder",
                        new AddressBook( "D20PD64", "alice@gmail.com", 12345456));

        people.add(person);
        return people;
    }
}
