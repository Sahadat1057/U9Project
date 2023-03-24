import java.util.ArrayList;
import java.util.UUID;
public class LogicalVolume extends LVM {
    private UUID u;
    private ArrayList<VolumeGroup> VG;

    public LogicalVolume(String name, int size, UUID u, ArrayList<VolumeGroup> VG) {
        super(size, name);

    }
}
