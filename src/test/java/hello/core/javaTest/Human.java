package hello.core.javaTest;

public interface Human {
    public void talk();

    default String Blood(String bloodType) {
        switch (bloodType) {
            case "A" :
                return "혈액형은 A";
            case "B" :
                return "혈액형은 B";
            case "O" :
                return "혈액형은 O";
            case "AB" :
                return "혈액형은 AB";
        }
        return "사람의 피가 아니면 확인이 어렵습니다.";
    }

    static void Bread() {
        System.out.println("인간은 숨을 기본으로 쉬고 있다.");
    }
}
