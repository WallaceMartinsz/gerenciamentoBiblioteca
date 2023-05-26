public class Livros {
    private String titulo;
    private String tombo;
    private String editora;
    private String categoria;
    private String autor;
    private int ano;
    private String dataCadastro;
    private boolean situacaoParaEmprestimo;

    public Livros() {
    }

    public Livros(String titulo, String tombo, String editora, String categoria, String autor, int ano, String dataCadastro) {
        this.titulo = titulo;
        this.tombo = tombo;
        this.editora = editora;
        this.categoria = categoria;
        this.autor = autor;
        this.ano = ano;
        this.dataCadastro = dataCadastro;
        this.situacaoParaEmprestimo = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTombo() {
        return tombo;
    }

    public void setTombo(String tombo) {
        this.tombo = tombo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public boolean isSituacaoParaEmprestimo() {
        return situacaoParaEmprestimo;
    }

    public void setSituacaoParaEmprestimo(boolean situacaoParaEmprestimo) {
        this.situacaoParaEmprestimo = situacaoParaEmprestimo;
    }

    @Override
    public String toString() {
        return  "Título = " +getTitulo()+ "\nTombo = " +getTombo()
                + "\nAutor = " +getAutor()
                + "\nEditora = " +getEditora()
                + "\nCategoria = " +getCategoria()
                + "\nAno = " +getAno()
                + "\nData de cadastro = " +getDataCadastro()
                + "\nSituação para empréstimo = " + isSituacaoParaEmprestimo() + "\n";
    }
}
