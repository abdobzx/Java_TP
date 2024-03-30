package ext;

import dao.Idao;

public class DaoImpl2 implements Idao {
    @Override
    public double getData() {
        System.out.println("new -ve");
        double temp=800;
        return temp;
    }
}
