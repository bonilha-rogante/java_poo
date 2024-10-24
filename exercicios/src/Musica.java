public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void fichaTecnica(){
        System.out.println("Título: " + titulo + " | Artista: " + artista + "| Ano: " + anoLancamento);
    }

    void avalieMusica(double notas){
        avaliacao += notas;
        numAvaliacoes ++;
        System.out.println(avaliacao);
    }

    double media(){
        double media = avaliacao / numAvaliacoes;
        return media;
    }
}
