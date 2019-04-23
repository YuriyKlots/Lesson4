public class Rectangle {
    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this.width = 5;
        this.height = 5;
    }

    public double perimetr(){
        return (width+height)*2;
    }

    public void squere(){
        System.out.println("Площа прямокутника = "+ width*height);
    }

    public static void main(String[] args) {

        Rectangle  rect = new Rectangle();
        Rectangle  rect2 = new Rectangle(5,9);

        rect.squere();
        System.out.println("Периметр прямокутника = "+ rect.perimetr());
        System.out.println("Інший прямокутник");
        rect2.squere();
        System.out.println("Периметр прямокутника = "+ rect2.perimetr());

    }
}



 // Main класі продемонструвати створення об’єктів використовуючи два конструктори. Вивести на консоль площу і периметр прямокутника. Вивід на консолі повинен мати наступний вигляд: «Площа прямокутника = тут буде площа », «Периметр прямокутника = тут буде периметр».
