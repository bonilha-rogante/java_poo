// Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public void calcularArea(double altura, double largura){
        double area = altura * largura;
        System.out.println("A área é de " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura){
        double perimetro = (altura + largura) * 2;
        System.out.println("O valor do Perímetro é de " + perimetro);
    }

}
