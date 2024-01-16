import java.util.ArrayList;

public class AddressBook {
    private int code;
    private ArrayList<Persona> personas;

    public AddressBook(int code, ArrayList<Persona> personas) {
        this.code = code;
        this.personas = personas;
    }

    public AddressBook(int code) {
        this.code = code;
    }

    //GETTERS

    public int getCode() {
        return code;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    //SETTERS

    public void setCode(int code) {
        this.code = code;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "code=" + code +
                ", personas=" + personas +
                '}';
    }

}
