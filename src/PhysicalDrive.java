import java.util.UUID;
public class PhysicalDrive {
    String UUID;
    String name;
    int space;

    public PhysicalDrive( UUID, String name, int space) {
        UUID u = UUID.randomUUID();
        this.name = name;
        this.space = space;
    }
}
