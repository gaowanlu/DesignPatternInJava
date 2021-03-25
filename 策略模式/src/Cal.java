//计算类
//策略模式与简单工厂模式的结合使用
public class Cal {
    private CashSuper cal;
    Cal(String type){
        this.cal=new CashNormal();
        switch (type){
            case "正常结算":cal=new CashNormal();break;
            case "打8折":cal=new CashRebate(0.8);break;
            case "满300返50":cal= new CashReturn(300,50);break;
        }
    };
    //获得计算过的价钱
    public double getCal(double money){
        return cal.algorithm(money);
    }
}
