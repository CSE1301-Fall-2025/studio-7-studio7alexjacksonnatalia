public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int initLength, int initWidth){
        length = initLength;
        width = initWidth;
    }

    public int area(){
        return length*width;
    }

    public int perimeter(){
        return width *2 + length*2;
    }

    public boolean isSmaller(Rectangle givenRectangle){
        if (this.area()<givenRectangle.area()){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isSquare(){
        if (length == width){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3,3);
        Rectangle r2 = new Rectangle(4, 5);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.isSmaller(r2));
        System.out.println(r1.isSquare());
    }

}
