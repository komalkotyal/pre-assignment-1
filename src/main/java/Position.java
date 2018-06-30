import java.util.Objects;

enum Direction {
    ;
    public static final char Left = 'L';
    public static final char Right = 'R';
}

enum Heading {
    ;
    public static final char North = 'N';
    public static final char South = 'S';
    public static final char West = 'W';
    public static final char East = 'E';
}


public class Position {
    private final int x_coordinate;
    private final int y_coordinate;
    private final char heading;


    Position(int x_coordinate, int y_coordinate, char heading) {
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
        this.heading = heading;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x_coordinate=" + x_coordinate +
                ", y_coordinate=" + y_coordinate +
                ", heading=" + heading +
                '}';
    }

    Position rotate(char direction) {
        char heading = this.heading;
        if (direction == Direction.Left)
            heading = rotateLeft(heading);
        else
            heading = rotateRight(heading);

        return new Position(x_coordinate, y_coordinate, heading);
    }

    private char rotateLeft(char heading) {
        switch (heading) {
            case Heading.East:
                return Heading.North;
            case Heading.North:
                return Heading.West;
            case Heading.West:
                return Heading.South;
            case Heading.South:
                return Heading.East;
        }
        return heading;
    }

    private char rotateRight(char heading) {
        switch (heading) {
            case Heading.East:
                return Heading.South;
            case Heading.North:
                return Heading.East;
            case Heading.West:
                return Heading.North;
            case Heading.South:
                return Heading.West;
        }
        return heading;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x_coordinate == position.x_coordinate &&
                y_coordinate == position.y_coordinate &&
                heading == position.heading;
    }

    public Position move() {
        int x_coordinate = this.x_coordinate;
        int y_coordinate = this.y_coordinate;
        switch (this.heading)
        {
            case Heading.East:
                x_coordinate +=1;break;
            case Heading.North:
                y_coordinate +=1;break;
            case Heading.West:
                x_coordinate -=1;break;
            case Heading.South:
                y_coordinate -=1;break;
        }
        return new Position(x_coordinate,y_coordinate,this.heading);
    }
}
