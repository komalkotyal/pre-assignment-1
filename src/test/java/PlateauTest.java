import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class PlateauTest {

    @Test
    public void shouldTellIfThePositionIsInGrid() {
        Plateau plateau = new Plateau(5,5);
        Position position = new Position(1,4,Heading.North);
        assertTrue(plateau.isInGrid(position));
    }

    @Test
    public void shouldTellIfThePositionIsNotInGrid() {
        Plateau plateau = new Plateau(5,5);
        Position position = new Position(1,6,Heading.North);
        assertTrue(!plateau.isInGrid(position));
    }
}
