/*
* 装饰者模式
* 动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更加灵活。
*
* */
public class Main {
    public static void main(String[]argv){
        Person pp=new Person("高万禄");
        TShirts tt=new TShirts();
        BigTrouser bb=new BigTrouser();

        tt.Decorate(pp);
        bb.Decorate(tt);
        bb.Show();//链式调用 1——》2-》3-》4 4.show 4.show->3.show->2.show->1.show->super.show
        /*
        执行过程分析
        tt.component=pp
        bb.component=tt

        bb.show()=>执行bb.show自己要干的 同时执行super.show()即component.show()
        即tt.show()被调用
        tt.show(){todo super.show()} Person.show()被调用
        Person.show(){}执行完毕 整体执行完成
        * */
    }
}
/*
* 装饰模式，是为已有功能动态添加更多功能的一种方式
* 当系统需要新的功能时，是向旧的类中添加新的代码。这些新加的代码通常修饰了原有类的核心职责或主要行为
*
* 装饰模式的优点:把类中的装饰功能从类中搬除去除，这样可以去除相关类中的重要的装饰逻辑。
*
* 有效地把类的核心职责和装饰功能区分开了，而且可以去除相关类中重复的装饰逻辑
* */
