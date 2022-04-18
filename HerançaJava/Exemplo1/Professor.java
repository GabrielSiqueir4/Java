
public class Professor extends SerHumano { // extendeu da classe ser humano
    private String codigoProfessor;
    private String formacao;
    private String curso;
    private int nrHoras;

    public Professor(){

    }
    public Professor(String formacao, String curso, int nrHoras) {
        this.formacao = formacao;
        this.curso = curso;
        this.nrHoras = nrHoras;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNrHoras() {
        return nrHoras;
    }

    public void setNrHoras(int nrHoras) {
        this.nrHoras = nrHoras;
    }
    public boolean ValidaCodigo(){
       
        if(this.codigoProfessor == null){
            return false;
        }else{
            return true;
        }
    }

}

