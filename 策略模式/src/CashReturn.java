/*
* 消费返利
* */
public class CashReturn extends CashSuper{
    private double step=0.0d;
    private double back=0.0d;
    CashReturn(double step,double back){//买step返back
        this.step=step;
        this.back=step;
    }
    public double algorithm(double money){
        double result=money;
        if(money>=this.step){//进行折扣计算
            result=money-Math.floor(money/step)*back;
        }
        return result;
    }
}
