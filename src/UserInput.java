import java.util.Scanner;

public class UserInput {
    private Scanner input = new Scanner(System.in);
    
    public Command getCommand() {
        char ch = Character.toUpperCase(input.next().charAt(0));
        return getCommand(ch);
    }
    
    public Command getCommand(char keyChar) {
        switch(keyChar) {
            case 'A':
                return Command.LEFT;
            case 'D':
                return Command.RIGHT;
            case 'W':
                return Command.SHOOT;
            case 'H':
                return Command.HELP;
            case 'Q':
                return Command.QUIT;
            default:
                return Command.NOTHING;
        }
    }
}
