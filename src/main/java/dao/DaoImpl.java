package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {
    @Override
    public double getdata() {
        System.out.println("Version de base de donnée");
        return 3.3;
    }
}
