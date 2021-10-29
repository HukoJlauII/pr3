package shape;

public class MovableCircle implements Movable{
    private int raduis;
    private MovablePoint center;
    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius)
    {
        center= new MovablePoint(x,y,xSpeed,ySpeed);
        this.raduis=radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "raduis=" + raduis +
                ", center=" + center +
                '}';
    }
    @Override
    public void MoveUp(){
        center.MoveUp();
    }

    @Override
    public void MoveDown() {
        center.MoveDown();
    }

    @Override
    public void MoveLeft() {
        center.MoveLeft();
    }

    @Override
    public void MoveRight() {
        center.MoveRight();
    }
}
