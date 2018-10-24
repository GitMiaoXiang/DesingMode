package ObserverPattern.MySubject;

/**
 * @Auther: 上官名鹏
 * @Date: 2018/6/3 16:30
 * @Description:
 */
public class ConcreateSubject extends Subject {

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        //通知所有观察者发生改变
        this.notifyObserver();
    }
}
