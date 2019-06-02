package idonotknowhowicannamethispackageoverdotes.robot;

public class MoveRobot {

    private static int horizontalDistance, verticalDistance;

    private static int dementionOfWolking(Direction direction) {
        return direction == Direction.DOWN || direction == Direction.UP ? verticalDistance : horizontalDistance;
    }

    private static void wolker(Robot bobot, int distance) {
        for (; distance > 0; distance--) {
            bobot.stepForward();
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        horizontalDistance = robot.getX() > toX ? robot.getX() - toX : toX - robot.getX();
        verticalDistance = robot.getY() > toY ? robot.getY() - toY : toY - robot.getY();
        Direction longWay = horizontalDistance > verticalDistance ?
                robot.getX() > toX ? Direction.LEFT : Direction.RIGHT :
                robot.getY() > toY ? Direction.DOWN : Direction.UP;
        Direction shortWay = horizontalDistance < verticalDistance ?
                robot.getX() > toX ? Direction.LEFT : Direction.RIGHT :
                robot.getY() > toY ? Direction.DOWN : Direction.UP;
        Direction robotDirection;
        while (robot.getDirection() != longWay) {
            robot.turnLeft();
        }
        robotDirection = longWay;
        wolker(robot, dementionOfWolking(robotDirection));
        while (robot.getDirection() != shortWay) {
            robot.turnRight();
        }
        robotDirection = shortWay;
        wolker(robot, dementionOfWolking(robotDirection));
    }
}
