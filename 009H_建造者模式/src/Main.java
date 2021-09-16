public class Main {
    public static void main(String[] args) {
        //为了建造Meal对象
        //使用MealBuilder进行Meal对象的装配,用户只需使用Builder无需知道复杂的装配细节
        MealBuilder mealBuilder=new MealBuilder();
        Meal vegMeal=mealBuilder.prepareVegMeal();
        System.out.println("VegMeal");
        vegMeal.showItems();
        System.out.println("Total Cost: "+vegMeal.getCost());
        System.out.println("------------------------------");
        Meal nonVegMeal=mealBuilder.prepareNonVegMeal();
        System.out.println("NonVegMeal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: "+nonVegMeal.getCost());
    }
}
