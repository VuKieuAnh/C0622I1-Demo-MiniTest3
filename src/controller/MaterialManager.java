package controller;

import model.Discount;
import model.Material;
import storage.IReadWriteData;
import storage.ReadWriteFile;
import storage.ReadWriteFileExcel;
import storage.ReadWriteText;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MaterialManager {
    private static IReadWriteData readFile = new ReadWriteText();
    public static List<Material> materialList;

    static {
            materialList = readFile.readData();
    }

    public void addNewMaterial(Material material){
        materialList.add(material);
        readFile.writeData(materialList);
    }

    //tinh so tien sau giam gia
    public double getRealMoney(){
        double total=0;
        for (int i = 0; i < materialList.size(); i++) {
            if (materialList.get(i) instanceof Discount)
            {
                Discount discount = (Discount) materialList.get(i);
                total += discount.getRealMoney();
            }
        }
        return total;
    }
    public double getTotalMoney(){
        double total=0;
        for (int i = 0; i < materialList.size(); i++) {
                total += materialList.get(i).getAmount();
        }
        return total;
    }

    // tinh chenh lech
    public double getDifference(){
        double difference = getTotalMoney() - getRealMoney();
        return difference;
    }
}
