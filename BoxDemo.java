class Box {
    double width, height, depth;

    
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    
    double volume() {
        return width * height * depth;
    }
}
class BoxDemo{
    public static void main(String []args) {
        Box b1 = new Box(200, 200, 200);
        Box b2 = new Box(200, 200, 200);
        
        
        double volume1 = b1.volume();
        System.out.println("Volume of Box 1 = " + volume1);
        
  
        double volume2 = b2.volume();
        System.out.println("Volume of Box 2 = " + volume2);
    }
}
