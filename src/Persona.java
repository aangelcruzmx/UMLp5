public class Persona {
    private String name;
    private String telefono;
    private String email;
    private Address adress;
    private AddressBook addressBook;

    public Persona(String name, String telefono, String email, Address adress, AddressBook addressBook) {
        this.name = name;
        this.telefono = telefono;
        this.email = email;
        this.adress = adress;
        this.addressBook = addressBook;
    }

    //GETTERS


    public String getName() {
        return name;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public Address getAdress() {
        return adress;
    }

    public AddressBook getAddressBook() {
        return addressBook;
    }

    //SETTERS


    public void setName(String name) {
        this.name = name;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public void setAddressBook(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", adress=" + adress +
                ", addressBook=" + addressBook +
                '}';
    }
}
