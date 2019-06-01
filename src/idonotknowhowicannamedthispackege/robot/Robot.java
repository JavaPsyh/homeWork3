package idonotknowhowicannamedthispackege.robot;

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
        if (direction == Direction.DOWN) {
            this.direction = Direction.RIGHT;
            return;
        }

        if (direction == Direction.UP) {
            this.direction = Direction.LEFT;
            return;
        }

        if (direction == Direction.LEFT) {
            this.direction = Direction.DOWN;
            return;
        }

        if (direction == Direction.RIGHT) {
            this.direction = Direction.UP;
            return;
        }
    }

    public void turnRight() {
        if (this.direction == Direction.DOWN) {
            this.direction = Direction.LEFT;
            return;
        }

        if (this.direction == Direction.UP) {
            this.direction = Direction.RIGHT;
            return;
        }

        if (this.direction == Direction.LEFT) {
            this.direction = Direction.UP;
            return;
        }

        if (this.direction == Direction.RIGHT) {
            this.direction = Direction.DOWN;
            return;
        }
    }

    public void stepForward() {
        if (direction == Direction.DOWN) {
            this.y--;
        }

        if (direction == Direction.UP) {
            this.y++;
        }

        if (direction == Direction.LEFT) {
            this.x--;
        }

        if (direction == Direction.RIGHT) {
            this.x++;
        }
    }
}
