import java.awt.Rectangle;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int width = 10;
        int height = 20;

        int newX = 5;
        int newY = 5;

        double area;
        double perimeter;

        Rectangle box = new Rectangle(x, y, width, height);
        

        box.translate(newX, newY);

        Rectangle box2 = new Rectangle( newX + width, newY, width, height);
        Rectangle box3 = new Rectangle( newX + width*2, newY, width, height);
        Rectangle box4 = new Rectangle( newX + width*3, newY, width, height);

        Rectangle boxU = box.union(box2).union(box3).union(box4);


        perimeter = ( boxU.getHeight() + boxU.getWidth() ) * 2;
        area = ( boxU.getHeight() * boxU.getWidth() );

        System.out.println(boxU);
        System.out.println (area);
        System.out.println (perimeter);

    }
}