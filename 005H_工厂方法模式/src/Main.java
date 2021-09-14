/*
* 什么是工厂方法模式？
* 个人理解：是对简单工厂模式的更加高一层的抽象，避免了反复修改同一块代码（switch case做菜单有缺陷）
* 为每个子类创建一个工厂 这些工厂共同实现同一个接口
* */
public class Main {
    public static void main(String[]argv)
    {
        IFactory operFactory= new AddFactory();
        Operation addOper= operFactory.CreateOperation();
        addOper.NumberA=1;
        addOper.NumberB=3;
        System.out.println(addOper.GetResult());// console print content is 4.0
    }
}
