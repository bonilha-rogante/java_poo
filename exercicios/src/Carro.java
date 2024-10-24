public class Carro {
    String modelo;
    int ano;
    String cor;

    void fichaTecnica(){
        System.out.println("Modelo: " + modelo + " | Ano: " + ano + " | Cor: " + cor);
    }

    int idadeCarro(int anoAtual){
        int idade = anoAtual - ano;
        return idade;
    }

}
