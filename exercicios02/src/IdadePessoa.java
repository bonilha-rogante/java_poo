// Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void verficarIdade(){
        if(this.idade >= 18){
            System.out.println(String.format("Você tem %d anos e é maior de idade.", idade));
        } else{
            System.out.println(String.format("Você tem %d anos e é menor de idade.", idade));
        }
    }
}
