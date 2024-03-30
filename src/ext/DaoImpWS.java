package ext;

import dao.Idao;
/*
adding extension
 */
public class DaoImpWS implements Idao {
    @Override
    public double getData() {
        System.out.println("-v webS");
        return 0;
    }
}
