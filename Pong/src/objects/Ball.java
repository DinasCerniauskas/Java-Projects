package objects;

public class Ball {
    private int ballx = 200;
    private int bally = 200;
    private int balldirx = 1;
    private int balldiry = -1;
    private int points = 0;
    private int enemypoints = 0;

    public int getBallx() {
        return ballx;
    }

    public void setBallx(int ballx) {
        this.ballx = ballx;
    }

    public int getBally() {
        return bally;
    }

    public void setBally(int bally) {
        this.bally = bally;
    }

    public int getBalldirx() {
        return balldirx;
    }

    public void setBalldirx(int balldirx) {
        this.balldirx = balldirx;
    }

    public int getBalldiry() {
        return balldiry;
    }

    public void setBalldiry(int balldiry) {
        this.balldiry = balldiry;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getEnemypoints() {
        return enemypoints;
    }

    public void setEnemypoints(int enemypoints) {
        this.enemypoints = enemypoints;
    }
}

