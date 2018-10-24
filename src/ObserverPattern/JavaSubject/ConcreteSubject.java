package ObserverPattern.JavaSubject;

import java.util.Observable;

/**
 * @Auther: 上官名鹏
 * @Date: 2018/6/3 18:33
 * @Description:
 */
public class ConcreteSubject extends Observable{

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.setChanged();
        //推模型
        this.notifyObservers(content);
        //拉模型
//        notifyObservers();
    }
}
