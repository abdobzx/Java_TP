package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static java.lang.Math.cos;
@Component
public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl(IDao dao){
        this.dao=dao;
    }
    @Override
    public double calcul() {
        double tmp=dao.getdata();
        double res=tmp*500;
        return res;
    }
    public void setDao(IDao dao){
        this.dao=dao;
    }
}
