public class Impresso extends Livro {
    private double taixadeimpressao;

    public Impresso(){
        
    }

    public Impresso(String titulo, String autor, int isbn, double taixadeimpressao) {
        super(titulo, autor, isbn);
        this.taixadeimpressao = taixadeimpressao;
    }

    public double isTaixadeimpressao() {
        return taixadeimpressao;
    }

    public void setTaixadeimpressao(double taixadeimpressao) {
        this.taixadeimpressao = taixadeimpressao;
    }

    public boolean ValidaLivro() {

        if (this.taixadeimpressao > 0) {
            return true;
        } else {
            return false;
        }
    }

}
