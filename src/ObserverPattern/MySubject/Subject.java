package ObserverPattern.MySubject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 上官名鹏
 * @Date: 2018/6/3 16:14
 * @Description:
 */
public class Subject {

    //用来保存注册的观察者对象
    private List<Observer> observerList = new ArrayList<>();

    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void detach(Observer observer){
        observerList.remove(observer);
    }

    protected void notifyObserver(){
        for (Observer observer:observerList){
            observer.update(this);
        }
    }

}
