
import java.io.IOException;

public class GameRules {
    private GameField gameField;
    private LaserCannon cannon;

    public GameRules(GameField gameField, LaserCannon cannon) {
        this.gameField = gameField;
        this.cannon = cannon;
    }
    
    public void endGame() throws IOException {
        System.out.println("GAME IS OVER!");
        System.exit(0);
    }
    
    public void processCommand(Command command) throws Exception {
        switch(command) {
            case LEFT:
                tryMoveCannon(-1);
                break;
            case RIGHT:
                tryMoveCannon(1);
                break;
            case QUIT:
                endGame();
                break;
            case SHOOT:
                tryShoot();
                break;
            case HELP:
                System.out.println("< - - Game Commands - - >");
                System.out.println("A - Move LEFT");
                System.out.println("D - Move RIGHT");
                System.out.println("W - Shoot");
                System.out.println("H - Help");
                System.out.println("Q - Quit Game");
                System.out.println("< - - - - - - - - - - - >");
                break;
            default:
                break;
        }
    }
    
    private void tryMoveCannon(int position) {
        int nextPos = cannon.getCannonPos() + position*2;
        if (gameField.isWall(nextPos, gameField.getHeight()-2)) {
            return;
        }
        cannon.setCannonPos(nextPos-position);
    }
    
    private void tryShoot() {
        for (int y = gameField.getHeight()-2; y > 0; y--) {
            if (gameField.isAlien(cannon.getCannonPos(), y)) {
                gameField.setHighscore(gameField.getAlienType(cannon.getCannonPos(), y));
                gameField.removeAlien(cannon.getCannonPos(), y);
                break;
            }
        }
    }
    
    public boolean isGameOver() {
        return (gameField.getNoOfAliens() == 0);
    }
}
