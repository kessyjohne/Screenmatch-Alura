package filme.alura.curso.Definições;

public class FiltroRecomendacao {

    // Classe para definir a Recomendação com base nas avaliações.

    public void filtra(Classificacao classificacao){       //metodo da classe.
        if (classificacao.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento");
        } else if (classificacao.getClassificacao() >=2 ){
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Adicione na sua lista de assistir mais tarde");
        }
    }
}
