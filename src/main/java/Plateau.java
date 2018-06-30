public class Plateau {
    private final int xMax;
    private final int yMax;
    public Plateau(int xMax, int yMax) {
        this.xMax=xMax;
        this.yMax=yMax;
    }

    public boolean isInGrid(Position position) {

        return position.isIn(xMax,yMax);
    }
}
