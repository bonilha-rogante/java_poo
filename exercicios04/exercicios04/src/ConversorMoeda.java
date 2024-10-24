// Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.



public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public void converterDolarParaReal(double dolar){
        double cotacaoDolar = 5.15;
        double valorReal = dolar * cotacaoDolar;
        System.out.println("O valor em reais é de R$ " + valorReal);
    }
    
}
