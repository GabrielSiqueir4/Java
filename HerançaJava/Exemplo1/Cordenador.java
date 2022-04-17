public class Cordenador extends SerHumano{
    private String codigoCordenador;
    private String cursoCordenador;

    public Cordenador(){

    }

    public Cordenador(String codigoCordenador, String cursoCordenador) {
        this.codigoCordenador = codigoCordenador;
        this.cursoCordenador = cursoCordenador;
    }

    public String getCodigoCordenador() {
        return codigoCordenador;
    }

    public void setCodigoCordenador(String codigoCordenador) {
        this.codigoCordenador = codigoCordenador;
    }

    public String getCursoCordenador() {
        return cursoCordenador;
    }

    public void setCursoCordenador(String cursoCordenador) {
        this.cursoCordenador = cursoCordenador;
    }

    public boolean ValidaCodigo(){
        
        if(this.codigoCordenador == null){
            return false;
        }else{
            return true;
        }
    }

}
