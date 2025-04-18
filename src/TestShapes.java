public class TestShapes {
    public static void main(String[] args){

        Shape shape= new Shape();
        shape.describe(
        );

        Rectangle r1=new Rectangle(3,4);
        Rectangle r2=new Rectangle(5,7);

        System.out.println(r1.equals(r2));

    }
}
