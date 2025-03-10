class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        if (width < 0) {
            System.err.println("Chieu rong la so am invalid.");
            this.width = 1;
        } else {
            this.width = width;
        }
        if (height < 0) {
            System.err.println("Chieu dai la so am invalid. ");
            this.height = 1;
        } else {
            this.height = height;
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public void visualize() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(); 
    }
}

class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(8, 3);
        Rectangle rect2 = new Rectangle(2, -6);
        Rectangle rect3 = new Rectangle(4, 4);
       
        System.out.println("Rectangle 1:");
        rect1.visualize();

        System.out.println("Rectangle 2:");
        rect2.visualize();

        System.out.println("Rectangle 3:");
        rect3.visualize();

       
    }
}