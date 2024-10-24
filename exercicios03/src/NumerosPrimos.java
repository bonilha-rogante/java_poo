// Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos(). Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos. Adicione um método específico para cada uma das subclasses, como verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.


public class NumerosPrimos {
    public boolean verificarPrimalidade(int numero){
        if (numero <= 1){
            return false;
        }
        for(int i = 2; i * i <= numero; i++){
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }
}
