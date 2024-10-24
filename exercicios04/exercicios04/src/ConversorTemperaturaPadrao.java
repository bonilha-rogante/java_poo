// Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.


public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double celsius){
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Celsius: " + celsius);
    }
    
}
