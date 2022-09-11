public class Fan {
    private int speed;
    private boolean reverse;

    public Fan() {
        speed = 0;
        reverse = false;
    }

    public void pullSpeedCord() {
        if (++speed > 3) {
            speed = 0;
        }
    }

    public void pullReverseCord() {
        reverse = !reverse;
    }

    public void printFanStatus() {
        System.out.println("Fan speed: " + getSpeed() + ", reverse spin: " + isReverse());
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isReverse() {
        return reverse;
    }

    public void setReverse(boolean reverse) {
        this.reverse = reverse;
    }
}
