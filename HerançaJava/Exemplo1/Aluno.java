public class Aluno extends SerHumano { //herdou de ser humano que é a classe pricipal
    private int registroAcademico;
    private String curso;
    private String turno;
    private int periodo;

    public Aluno(int registroAcademico, String curso, String turno, int periodo) {
        this.registroAcademico = registroAcademico;
        this.curso = curso;
        this.turno = turno;
        this.periodo = periodo;
    }

    public int getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(int registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }


    public Aluno(int registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public boolean ValidaCodigo(){
        
        if(this.registroAcademico == 0){
            return false;
        }else{
            return true;
        }
    }
}
