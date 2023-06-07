public class Circle implements iGeometricObject{

        protected double radius;

    public Circle(double radius) {
            this.radius = radius;
        }

    public Circle() {
            System.out.println("Circle");
        }

        @Override
        public String toString() {
            return "It is circle with radius";
        }

        @Override
        public double getPerimeter() {
            return 2 * radius * Math.PI;
        }

        @Override
        public double getArea() {
            return Math.PI * Math.pow(radius, 2);
        }
}
