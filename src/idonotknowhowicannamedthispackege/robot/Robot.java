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
        System.out.println("Поворот против часовой стрелки");
        if (direction == Direction.DOWN) {
            System.out.println("Вниз -> вправо");
            this.direction = Direction.RIGHT;
            return;
        }

        if (direction == Direction.UP) {
            System.out.println("Вверх -> влево");
            this.direction = Direction.LEFT;
            return;
        }

        if (direction == Direction.LEFT) {
            System.out.println("Влево -> вниз");
            this.direction = Direction.DOWN;
            return;
        }

        if (direction == Direction.RIGHT) {
            System.out.println("Вправо -> вверх");
            this.direction = Direction.UP;
            return;
        }
    }

    public void turnRight() {
        System.out.println("поворот по часовой стрелке");
        if (this.direction == Direction.DOWN) {
            System.out.println("Вниз -> влево");
            this.direction = Direction.LEFT;
            return;
        }

        if (this.direction == Direction.UP) {
            System.out.println("Вверх -> вправо");
            this.direction = Direction.RIGHT;
            return;
        }

        if (this.direction == Direction.LEFT) {
            System.out.println("Влево -> вверх");
            this.direction = Direction.UP;
            return;
        }

        if (this.direction == Direction.RIGHT) {
            System.out.println("Вправо -> вниз");
            this.direction = Direction.DOWN;
            return;
        }
    }

    public void stepForward() {
        System.out.println("движение");
        if (direction == Direction.DOWN) {
            System.out.println("вниз");
            this.y--;
        }

        if (direction == Direction.UP) {
            System.out.println("вверх");
            this.y++;
        }

        if (direction == Direction.LEFT) {
            System.out.println("налево");
            this.x--;
        }

        if (direction == Direction.RIGHT) {
            System.out.println("направо");
            this.x++;
        }
    }
}
