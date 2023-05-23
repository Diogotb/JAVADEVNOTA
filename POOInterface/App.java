package POOInterface;

public class App {
    public static void main(String[] args) {
        Quadrado figura1 = new Quadrado(6);
        System.out.println("Area="+figura1.getArea()
        +" Perimetro="+figura1.getPerimetro()+" "
        +figura1.getNomeFigura());
    }
}
