// Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.

public class Carro {
    private String modelo;
    private Double preco_1;
    private Double preco_2;
    private Double preco_3;


    public void definirModelo(String modelo){
        this.modelo = modelo;
    }

    public void definirPrecos(double preco_1, double preco_2, double preco_3){
        this.preco_1 = preco_1;
        this.preco_2 = preco_2;
        this.preco_3 = preco_3;
    }

    public void exibirInfos(){
        System.out.println(modelo);
        System.out.println(preco_1);
        System.out.println(preco_2);
        System.out.println(preco_3);
        System.out.println(calcularMenorPreco());
        System.out.println(calcularMaiorPreco());
    }

    public double calcularMenorPreco(){
        double menorPreco = preco_1;

        if(menorPreco > preco_2){
            menorPreco = preco_2;
        }

        if(menorPreco > preco_3){
            menorPreco = preco_3;
        }

        return menorPreco;
    }

    public Double calcularMaiorPreco(){
        double maiorPreco = preco_1;
        
        if(maiorPreco < preco_2){
            maiorPreco = preco_2;
        }

        if(maiorPreco < preco_3){
            maiorPreco = preco_3;
        }

        return maiorPreco;
    }

}
