package storage;

import model.Material;

import java.util.List;

public interface IReadWriteData {
    List<Material> readData();
    void writeData(List<Material> materials);
}
