import java.util.UUID;
public class PhysicalVolume  {
    private String name;
    private PhysicalDrive d;
    private UUID u;

    public PhysicalVolume(UUID u, PhysicalDrive d, String name) {
        this.u = u;
        this.d = d;
    }
}
