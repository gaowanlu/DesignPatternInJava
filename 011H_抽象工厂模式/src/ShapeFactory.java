public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape==null)
            return null;
        if(shape.equals("circle")){
            return new Circle();
        }else if(shape.equals("reactangle")){
            return new Reactangle();
        }else{
            return null;
        }
    }
}
