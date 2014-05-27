package areademo;
class CRectangle{
    int width;
    int height;
    int area(){
        return width*height;
    }
}
public class AreaDemo {
    public static void main(String[] args) {
        CRectangle c1 = new CRectangle();
        c1.width = 55; c1.height = 22;
        System.out.println(c1.area());
    }
}
