package CommandPattern;

public class Cliect {

    public static void main(String[] args) {
        Invoke invoke = new Invoke();
        Command command = new ConcreteCommand();
        invoke.setCommand(command);
        invoke.action();
    }
}
