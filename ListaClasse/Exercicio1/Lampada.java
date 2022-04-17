package Exercicio1;

public class Lampada {
    private boolean ligada;

    public void setLigada(boolean alteraEstado){
        if(isLigada() != alteraEstado)
            this.ligada = alteraEstado;
    }

    public boolean isLigada(){
        return ligada;
    }
    
}
