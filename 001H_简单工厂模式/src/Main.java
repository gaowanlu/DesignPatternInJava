public class Main {
    //简单工厂模式:使用基类,隐藏避免使用new 一种派生类、new 另一种派生类、new 其他派生类
    //只需要关注工厂类静态方法，进行构造相应类型对象
    public static void main(String[]argv){
        //创造Dog
        Animal mydog=CreateAnimal.create("Dog");
        mydog.sayType();
        //创造Monkey
        Animal myMonkey=CreateAnimal.create("Monkey");
        myMonkey.sayType();
        //创造人
        Animal girlFriend=CreateAnimal.create("People");
        girlFriend.sayType();
    }
}
