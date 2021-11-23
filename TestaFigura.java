import java.lang.Character.Subset;

public class TestaFigura {
    public static void main(String[] args) {
        Quadrado quadrado=new  Quadrado();
        Triangulo triangulo=new Triangulo();
        
        triangulo.setLadoA(5);
        triangulo.setLadoB(6);
        triangulo.setLadoC(6);
        triangulo.setBase(5);
        triangulo.setAltura(8);

        System.out.println(triangulo.getNomeFigura());
        System.out.println(triangulo.getPerimetro());
        System.out.println(triangulo.getArea());

        quadrado.setLado(5);
        
        System.out.println(quadrado.getPerimetro());
        System.out.println(quadrado.getArea());
        System.out.println(quadrado.getNomeFigura());
    }
}
