package main.java.main.classes;

import main.java.main.interfaces.INavegadorNaInternet;

public class NavegadorNaInternet implements INavegadorNaInternet{
    public void navegar(String url){ 
        System.out.println("Exibir Página" + url);

    }
    
    public void exibirPagina(String url){
        System.out.println("Exibindo pagina" + url);
    }
    public void atualizarPagina(){
        System.out.println("Atualizando pagina");
    }

}