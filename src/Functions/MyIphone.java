package Functions;

import java.util.Scanner;

public class MyIphone implements AparelhoEletronico, NavegadorNaInternet, ReprodutorMusical {

    Scanner sc = new Scanner(System.in);


    @Override
    public void ligar(String num) {
        System.out.println("Digite o numero: ");
        num = sc.next();
    }

    @Override
    public void atender() {
        System.out.println("Chamada em andamento...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Grave sua mensagem: ");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Digite a página que deseja visitar: ");
        url = sc.next();
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba Adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }

    @Override
    public void play() {
        System.out.println("Musica sendo reproduzida...");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada...");
    }

    @Override
    public void selecionarMusica(String Musica) {
        System.out.println("Escolha a musica: ");
        Musica = sc.next();
    }
}
