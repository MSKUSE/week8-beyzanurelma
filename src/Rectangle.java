import com.sun.tools.javac.util.Names;

public class Rectangle extends Shape{
    int sideA= 9,sideB=6;

    public Rectangle(int sideA ,int sideB) {
        this.sideA = sideA;
        this.sideB=sideB;

    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
    public void describe(){
        super.describe();
        System.out.println("Side A " + sideA + "Side B " + sideB);

    }

    @Override
    public boolean equals(Object obj) {
        Rectangle rectangle=(Rectangle) obj;
        if (this.sideA==rectangle.sideA &&
        this.sideB==rectangle.sideB && this.getColor().equals(rectangle.getColor());
                return true;



        )
    };


}
