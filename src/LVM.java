import java.util.UUID;
import java.util.ArrayList;
public class LVM {
    private static ArrayList<PhysicalDrive> driveList;
    private static ArrayList<PhysicalVolume> pvList;
    private static ArrayList<VolumeGroup> vgList;
    private static ArrayList<LogicalVolume> lvList;

    public LVM(){
        driveList = new ArrayList<PhysicalDrive>();
        pvList = new ArrayList<PhysicalVolume>();
        vgList = new ArrayList<VolumeGroup>();
        lvList = new ArrayList<LogicalVolume>();
    }

    // installs a new drive given a name and amount of storage
    public String installDrive(String name, int storage){
        driveList.add(new PhysicalDrive(name, storage));
        return "Drive " + name + " installed";
    }

    public String createPhysicalVolume(String name, String driveName){
        PhysicalDrive associatedDrive = new PhysicalDrive("", 0);
        for (PhysicalDrive drive : driveList){
            if (drive.getName().equals(driveName)) associatedDrive = drive;
        }
        pvList.add(new PhysicalVolume(name, associatedDrive));
        return name + " created";
    }

    public String createVolumeGroup(String name, String physicalVolumeName){
        PhysicalVolume firstPV = new PhysicalVolume("", new PhysicalDrive("", 0));
        for (PhysicalVolume pv : pvList){
            if (pv.getName().equals(physicalVolumeName)) firstPV = pv;
        }
        firstPV.setVolumeGroupName(name);
        vgList.add(new VolumeGroup(name, firstPV));
        return name + " created";
    }



}

