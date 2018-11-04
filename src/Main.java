public class Main {

    public static void main(String[] args) throws Exception {
        GameField gameField = new GameField();
        LaserCannon cannon = new LaserCannon();
        
        GameRenderer renderer = new GameRenderer(gameField, cannon);
        GameRules gameRules = new GameRules(gameField, cannon);
        UserInput userInput = new UserInput();
        gameField.countAliens();
        while(true) {
            renderer.render(); 
            if (gameRules.isGameOver()) {
                gameRules.endGame();
            }
            Command command = userInput.getCommand();
            gameRules.processCommand(command);
        }
    }
    
}
