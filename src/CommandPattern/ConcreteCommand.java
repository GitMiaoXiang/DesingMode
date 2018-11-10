package CommandPattern;

public class ConcreteCommand extends Command {

    private Receiver receiver;

    public ConcreteCommand() {
        super(new ConcreateReciver());
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }

}
