package metier;

import dao.Idao;


public class MetierImpl implements IMetier {
    private Idao dao;
    @Override
    public double calcul() {
        /*

        NullPointerException
        Like you have a pc without keyboard, to resolve it you need a keyboard
        , and to plug it (this what we call it dependencies injection) with a setter.
         */
        double tmp=dao.getData();
        double res=tmp*544662;
        return res;
    }

    public void setDao(Idao dao) {
        this.dao = dao;
    }
}
