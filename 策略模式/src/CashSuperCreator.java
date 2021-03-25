//CashSuperCreate工厂
//策略模式与简单工厂模式的结合使用
public class CashSuperCreator {
    public static CashSuper create(String type){
        CashSuper result=new CashNormal();
        switch (type){
            case "正常结算":result=new CashNormal();break;
            case "打8折":result=new CashRebate(0.8);break;
            case "满300返50":result= new CashReturn(300,50);break;
        }
        return result;
    }
}
