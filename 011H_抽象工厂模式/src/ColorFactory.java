public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if(color==null)
            return null;
        if(color.equals("red")){
            return new Red();
        }else if(color.equals("blue")){
            return new Blue();
        }else{
            return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
