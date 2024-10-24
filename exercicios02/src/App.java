// Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.

// Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

// Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

// Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.

// Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.

public class App {
    public static void main(String[] args) throws Exception {
        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setIdade(18);
        int idade = pessoa.getIdade();
        System.out.println(idade);

        pessoa.verficarIdade();

        Produto produto = new Produto();

        produto.setPreco(100);
        produto.aplicarDesconto(25);

        Aluno aluno = new Aluno();

        aluno.setNome("Guilherme");
        aluno.setNota1(6);
        aluno.setNota2(8);
        aluno.setNota3(9);

        double media = aluno.calcularMedia(aluno.getNota1(), aluno.getNota2(), aluno.getNota3());

        System.out.println(media);

        Livro livro = new Livro();

        livro.setTitulo("Hellraiser");

        livro.setAutor("Clive Barker");

        livro.exibirDetalhes();


    }
}
