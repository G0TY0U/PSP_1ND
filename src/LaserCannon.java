public class LaserCannon {
    private static final int DEFAULT_POS = 7;
    private int cannonPos;

    public LaserCannon() {
        this.cannonPos = DEFAULT_POS;
    }

    public LaserCannon(int position) {
        this.cannonPos = position;
    }

    public int getCannonPos() {
        return cannonPos;
    }

    public void setCannonPos(int cannonPos) {
        this.cannonPos = cannonPos;
    }
    
    
    
}
