import java.util.Scanner;

public class ConversorDeMoedas {

    String nomeMoedaOrigem;
    String nomeMoedaDestino;
    double valorDaCotacao;
    double valorDeConversao;

    public void calcularConversaoDeMoedas() {
        valorDeConversao = 1 / valorDaCotacao;
        exibirDados();
    }

    public void exibirDados() {
        String valorConversaoComDoisDecimais = String.format("%.2f", valorDeConversao);
        System.out.println("1 " + nomeMoedaDestino + " Equivalente a " + valorConversaoComDoisDecimais + " " + nomeMoedaOrigem);
    }

    public void obterDadosDoUsuario() {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Qual é a moeda de origem? ");
        nomeMoedaOrigem = leitor.nextLine();

        System.out.println("Qual é a moeda de destino?" );
        nomeMoedaDestino = leitor.nextLine();

        System.out.println( "Quanto custa 1 " + nomeMoedaDestino + " em " + nomeMoedaOrigem + "?");
        valorDaCotacao = leitor.nextDouble();
        calcularConversaoDeMoedas();

    }

}
