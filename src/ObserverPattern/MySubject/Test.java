package ObserverPattern.MySubject;

/**
 * @Auther: 上官名鹏
 * @Date: 2018/6/3 17:24
 * @Description:
 */
public class Test {

    public static void main(String[] args) {

        ConcreateSubject concreateSubject = new ConcreateSubject();
        ConcreateObserver concreateObserver = new ConcreateObserver();
        ConcreateObserver concreateObserver1 = new ConcreateObserver();
        ConcreateObserver concreateObserver2 = new ConcreateObserver();
        ConcreateObserver concreateObserver3 = new ConcreateObserver();

        concreateSubject.attach(concreateObserver);
        concreateSubject.attach(concreateObserver1);
        concreateSubject.attach(concreateObserver2);
        concreateSubject.attach(concreateObserver3);

        concreateSubject.setSubjectState("我观察到了新的东西");

        System.out.println();


    }
}
