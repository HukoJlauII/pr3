package shape;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void MoveUp() {
        y+=ySpeed;
    }

    @Override
    public void MoveDown() {
        y-=ySpeed;
    }

    @Override
    public void MoveLeft() {
        x-=xSpeed;
    }

    @Override
    public void MoveRight() {
        x+=xSpeed;
    }
}
