package interfaces.impls;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import interfaces.AddressBook;
import objects.Person;

public class CollectionAddressBook implements AddressBook {

    private ObservableList<Person> personList = FXCollections.observableArrayList();

    @Override
    public void add(Person person) {
        personList.add(person);
    }

    @Override
    public void update(Person person) {
        //TODO докрутить БД
    }

    @Override
    public void delete(Person person) {
        personList.remove(person);
    }

    public ObservableList<Person> getPersonList() {
        return personList;
    }

    public void fillTestData(){
        personList.add(new Person("Артём Климчанский", "88005553535"));
        personList.add(new Person("Роман Романов", "345345345"));
        personList.add(new Person("Антон Иванов", "345345345"));
        personList.add(new Person("Джон Маклейн", "23423423"));
        personList.add(new Person("Джек Воробей", "234234"));
        personList.add(new Person("Алиса Ивановна", "456456"));
        personList.add(new Person("Боб Марли", "34534345"));
    }
}

