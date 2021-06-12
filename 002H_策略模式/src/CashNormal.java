/*
* 正常结算价格
* */
public class CashNormal extends CashSuper{
    @Override
    public double algorithm(double money){
        return money;
    }
}
