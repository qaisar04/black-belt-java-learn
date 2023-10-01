package MULTITHREADING;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) {
       Exchanger<Action> exchanger = new Exchanger<>();
       List<Action> friendAction1 = new ArrayList<>();
        friendAction1.add(Action.НОЖНИЦЫ);
        friendAction1.add(Action.БУМАГА);
        friendAction1.add(Action.НОЖНИЦЫ);

        List<Action> friendAction2 = new ArrayList<>();
        friendAction2.add(Action.БУМАГА);
        friendAction2.add(Action.КАМЕНЬ);
        friendAction2.add(Action.КАМЕНЬ);

        new BestFriend("Bob", friendAction1, exchanger);
        new BestFriend("Kate", friendAction2, exchanger);



    }
}

enum Action {
    КАМЕНЬ, НОЖНИЦЫ, БУМАГА;
}

class BestFriend extends Thread {
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendAction) {
        if ((myAction == Action.КАМЕНЬ && friendAction == Action.НОЖНИЦЫ)
            || (myAction == Action.НОЖНИЦЫ && friendAction == Action.БУМАГА)
                || (myAction == Action.БУМАГА && friendAction == Action.КАМЕНЬ)) {
            System.out.println(name + " WINS!");
        }
    }

    @Override
    public void run() {
        Action reply;

        for(Action action: myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}