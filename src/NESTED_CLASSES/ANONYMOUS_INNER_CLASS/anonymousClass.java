package NESTED_CLASSES.ANONYMOUS_INNER_CLASS;

public class anonymousClass {
    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };

        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };

        System.out.println("Результат сложения = " + m.doOperation(4, 5));
        System.out.println("Результат умножения = " + m2.doOperation(4, 5));

    }
}

interface Math {
    int doOperation(int a, int b);
}
