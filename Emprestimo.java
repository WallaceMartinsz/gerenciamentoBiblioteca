public class Emprestimo {
    private static int id = 100;
    private int numeroReserva;
    private Livros livro;
    private String dataReserva;
    private String dataDevolucao;
    private Usuario usuario;


    public Emprestimo() {
    }

    public Emprestimo(Livros livro, String dataReserva, String dataDevolucao, Usuario usuario) {
        this.numeroReserva = id+=5;
        this.livro = livro;
        this.dataReserva = dataReserva;
        this.dataDevolucao = dataDevolucao;
        this.usuario = usuario;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public Livros getLivro() {
        return livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return  "--------------------------------" +
                "\nNúmero de reserva = " + getNumeroReserva() +
                "\nLivro: " + getLivro() +
                "\nData reserva = " + getDataReserva() +
                "\nData de devolução = " + getDataDevolucao() +
                "\nUsuário = " +getUsuario();
    }
}
