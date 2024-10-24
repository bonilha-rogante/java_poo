// Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

public class ContaCorrente extends ContaBancaria{
    double tarifaMensal;

    public void cobrarTarifaMensal(double tarifaMensal){
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal cobrada");
    }
}
