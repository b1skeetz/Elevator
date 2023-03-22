public class Program extends Elevator {
    private boolean isWork = true;

    public Program() {
        super();
    }

    public Program(int amount) {
        super(amount);
        System.out.println("Elevator created successfully");
    }

    public boolean getWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }

    public void start() {
        while (getWork()) {
            System.out.println("-----------------------");
            System.out.println("You are on the " + getCurrentFloor() + " floor");
            System.out.println("If you want exit, type 0.");
            System.out.print("Choose your destination (1 - " + getRoof() + "): ");
            setChosenFloor(scanner.nextInt());
            if (getChosenFloor() == 0) {
                stop();
            } else {
                if (getChosenFloor() <= getRoof() && getCurrentFloor() < getChosenFloor()) {
                        while (getCurrentFloor() < getChosenFloor()) {
                            goUp();
                    }
                }
                if (getChosenFloor() >= 1) {
                    {
                        while (getCurrentFloor() > getChosenFloor() && getCurrentFloor() > getChosenFloor()) {
                            goDown();
                        }
                    }
                }
            }
        }
    }

    public void stop() {
        boolean isStop = true;
        while (isStop) {
            System.out.print("Are you sure you want to exit? y/n: ");
            String answer = scanner.next();
            if (!answer.equals("")) {
                if (answer.equals("y")) {
                    setWork(false);
                    System.out.println("Good bye");
                    isStop = false;
                } else if (answer.equals("n")) {
                    setWork(true);
                    System.out.println("We are still here");
                    isStop = false;
                } else {
                    System.out.println("Wrong command! Try one more time!");
                }
            }
        }

    }
}
