package ObserverPattern.JavaSubject;

import java.util.Observable;
import java.util.Observer;

/**
 * @Auther: 上官名鹏
 * @Date: 2018/6/3 18:33
 * @Description:
 */
public class ConcreteObserver implements Observer{

    private String name;

    @Override
    public void update(Observable o, Object arg) {
        //推的模式
        System.out.println("Name:"+name+",content:"+arg);
        //拉的模式
//        System.out.println("Name:"+name+",content:"+((ConcreteSubject)o).getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
