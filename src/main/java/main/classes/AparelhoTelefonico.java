package main.java.main.classes;

import main.java.main.interfaces.IAparelhoTelefonico;

    public class AparelhoTelefonico implements IAparelhoTelefonico{
        public void ligar(String numero) {
            System.out.println("Ligando" + numero);

        }

        public void atender(){
            System.out.println("Atendendo");
        }
        public void iniciarCorreioVoz(){
            System.out.println("Iniciando correio de voz");
        }




}