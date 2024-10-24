// Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

public class ContaBancaria {
    double saldo;

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Você depositou R$ " + valor );
        
    }

    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("Você está tendo fazer um saque maior que seu saldo");
        }else{
            saldo -= valor;
            System.out.println("Você sacou R$ " + valor);
        }
        
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo atual é de R$ " + this.saldo);
    }
}
