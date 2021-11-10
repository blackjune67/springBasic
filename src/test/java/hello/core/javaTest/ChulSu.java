package hello.core.javaTest;

public class ChulSu implements Human, Taekwondo {

    @Override
    public void talk() {
        System.out.println("철수는 말을 했다!!");
    }

    @Override
    public void attack() {
        System.out.println("발차기!! 얍!");
    }
}
