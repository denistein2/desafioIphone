package main.java.main;

import main.java.main.classes.MusicPlayer;
import main.java.main.classes.AparelhoTelefonico;
import main.java.main.classes.NavegadorNaInternet;

public class Main {
    public static void main(String[] args) {
            MusicPlayer player = new MusicPlayer();
            AparelhoTelefonico aparelho = new AparelhoTelefonico();
            NavegadorNaInternet navegador = new NavegadorNaInternet();
            
            aparelho.ligar("www.google.com.br");
            aparelho.atender();
            aparelho.iniciarCorreioVoz();
            
            navegador.navegar("www.google.com.br");
            navegador.exibirPagina("www.google.com.br");
            navegador.atualizarPagina();

            player.tocar();
            player.pausar();
            player.selecionarMusica("Coldplay - Paradise");
            
    
    }
}
