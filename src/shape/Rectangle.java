package shape;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        this.filled=false;
        this.color="Red";
        this.width=1;
        this.length=1;
    }
    public Rectangle(double width,double length){
        this.filled=false;
        this.color="Red";
        this.length=length;
        this.width=width;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        this.filled=false;
        this.color="Red";
        this.length=length;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea(){
        return length*width;
    }

    @Override
    public double getPerimeter(){
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                "} " + super.toString();
    }

}
