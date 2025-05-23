package Application;

import Functions.AparelhoEletronico;
import Functions.MyIphone;

public class Iphone {
    public static void main(String[] args) {
        System.out.println("Bem Vindo ao Futuro");
        System.out.println("O que deseja fazer?");
        System.out.println("-----------------------");

        MyIphone iphone = new MyIphone();

        //Reprodutor Musical
        iphone.selecionarMusica("SD9 - On the Radar Freestyle");
        iphone.play();
        iphone.pausar();

        //Aparelho Eletrônico
        iphone.ligar("1321516352");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        //Navegador
        iphone.exibirPagina("https://www.apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
