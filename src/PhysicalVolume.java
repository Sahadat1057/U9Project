import java.util.UUID;
public class PhysicalVolume extends Storage  {
    private PhysicalDrive drive;
    private String VolumeGroupName;

    public PhysicalVolume(String name, PhysicalDrive drive){
        super(name, drive.getStorage());
        this.drive = drive;
    }

    public PhysicalDrive getDrive() {
        return drive;
    }

    public void setDrive(PhysicalDrive drive) {
        this.drive = drive;
    }

    public String getVolumeGroupName() {
        return VolumeGroupName;
    }

    public void setVolumeGroupName(String volumeGroupName) {
        VolumeGroupName = volumeGroupName;
    }

    @Override
    public String toString(){
        String string = super.toString() + "[" + super.getStorage() + " GB]";
        if (VolumeGroupName != null) string += "[" + VolumeGroupName + "]";
        return string;
    }
}
