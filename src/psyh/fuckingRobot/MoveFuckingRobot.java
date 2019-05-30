package psyh.fuckingRobot;

public class MoveFuckingRobot {

    private static int horizontalDistance, verticalDistance;

    private static int demeentionOfWolking(Direction direction) {
        return direction == Direction.DOWN || direction == Direction.UP ? verticalDistance : horizontalDistance;
    }

    private static void wolker(FuckingRobot robot, int distance) {
        for (; distance > 0; distance--) {
            robot.stepForward();
        }
    }

// Це найгірше, що зі мною траплялося за останній час. Або так код не має писатись, або я не хочу бути програмістом.
// Софія, пробач, будь ласка, коли я це маніакально писав, а всілякого графоманства було разів у 7 більше,
// я меньш за все думав, що комусь потім доведеться знов торувати цей нелюдяний шлях.
    public static void moveFuckingRobot(FuckingRobot robot, int toX, int toY) {
        horizontalDistance = robot.getX() > toX ? robot.getX() - toX : toX - robot.getX();
        verticalDistance = robot.getY() > toY ? robot.getY() - toY : toY - robot.getY();
        Direction longWay = horizontalDistance > verticalDistance ?
                robot.getX() > toX ? Direction.LEFT : Direction.RIGHT :
                robot.getY() > toY ? Direction.DOWN : Direction.UP;
        Direction shortWay = horizontalDistance < verticalDistance ?
                robot.getX() > toX ? Direction.LEFT : Direction.RIGHT :
                robot.getY() > toY ? Direction.DOWN : Direction.UP;
        boolean bothIsZero = (horizontalDistance == 0) && (verticalDistance == 0);
        while (!bothIsZero) {
            bothIsZero = (horizontalDistance == 0) && (verticalDistance == 0);
            if (bothIsZero) return;
            switch (robot.getDirection()) {
                case UP:
                    switch (longWay) {
                        case UP:
                            wolker(robot, demeentionOfWolking(longWay));
                            verticalDistance = 0;
                            break;
                        case LEFT:
                            robot.turnLeft();
                            wolker(robot, demeentionOfWolking(longWay));
                            horizontalDistance = 0;
                            break;
                        case RIGHT:
                            robot.turnRight();
                            wolker(robot, demeentionOfWolking(longWay));
                            horizontalDistance = 0;
                            break;
                    }
                    break;
                case DOWN:
                    switch (longWay) {
                        case DOWN:
                            wolker(robot, demeentionOfWolking(longWay));
                            verticalDistance = 0;
                            break;
                        case LEFT:
                            robot.turnRight();
                            wolker(robot, demeentionOfWolking(longWay));
                            horizontalDistance = 0;
                            break;
                        case RIGHT:
                            robot.turnLeft();
                            wolker(robot, demeentionOfWolking(longWay));
                            horizontalDistance = 0;
                            break;
                    }
                    break;
                case LEFT:
                    switch (longWay) {
                        case LEFT:
                            wolker(robot, demeentionOfWolking(longWay));
                            horizontalDistance = 0;
                            break;
                        case UP:
                            robot.turnRight();
                            wolker(robot, demeentionOfWolking(longWay));
                            verticalDistance = 0;
                            break;
                        case DOWN:
                            robot.turnLeft();
                            wolker(robot, demeentionOfWolking(longWay));
                            verticalDistance = 0;
                            break;
                    }
                    break;
                case RIGHT:
                    switch (longWay) {
                        case RIGHT:
                            wolker(robot, demeentionOfWolking(longWay));
                            horizontalDistance = 0;
                            break;
                        case DOWN:
                            robot.turnRight();
                            wolker(robot, demeentionOfWolking(longWay));
                            verticalDistance = 0;
                            break;
                        case UP:
                            robot.turnLeft();
                            wolker(robot, demeentionOfWolking(longWay));
                            verticalDistance = 0;
                            break;
                    }
                    break;
            }

            switch (robot.getDirection()) {
                case UP:
                    switch (shortWay) {
                        case UP:
                            wolker(robot, demeentionOfWolking(shortWay));
                            verticalDistance = 0;
                            break;
                        case LEFT:
                            robot.turnLeft();
                            wolker(robot, demeentionOfWolking(shortWay));
                            horizontalDistance = 0;
                            break;
                        case RIGHT:
                            robot.turnRight();
                            wolker(robot, demeentionOfWolking(shortWay));
                            horizontalDistance = 0;
                            break;
                    }
                    break;
                case DOWN:
                    switch (shortWay) {
                        case DOWN:
                            wolker(robot, demeentionOfWolking(shortWay));
                            verticalDistance = 0;
                            break;
                        case LEFT:
                            robot.turnRight();
                            wolker(robot, demeentionOfWolking(shortWay));
                            horizontalDistance = 0;
                            break;
                        case RIGHT:
                            robot.turnLeft();
                            wolker(robot, demeentionOfWolking(shortWay));
                            horizontalDistance = 0;
                            break;
                    }
                    break;
                case LEFT:
                    switch (shortWay) {
                        case LEFT:
                            wolker(robot, demeentionOfWolking(shortWay));
                            horizontalDistance = 0;
                            break;
                        case UP:
                            robot.turnRight();
                            wolker(robot, demeentionOfWolking(shortWay));
                            verticalDistance = 0;
                            break;
                        case DOWN:
                            robot.turnLeft();
                            wolker(robot, demeentionOfWolking(shortWay));
                            verticalDistance = 0;
                            break;
                    }
                    break;
                case RIGHT:
                    switch (shortWay) {
                        case RIGHT:
                            wolker(robot, demeentionOfWolking(shortWay));
                            horizontalDistance = 0;
                            break;
                        case DOWN:
                            robot.turnRight();
                            wolker(robot, demeentionOfWolking(shortWay));
                            verticalDistance = 0;
                            break;
                        case UP:
                            robot.turnLeft();
                            wolker(robot, demeentionOfWolking(shortWay));
                            verticalDistance = 0;
                            break;
                    }
                    break;
            }
        }
    }
}
