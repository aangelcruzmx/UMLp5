import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Country pais1 = new Country(34, "España");
        Country pais2 = new Country(55 ,"Mexico");

        State estado1 = new State(12, "Alicante", pais1);
        State estado2 = new State(1, "CDMX ", pais2);

        Address address1 = new Address("Gerona", "Benidorm", "03200", estado1);
        Address address2 = new Address("Pino", "Distrito Federal", "06400", estado2);

        AddressBook addressBook1 = new AddressBook(151);

        Persona persona1 = new Persona("Angel", "5536620169", "ran@gmail.com", address1, addressBook1 );
        Persona persona2 = new Persona("Alberto", "123456789", "trn52@gmail.com", address1, addressBook1 );
        Persona persona3 = new Persona("Luis", "987654321", "qwerty123@gmail.com", address2, addressBook1 );
        Persona persona4 = new Persona("ruben", "65498731", "mail321@gmail.com", address2, addressBook1 );

        ArrayList<Persona> arraysPersonas1 = new ArrayList<>();

        arraysPersonas1.add(persona1);
        arraysPersonas1.add(persona2);
        arraysPersonas1.add(persona3);
        arraysPersonas1.add(persona4);

        addressBook1.setPersonas(arraysPersonas1);

    }



}
