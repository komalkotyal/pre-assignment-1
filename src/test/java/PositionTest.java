import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
public class PositionTest {

    @Test
    public void shouldGetNewPositionHeadingWestOnGivingDirectionLeftToPositionHeadingNorth()
    {
        Position position = new Position(1,2,Heading.North);
        Position newPosition = new Position(1,2,Heading.West);
        assertEquals(newPosition,position.rotate(Direction.Left));
    }

    @Test
    public void shouldGetNewPositionHeadingSouthOnGivingDirectionRightToPositionHeadingEast()
    {
        Position position = new Position(1,2,Heading.East);
        Position newPosition = new Position(1,2,Heading.South);
        assertEquals(newPosition,position.rotate(Direction.Right));
    }

    @Test
    public void shouldGetNewPositionOnGivingMoveToPositionHeadingNorth()
    {
        Position position = new Position(1,2,Heading.North);
        Position newPosition = new Position(1,3,Heading.North);
        assertEquals(newPosition,position.move());
    }

    @Test
    public void shouldGetNewPositionOnGivingMoveToPositionHeadingWest()
    {
        Position position = new Position(1,2,Heading.West);
        Position newPosition = new Position(0,2,Heading.West);
        assertEquals(newPosition,position.move());
    }

    @Test
    public void shouldGetNewPositionOnGivingMoveToPositionHeadingSouth()
    {
        Position position = new Position(1,2,Heading.South);
        Position newPosition = new Position(1,1,Heading.South);
        assertEquals(newPosition,position.move());
    }

    @Test
    public void shouldGetNewPositionOnGivingMoveToPositionHeadingEast()
    {
        Position position = new Position(1,2,Heading.East);
        Position newPosition = new Position(2,2,Heading.East);
        assertEquals(newPosition,position.move());
    }

}
