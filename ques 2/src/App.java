class Triangle {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }

    public String verify() {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1 || side1<=0 || side2 <= 0 || side3 <=0) {
            return "Khong6  phai tam giac";
        }
        if (side1 == side2 && side2 == side3) {
            return "Equilateral Triangle";
        }
        if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles Triangle";
        }
        return "Scalene Triangle";
    }
}
class TestTriangle {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Nhap 3 so cua side:");
        String inputLine = scanner.nextLine();
        String[] inputs = inputLine.split(" ");
        if(inputs.length != 3){
            System.err.println("Nhap du 3 so de.");
            scanner.close();
            return;
        }
        double s1 = 0, s2 = 0, s3 = 0;
        try{
             s1 = Double.parseDouble(inputs[0]);
             s2 = Double.parseDouble(inputs[1]);
             s3 = Double.parseDouble(inputs[2]);
        } catch (NumberFormatException e){
            System.err.println("Input sai.");
            scanner.close();
            return;
        }


        Triangle triangle = new Triangle(s1, s2, s3);
        String type = triangle.verify();

        System.out.println(type); 
        scanner.close();
    }
}