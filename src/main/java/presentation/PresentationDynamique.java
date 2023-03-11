package presentation;

import dao.Idao;
import metier.Imetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationDynamique {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(new File("C:\\Users\\Belmoudden El hachmy\\tp0jee\\src\\main\\java\\config"));

        String dao= sc.nextLine();
        Class clsDao=Class.forName(dao);
        Idao ObjectDao=(Idao)clsDao.newInstance();

        String metier= sc.nextLine();
        Class clsMetier=Class.forName(metier);
        Imetier ObjectMetier=(Imetier)clsMetier.newInstance();

        Method method = clsMetier.getMethod("setDao",Idao.class);
        method.invoke(ObjectMetier,ObjectDao);

        System.out.println(ObjectMetier.calcul());

    }
}
