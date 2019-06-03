package tasks.robot;

public class MoveRobot {

    public static void moveRobot(Robot robot, int toX, int toY) {

        int startX = robot.getX();
        int startY = robot.getY();
        Direction directionToX = startX > toX ? Direction.LEFT : Direction.RIGHT;
        Direction directionToY = startY > toY ? Direction.DOWN : Direction.UP;
        int distanceX = startX > toX ? startX - toX : toX - startX;
        int distanceY = startY > toY ? startY - toY : toY - startY;

        while (robot.getDirection() != directionToX) {
            robot.turnLeft();
        }
        for (int x = distanceX; x > 0; x--) {
            robot.stepForward();
        }
        while (robot.getDirection() != directionToY) {
            robot.turnLeft();
        }
        for (int y = distanceY; y > 0; y--) {
            robot.stepForward();
        }
    }
}
