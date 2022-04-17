package Exercicio3;
public class Regras {
    private boolean numero;
    private boolean limite;
    private boolean status;
    private boolean deposito;
    
    // Métodos acessores e modificadores
    public void setNumero(boolean alteraNumero) {
        if (isNumero() != alteraNumero)
            this.numero = alteraNumero;
    }

    public void setLimite(boolean alteraLimite) {
        if (isLimite() != alteraLimite)
            this.limite = alteraLimite;
    }

    public void setStatus(boolean alteraStatus) {
        if (isStatus() != alteraStatus)
            this.status = alteraStatus;
    }

    public void setChequeespecial(boolean alteraChequeespecia) {
        if (isChequeespecial() != alteraChequeespecia) {
        }
    }

    public void setDeposito(boolean alteraDeposito) {
        if (isDeposito() != alteraDeposito)
            this.deposito = alteraDeposito;
    }

    public boolean isLimite() {
        return limite;
    }

    public boolean isStatus() {
        return status;
    }

    public boolean isChequeespecial() {
        return isChequeespecial();
    }

    public boolean isDeposito() {
        return deposito;
    }

    public boolean isNumero() {
        return numero;
    }
}
