import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Elevator {
    private int currentFloor;
    private int chosenFloor;
    private int roof;
    protected Scanner scanner = new Scanner(System.in);

    public int getRoof() {
        return roof;
    }

    public void setRoof(int roof) {
        this.roof = roof;
    }

    public Elevator() {
        this.currentFloor = 1;
    }

    public Elevator(int roof) {
        currentFloor = 1;
        this.roof = roof;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getChosenFloor() {
        return chosenFloor;
    }

    public void setChosenFloor(int chosenFloor) {
        this.chosenFloor = chosenFloor;
    }

    public void goUp() {
        setCurrentFloor(getCurrentFloor() + 1);
        System.out.println("Going up: " + getCurrentFloor());
        wait(1500);
        if (getCurrentFloor() == getChosenFloor()) {
            System.out.println("You are here!");
        }

    }

    public void goDown() {
        setCurrentFloor(getCurrentFloor() - 1);
        System.out.println("Going down: " + getCurrentFloor());
        wait(1500);
        if (getCurrentFloor() == getChosenFloor()) {
            System.out.println("You are here!");
        }

    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
