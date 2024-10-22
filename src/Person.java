import java.util.Date;
public class Person {
    String imie;
    String nazwisko;
    Date dataUrodzenia;
    String miejsceUrodzenia;
    String email;
    int telefon;

    public Person(String imie, String nazwisko, Date dataUrodzenia, String miejsceUrodzenia, String email, int telefon) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.miejsceUrodzenia = miejsceUrodzenia;
        this.email = email;
        this.telefon = telefon;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public void setMiejsceUrodzenia(String miejsceUrodzenia) {
        this.miejsceUrodzenia = miejsceUrodzenia;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }
    public Snapshot createSnapshot(){
        return new Snapshot(this,imie,nazwisko,dataUrodzenia,miejsceUrodzenia,email,telefon);
    }
}
