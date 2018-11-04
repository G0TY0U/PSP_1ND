public class GameField {
    private int highscore = 0;
    private int noOfAliens = 0;
    
    private int field[][] = new int[][] {
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,6,6,6,6,6,6,6,6,6,6,6,0,1},
        {1,0,5,5,5,5,5,5,5,5,5,5,5,0,1},
        {1,0,4,4,4,4,4,4,4,4,4,4,4,0,1},
        {1,0,3,3,3,3,3,3,3,3,3,3,3,0,1},
        {1,0,2,2,2,2,2,2,2,2,2,2,2,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    };

    public int getHighscore() {
        return highscore;
    }
    
    public void setHighscore(int alien) {
        switch(alien) {
            case 1:
                highscore = highscore + 10;
                break;
            case 2:
                highscore = highscore + 15;
                break;
            case 3:
                highscore = highscore + 20;
                break;
            case 4:
                highscore = highscore + 25;
                break;
            case 5:
                highscore = highscore + 30;
                break;
            default:
                break;
        }
    }
    
    public boolean isWall(int x, int y) {
        return field[y][x] == 1;
    }
    
    public boolean isAlien(int x, int y) {
        return field[y][x] > 1;
    }
    
    public int getHeight() {
        return field.length;
    }
    
    public int getWidth() {
        return field[0].length;
    }
    
    public void removeAlien(int x, int y) {
        noOfAliens = noOfAliens - 1;
        field[y][x] = 0;
    }
    
    public int getAlienType(int x, int y) {
        switch(field[y][x]) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                return 0;
        }
    }

    public int getNoOfAliens() {
        return noOfAliens;
    }

    public void countAliens() {
        for (int y = 0; y < getHeight(); y++) {
            for (int x = 0; x < getWidth(); x++) {
                if (isAlien(x, y)) {
                    noOfAliens = noOfAliens + 1;
                }
            }
        }
    }
    
}
