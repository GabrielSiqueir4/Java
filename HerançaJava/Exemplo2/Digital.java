public class Digital extends Livro {

    private String marcadagua;


    public Digital(){

    }
    public Digital(String titulo, String autor, int isbn, String marcadagua) { //construtor
        super(titulo, autor, isbn);
        this.marcadagua = marcadagua;
    }

    public String getMarcadagua() {
        return marcadagua;
    }

    public void setMarcadagua(String marcadagua) {
        this.marcadagua = marcadagua;
    }

    public boolean ValidaLivro() {

        if (this.marcadagua == null) {
            return false;
        } else {
            return true;
        }
    }
}
