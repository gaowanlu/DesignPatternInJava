public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        if(type==null){
            return null;
        }else if(type.equals("color")){
            return new ColorFactory();
        }else  if(type.equals("shape")){
            return new ShapeFactory();
        }else{
            return null;
        }
    }
}
