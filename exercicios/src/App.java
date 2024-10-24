// Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
// Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
// Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
// Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
// Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.


public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();

        pessoa.olaMundo();


        Calculadora calculadora = new Calculadora();

        int valor = calculadora.dobro(2);
        System.out.println(valor);


        Musica musica = new Musica();

        musica.titulo = "Blind";
        musica.artista = "Korn";
        musica.anoLancamento = 1994; 

        musica.fichaTecnica();

        musica.avalieMusica(8);
        musica.avalieMusica(5);
        musica.avalieMusica(3);

        double media = musica.media();

        System.out.println("Média: " + media);



        Carro carro = new Carro();

        carro.modelo = "BWM";
        carro.cor = "Preta";
        carro.ano = 2010;

        carro.fichaTecnica();

       int idade = carro.idadeCarro(2024);
        System.out.println("O carro tem " + idade + " anos.");

        Aluno aluno = new Aluno();

        aluno.nome = "Guilherme";
        aluno.idade = 32;

        aluno.exibirInfos();

    }
}
