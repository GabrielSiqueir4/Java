public class Professor extends Funcionario { // extendeu da classe ser humano

    private String formacao;
    private String curso;
    private int nrHoras;

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

}
