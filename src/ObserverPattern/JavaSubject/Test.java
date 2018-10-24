package ObserverPattern.JavaSubject;

/**
 * @Auther: 上官名鹏
 * @Date: 2018/6/3 18:40
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        ConcreteObserver concreteObserver = new ConcreteObserver();
        concreteObserver.setName("1号");
        ConcreteObserver concreteObserver1 = new ConcreteObserver();
        concreteObserver1.setName("2号");
        ConcreteObserver concreteObserver2 = new ConcreteObserver();
        concreteObserver2.setName("3号");

        concreteSubject.addObserver(concreteObserver);
        concreteSubject.addObserver(concreteObserver1);
        concreteSubject.addObserver(concreteObserver2);

        concreteSubject.setContent("我发布内容了");
    }
}
