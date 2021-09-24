public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("stop action");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "stop state";
    }
}
