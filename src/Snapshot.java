import java.util.Date;

public class Snapshot {
    Person person;
    String imie;
    String nazwisko;
    Date dataUrodzenia;
    String miejsceUrodzenia;
    String email;
    int telefon;

    public Snapshot(Person person,String imie, String nazwisko, Date dataUrodzenia, String miejsceUrodzenia, String email, int telefon) {
        this.person=person;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.miejsceUrodzenia = miejsceUrodzenia;
        this.email = email;
        this.telefon = telefon;
    }

    public void restore(){
        person.setImie(imie);
        person.setNazwisko(nazwisko);
        person.setEmail(email);
        person.setDataUrodzenia(dataUrodzenia);
        person.setTelefon(telefon);
        person.setMiejsceUrodzenia(miejsceUrodzenia);
    }
}
