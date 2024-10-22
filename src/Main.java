import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person person=new Person("imie","nazwisko",new Date(100,1,1),"miejsceUrodzenia","test@local.test",1234345);
        BackupHandler backupHandler=new BackupHandler();
        backupHandler.addBackup(person.createSnapshot());
        System.out.println(person.imie);

        person.setImie("imie2");
        backupHandler.addBackup(person.createSnapshot());
        System.out.println(person.imie);
    }
}