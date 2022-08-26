package storage;

import model.CrispyFlour;
import model.Material;
import model.Meat;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {

    //doc file -> danh sach Vat lieu
    public static List<Material> readFile() throws IOException, ClassNotFoundException {
        List<Material> materialList = new ArrayList<>();
        FileInputStream fis = new FileInputStream("material.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        materialList = (List<Material>) obj;
        return materialList;
    }


    //git file dc truyen vao 1 danh sach Vat lieu
    public static void writeFile(List<Material> materials){
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
