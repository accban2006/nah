class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distance(Point target) {
        double dx = this.x - target.x;  
        double dy = this.y - target.y; 
        return Math.sqrt(dx * dx + dy * dy); 
    }
}

class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point(5.0, 5.0);
        Point point2 = new Point(7.0, 5.0);
        double dist = point1.distance(point2);
        System.out.println("khoang cach giua p1 va p2: " + dist);
        Point point3 = new Point(3, 3);
        Point point4 = new Point(4, 4);
        double dist2 = point3.distance(point4);
        System.out.println("khoang cach giua p2 va p3: " + dist2);
        double dist3 = point1.distance(point1);
        System.out.println("khoang cach p1 toi chinh no: " + dist3);
        Point x = new Point(-2.5, 4);
        Point y = new Point(3, -5);
        System.out.print("Distance from x to y using hint's example: " + x.distance(y));
    }
}