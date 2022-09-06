package storage.material;

import model.material.Material;

import java.util.List;

public class ReadWriteText implements IReadWriteData {
    //private Constructor

    private ReadWriteText() {
    }

    //instance static thuoc lop
    private static ReadWriteText readWriteText;
    // getInstance -> instance

    public static ReadWriteText getInstance(){
        if (readWriteText == null) readWriteText = new ReadWriteText();
        return readWriteText;
    }

    @Override
    public List<Material> readData() {
        return null;
    }

    @Override
    public void writeData(List<Material> materials) {

    }
}
