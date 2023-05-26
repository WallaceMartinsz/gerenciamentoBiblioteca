public abstract class Pessoa {
    private String nome;
    private String logradouro;
    private String bairro;
    private String estado;
    private String cep;
    private String cpf;
    private String rg;
    private String telefone;
    private String email;
    private String dataNascimento;

    public Pessoa(String nome, String logradouro, String bairro, String estado, String cep, String cpf, String rg, String telefone, String email, String dataNascimento) {
        this.nome = nome;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.estado = estado;
        this.cep = cep;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Nome = " +getNome()+ "\nCPF = " +getCpf()
                + "\nRG = " +getRg()
                + "\nTelefone = " +getTelefone()
                + "\nEmail = " +getEmail()
                + "\nData de nascimento = " +getDataNascimento()
                + "\nLogradouro = " +getLogradouro()
                + "\nBairro = " +getBairro()
                + "\nEstado = " +getEstado()
                + "\nCep = " +getCep() + "\n";
    }
}
