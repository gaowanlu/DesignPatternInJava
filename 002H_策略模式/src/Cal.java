//计算类
//策略模式与简单工厂模式的结合使用
/*
* 简单工厂模式像做一个菜单进行抽象来创建不同的子类实体赋给父类变量 多态
* 策略模式像建立在工厂模式上面的更加抽象的一层，策略模式的目的是
* 做一件事有不同的决策 我们可以进行抽象 最高抽象层不需要关注内部细节
* 只需要选择模式与传参就好了与需要知道内部的算法怎样实现的 实现隐藏细节
* */
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
