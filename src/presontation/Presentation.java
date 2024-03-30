package presontation;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    /*
    closed to modification open to extension,
    the consepter make the interfaces and the developer develop the code on the classes
     */
    public static void main(String[] args) {
        /*
        new (mean Strong coupling),
        dependence injection
        instantiation static
         */
        DaoImpl2 dao=new DaoImpl2();
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
