package main.java.main.classes;

import main.java.main.interfaces.IReprodutorMusical;

public class MusicPlayer implements IReprodutorMusical {
    public void tocar() {
        System.out.println("Tocando música.");
    }

    public void pausar() {
        System.out.println("Pausando música.");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: " + musica);
    }


}
