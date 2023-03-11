package metier;
import dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements Imetier {
    @Autowired
    @Qualifier("DaoNosql")
    private Idao dao;

    public MetierImpl(Idao dao) {
        this.dao = dao;
    }
    public MetierImpl() {}
    @Override
    public double calcul() {
        double data = dao.getData();
        return  data*10;
    }
    public void setDao(Idao dao){
        this.dao=dao;
    }
}
