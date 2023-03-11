package dao;

import org.springframework.stereotype.Component;

@Component("DaoNosql")
public class DaoNosql implements Idao {
    @Override
    public double getData() {
        System.out.println(" from Nosql DB ");
        return 2;
    }
}
