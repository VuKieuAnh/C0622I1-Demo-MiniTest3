package storage.material;

import model.material.Material;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile implements IReadWriteData {

    //doc file -> danh sach Vat lieu
    public List<Material> readData()  {
        List<Material> materialList = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("material.dat");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Object obj = null;
        try {
            obj = ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        materialList = (List<Material>) obj;
        return materialList;
    }


    //git file dc truyen vao 1 danh sach Vat lieu
    public void writeData(List<Material> materials){
        try {
            FileOutputStream fos = new FileOutputStream("material.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(materials);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
