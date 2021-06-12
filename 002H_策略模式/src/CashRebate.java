/*打折结算
* */
public class CashRebate extends CashSuper{
    private double rate=0.0d;
    CashRebate(double rate){
        this.rate=rate;
    }
    @Override
    public double algorithm(double money){
        return this.rate*money;
    }
}
