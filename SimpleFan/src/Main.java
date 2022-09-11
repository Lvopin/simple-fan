public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.printFanStatus();

        fan.pullSpeedCord();
        fan.printFanStatus(); // speed 0,

        fan.pullSpeedCord();
        fan.printFanStatus();

        fan.pullSpeedCord();
        fan.printFanStatus();

        fan.pullSpeedCord();
        fan.printFanStatus();

        fan.pullReverseCord();
        fan.printFanStatus();

        fan.pullSpeedCord();
        fan.printFanStatus();

        fan.pullSpeedCord();
        fan.printFanStatus();

        fan.pullSpeedCord();
        fan.printFanStatus();

        fan.pullSpeedCord();
        fan.printFanStatus();
    }
}