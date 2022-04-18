import java.sql.Date;

public class Funcionario {
    private int codigoFuncionario;
    private String cargo;
    private String horario;
    private Date dataAdmissao;
    private double salario;

    public Funcionario(int codigoFuncionario, String cargo, String horario, Date dataAdmissao, double salario) {
        this.codigoFuncionario = codigoFuncionario;
        this.cargo = cargo;
        this.horario = horario;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
