import java.util.UUID;
public class PhysicalDrive extends Storage  {
    public PhysicalDrive(String name, int storage){
        super(name, storage);
    }

    @Override
    public String toString(){
        return super.toString() + "[" + super.getStorage() + " GB]";
    }

}
