package idonotknowhowicannamethispackageoverdotes.robot;

import java.util.Random;

public class Robot {
    Random random = new Random();
    private int max = 10;
    private int min = -10;
    private int x = random.nextInt((max - min) + 1) + min;
    private int y = random.nextInt((max - min) + 1) + min;
    private Direction direction = Direction.values()[random.nextInt(Direction.values().length)];

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {

        switch (direction) {
            case UP:
                this.direction = Direction.LEFT;
                return;
            case DOWN:
                this.direction = Direction.RIGHT;
                return;
            case LEFT:
                this.direction = Direction.DOWN;
                return;
            default:
                this.direction = Direction.UP;
        }
    }

    public void turnRight() {

        switch (direction) {
            case UP:
                this.direction = Direction.RIGHT;
                return;
            case DOWN:
                this.direction = Direction.LEFT;
                return;
            case LEFT:
                this.direction = Direction.UP;
                return;
            default:
                this.direction = Direction.DOWN;
        }
    }

    public void stepForward() {

        switch (direction) {
            case UP:
                this.y++;
                break;
            case DOWN:
                this.y--;
                break;
            case LEFT:
                this.x--;
                break;
            default:
                this.x++;
        }
    }
}
