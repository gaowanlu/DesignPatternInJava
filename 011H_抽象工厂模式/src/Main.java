public class Main {
    public static void main(String[] args) {
        AbstractFactory colorFactory=FactoryProducer.getFactory("color");
        AbstractFactory shapeFactory=FactoryProducer.getFactory("shape");
        Shape shape=shapeFactory.getShape("circle");
        Color color=colorFactory.getColor("red");
        shape.draw();
        color.fill();
    }
}
