package NESTED_CLASSES.INNER_CLASS;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, int horsePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower);
    }

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color = '" + color + '\'' +
                ", doorCount = " + doorCount +
                ", engine = " + engine +
                '}';
    }

    public class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My engine {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        // inner класс всегда завязан с своим внешним классом, если нужно создать обьект
        // внутреннего класса, тогда придется первым делом создавать внешний класс

        Car car = new Car("Black", 2, 250);
        System.out.println(car);


        Car car1 = new Car("White", 6);
        Car.Engine engine1 = car.new Engine(150);
        car1.setEngine(engine1);

        System.out.println(car1);
    }
}

