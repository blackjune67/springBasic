package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {
    }

    /*public SingletonService(int a) {
    }*/

    public void logic() {
        System.out.println("이게 바로 싱글톤이다. 새퀴들아!!!");
    }
}
