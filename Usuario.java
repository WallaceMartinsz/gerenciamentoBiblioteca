import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa{
    private int id;
    private String dataCadastro;
    private List<Livros> livrosPegados = new ArrayList<>();

    public Usuario(){

    }
    public Usuario(String nome, String logradouro, String bairro, String estado, String cep, String cpf, String rg, String telefone, String email, String dataNascimento, int id, String dataCadastro) {
        super(nome, logradouro, bairro, estado, cep, cpf, rg, telefone, email, dataNascimento);
        this.id = id;
        this.dataCadastro = dataCadastro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public List<Livros> getLivrosPegados() {
        return livrosPegados;
    }

    public void setLivrosPegados(List<Livros> livrosPegados) {
        this.livrosPegados = livrosPegados;
    }


    @Override
    public String toString() {
        return "ID = [" + getId() + "]\n"
                + super.toString()
                + "Data de cadastro = " +getDataCadastro()
                + "\n"
                + "--------------------------------\n";
    }
}
