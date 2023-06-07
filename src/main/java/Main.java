public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        ResizableCircle resizableCircle = new ResizableCircle(70);
        ResizableCircle resizableCircle1 = new ResizableCircle();
        resizableCircle.resize(5);
        System.out.println(resizableCircle.radius);
        resizableCircle1.resize(150);
        System.out.println(resizableCircle1.radius);

        System.out.println( circle instanceof iGeometricObject);
        System.out.println( circle instanceof iResizable);

        System.out.println(resizableCircle instanceof iResizable);
        System.out.println(resizableCircle instanceof iGeometricObject);

        iResizable resizable2 = new ResizableCircle(1);
        resizable2.resize(1);
        ResizableCircle resizable21 = (ResizableCircle) resizable2;
        System.out.println(resizable21.getArea());

        Circle circle1 = new ResizableCircle(15);
        System.out.println(circle1);
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getArea());
        if(circle1 instanceof ResizableCircle){
            System.out.println("It is resizable circle");
            ((ResizableCircle) circle1).resize(5);
        }
    }
}
