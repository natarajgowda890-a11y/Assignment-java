package Module4;
final class FinalClass {

    final int number = 10;

    final void display() {
        System.out.println("Final Method");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
        System.out.println("Final Variable: " + obj.number);
    }
}