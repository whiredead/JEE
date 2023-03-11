package dao;

import org.springframework.stereotype.Component;

@Component("DaoDb")
public class DaoImpl implements Idao{
    @Override
    public double getData() {
        System.out.println(" from sql DB ");
        return 1;
    }
}
