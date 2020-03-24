public class RectangleClass {
    double width, height;
    public RectangleClass (){}
    public RectangleClass(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }
    public String display(){
        return "Rectangle{" + "width = " + this.width + ", height = " + this.height;
    }

    public static void main(String[] args) {
        RectangleClass rectangle = new RectangleClass(50,30);
        rectangle.display();
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
