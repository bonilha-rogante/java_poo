// Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

public class Produto {
    private String nome;
    private double preco;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void aplicarDesconto(double porcentagem){
        double desconto = porcentagem / 100 * this.preco; 
        double valorFinal = this.preco - desconto;
        System.out.println(String.format("O valor original do seu produto é R$%.2f e com o desconto ficou R$%.2f", preco, valorFinal));
    }
}
