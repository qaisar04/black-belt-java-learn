package NESTED_CLASSES.LOCAL_INNER_CLASS;

public class LocalInner {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

// Local Inner Class - располагается в блоках кода таких, как, конструктор или метод.
// Данный класс не может быть static.

class Math {
    public void getResult()  {
        class Delenie {
            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }


            public int getResultDelitel() {
                return delimoe / delitel;
            }

            public int getResultDelitelOstatok() {
                return delimoe % delitel;
            }
        }

        Delenie delenie = new Delenie();
        delenie.setDelimoe(150);
        delenie.setDelitel(4);

        System.out.println(delenie.getResultDelitel());
        System.out.println(delenie.getResultDelitelOstatok());
    }
}
