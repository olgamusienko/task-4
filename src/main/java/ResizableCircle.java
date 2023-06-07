public class ResizableCircle extends Circle implements iResizable{

    public ResizableCircle(double radius) {
        super(radius);
    }
    public ResizableCircle(){
        System.out.println("ResizableCircle");
    }

    @Override
    public String toString() {
        return "It is resizable circle with radius";
    }

    @Override
    public void resize(int percent) {
        radius *=  percent / 100.0;
        System.out.println(radius);
    }
}
