import java.awt.*;

public class GameUtil {

    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param x
     *            Coordinate in the gameboard matrix.
     * @param y
     *            Coordinate in the gameboard matrix.
     * @param tile
     *            The type of tile to paint in specified position
     */
    public static void setGameboardState(final int x, final int y,
                                     final GameTile tile,GameTile[][] gameBoard) {
        gameBoard[x][y] = tile;
    }
    /**
     * Returns the GameTile in logical position (x,y) of the gameboard.
     *
     * @param x
     *            Coordinate in the gameboard matrix.
     * @param y
     *            Coordinate in the gameboard matrix.
     */
    public static GameTile getGameboardState(final int x, final int y, GameTile[][] gameBoard) {
        return gameBoard[x][y];
    }

    /**
     * Returns the size of the gameboard.
     */
    public static Dimension getGameboardSize() {
        return Constants.getGameSize();
    }
}
