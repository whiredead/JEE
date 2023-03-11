package presentation;
import dao.DaoNosql;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args){
        DaoNosql Nosql=new DaoNosql();
        MetierImpl metier =new MetierImpl(Nosql);
        double result=metier.calcul();
        System.out.println("Resultat= "+ result);
    }
}
