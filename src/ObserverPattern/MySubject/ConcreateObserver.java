package ObserverPattern.MySubject;

/**
 * @Auther: 上官名鹏
 * @Date: 2018/6/3 16:30
 * @Description:
 */
public class ConcreateObserver implements Observer {

    private String observerState;

    @Override
    public void update(Subject subject) {
        this.observerState = ((ConcreateSubject)subject).getSubjectState();
        System.out.println("收到");
    }
}
