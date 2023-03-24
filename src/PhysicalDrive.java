import java.util.UUID;
public class PhysicalDrive  {
    private String UUID;
    private String name;
    private int size;
    private UUID u;

    public PhysicalDrive( UUID u , String name, int size) {
        this.u = u;
        this.name = name;
        this.size = size;
    }


}
