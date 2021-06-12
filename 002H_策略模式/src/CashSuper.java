/*抽象算法类
* 我们可见，CashSuper的派生类都是共同的目的，都是为了结算价钱
* 它们为都是用不同的过程去实现相同的目的，只是他么内部的决策不同
* 我们使用时通常会使用一种方式，我们需要选择策略
* */
public abstract class CashSuper {
    public abstract double algorithm(double money);
}
