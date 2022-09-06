package views;

import controller.MaterialManager;
import model.material.CrispyFlour;
import model.material.Material;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Material> materialList = MaterialManager.materialList;


    public static void main(String[] args) {
        MaterialManager kax = new MaterialManager();
//        Material bot1 = getMaterial();
//        kax.addNewMaterial(bot1);
        System.out.println(MaterialManager.materialList);
    }

    private static Material getMaterial() {
        System.out.println("Moi ban them moi vat lieu");
        System.out.println("Moi ban nhap ten bot");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Material bot1 = new CrispyFlour(name);
        System.out.println("Moi ban nhap ngay het han");
        int day = scanner.nextInt();
//        LocalDate a = LocalDate.of(day)
        return bot1;
    }


}
