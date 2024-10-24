// Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.

// Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.

// Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

// Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos(). Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos. Adicione um método específico para cada uma das subclasses, como verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.


public class App {
    public static void main(String[] args) throws Exception {

        ModeloCarro carro = new ModeloCarro();

        carro.definirModelo("Fusca");
        carro.definirPrecos(10000, 25000, 18500);
        carro.calcularMenorPreco();
        carro.calcularMaiorPreco();

        carro.exibirInfos();


        Cachorro cao = new Cachorro();
        Gato gato = new Gato();

        cao.emitirSom();
        cao.abanarRabo();

        gato.emitirSom();
        gato.arranharMoveis();

        ContaCorrente conta = new ContaCorrente();

        conta.depositar(1000);
        conta.sacar(250);
        conta.consultarSaldo();
        conta.cobrarTarifaMensal(30);
        conta.consultarSaldo();


    }
}
