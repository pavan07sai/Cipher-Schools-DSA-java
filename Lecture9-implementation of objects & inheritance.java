------------------inheritance------------------------
class shape{
    double pi = 3.14;
    double getSquare(int r){
        return r*r;
    }
}
class Circle extends shape{
    void area(int r){
        System.out.println(pi*getSquare(r));
    }
}
public class inheritancestudy {
    public static void main(String[] args){
        Circle c  = new Circle();
        c.area(10);
    }
    
}
