import java.util.ArrayList;
import java.util.List;

public class BackupHandler {
    List<Snapshot> backup;

    public BackupHandler(){
        backup=new ArrayList<>();
    }
    public void addBackup(Snapshot snapshot){
        backup.add(snapshot);
    }
}
