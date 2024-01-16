public class Address {
    private String street;
    private String city;
    private String codPostal;
    private State state;
    private Persona persona;

    public Address(String street, String city, String codPostal, State state, Persona persona) {
        this.street = street;
        this.city = city;
        this.codPostal = codPostal;
        this.state = state;
        this.persona = persona;
    }

    public Address(String street, String city, String codPostal, State state) {
        this.street = street;
        this.city = city;
        this.codPostal = codPostal;
        this.state = state;
    }

    //GETTERS

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public State getState() {
        return state;
    }

    public Persona getPersona() {
        return persona;
    }
    //SETTERS

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", codPostal='" + codPostal + '\'' +
                ", state=" + state +
                ", persona=" + persona +
                '}';
    }
}
