package Lesson7.Work1;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = {new Rectangle(8, 12),
                new Triangle(5, 8, 5),
                new Circle(10),
                new Circle(25),
                new Circle(15)};

        for (Figure fig : figure)
            System.out.println(fig.getName() + ": area = " + fig.getArea() + "| perimetr: " + fig.getPerimetr());
    }

}
