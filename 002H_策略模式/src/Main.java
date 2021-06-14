/*策略模式Java实现
* 上一节学习的简单工厂模式中、我们的工厂是服务于创造不同的对象、但在实际的情况下，我们还有
* 可能遇到、要决策多个功能，我们需要的是某个算法，而非对象的本身，这些不同的算法使用中往往要面临
* 着选择与切换，我们能不能利用类似的思想将其，也写成工厂那样使用方便利于维护
*
* 策略模式:它定义了算法家族，分别封装起来，让它们之间可以相互替换、此模式让算法的变化，不会影响到使用算法的客户。
*
* 策略模式是一种定义一系列算法的方法，从概念上来看，所有这些算法完成的都是相同的工作，只是实现不同，它可以以相同的方式调用所有算法，减少了各种算法
* 类与使用算法之间的耦合。
* */
import java.util.Scanner;
public class Main {
    public static void main(String[]argv){
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("请输入结算方式");
            String type="";
            type=input.nextLine();
            //构造结算类
            Cal cal=new Cal(type);
            System.out.println(cal.getCal(400));
        }
    }
}
