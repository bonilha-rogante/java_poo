// Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.

public class ProdutoFisico extends Produto implements Calculavel {
    @Override
    public double calcularPrecoFinal(){
        return preco * 1.05;
    }
    
}
