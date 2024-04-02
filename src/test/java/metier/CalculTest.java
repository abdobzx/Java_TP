package metier;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculTest {
    private Calcul calcul;
    @Test
    public void testSomme(){
        calcul=new Calcul();
        double a=5,b=9;
        double expected=14;
        double res=calcul.somme(a,b);
        Assert.assertTrue(res==expected);
    }
}
