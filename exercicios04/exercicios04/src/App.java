// Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.

// Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.

// Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como parâmetro.

// Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.

// Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.

// Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.


public class App {
    public static void main(String[] args) throws Exception {
        ConversorMoeda converte = new ConversorMoeda();
        converte.converterDolarParaReal(10);

        System.out.println();

        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();
        sala.calcularArea(5,10);
        sala.calcularPerimetro(5,10);

        System.out.println();

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(9);

        System.out.println();

        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        conversor.celsiusParaFahrenheit(32);
        conversor.fahrenheitParaCelsius(89.6);
    }
}
