package dao;

public class DaoImpl implements Idao{

    @Override
    public double getData() {

        System.out.println("-v BD");
        double temp=Math.random();

        return temp;
    }
}
