import models.SamengesteldeIntrest;
import org.junit.Assert;
import org.junit.Test;

public class SamengesteldeIntrestTests {

    @Test
    public void GivenACapitalOf5AnIntrestOf2Over3Years_WhenCalculatingTotalAmount_ShouldReturn(){
        // kapitaal * Math.pow((1 + intrestVoet/100),aantalJaren);
        // 5 * Math.pow(1 + 2/100, 3); == 5.30604
        SamengesteldeIntrest samengesteldeIntrest = new SamengesteldeIntrest(5,2,3);

        double result = samengesteldeIntrest.berekenOpbrengst();
        Assert.assertEquals(5.30604, result, 0.001);
    }
}
