package shape;

public class Square extends Rectangle{

    public Square(){
        this.color="Red";
        this.filled=false;
        this.length=1;
        this.width=1;
    }
    public Square(double Side){
        this.color="Red";
        this.filled=false;
        this.length=Side;
        this.width=Side;
    }
    public Square(double Side,String color,boolean filled){
        this.color=color;
        this.filled=filled;
        this.length=Side;
        this.width=Side;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }
    public double getSide() {
        return this.length;
    }

    @Override
    public void setLength(double Side){
        this.length=Side;
    }

    @Override
    public void setWidth(double Side){
        this.width=Side;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
