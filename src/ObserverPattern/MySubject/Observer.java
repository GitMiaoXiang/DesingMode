package ObserverPattern.MySubject;

/**
 * @Auther: 上官名鹏
 * @Date: 2018/6/3 16:13
 * @Description:
 */
public interface Observer {

    /**
     * 更新的接口
     * @param subject 传入目标对象，方便获取响应的目标对象的状态
     */
      void update(Subject subject);
}
