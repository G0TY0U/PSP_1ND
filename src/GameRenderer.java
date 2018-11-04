public class GameRenderer {
    private GameField gameField;
    private LaserCannon cannon;

    public GameRenderer(GameField gameField, LaserCannon cannon) {
        this.gameField = gameField;
        this.cannon = cannon;
    }
    
    public void render() {
        System.out.println("\nHIGHSCORE: "+gameField.getHighscore());
        for (int y = 0; y < gameField.getHeight(); y++) {
            for (int x = 0; x < gameField.getWidth(); x++) {
                if (y == gameField.getHeight()-2 && x == cannon.getCannonPos()-1) {
                    System.out.print("/=\\");
                    x = x + 2;
                } else if (gameField.isAlien(x, y)) {
                    switch(gameField.getAlienType(x, y)) {
                        case 1:
                            System.out.print("$");
                            break;
                        case 2:
                            System.out.print("~");
                            break;
                        case 3:
                            System.out.print("+");
                            break;
                        case 4:
                            System.out.print("@");
                            break;
                        case 5:
                            System.out.print("*");
                            break;
                        default:
                            System.out.print("?");
                            break;
                    }
                } else if (gameField.isWall(x, y)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
