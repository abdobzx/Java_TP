package presontation;

import dao.Idao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class presentation2 {
    /*
    dynamic instantiation
     */
    /*
    the exceptions seen:
    FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDoa=Class.forName(daoClassName);
        Idao dao=(Idao) cDoa.newInstance();
        /*
        classcastExeption(if we don't have Idao interface)
        instantiation dynamic steps:
        1.knowing the class name
        2.load the class on the memory
        3.class instantiation
         */
        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setDao",Idao.class);
        method.invoke(metier,dao);
        System.out.println("res="+metier.calcul());
    }
}
