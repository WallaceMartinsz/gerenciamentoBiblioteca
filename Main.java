import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Date dataCadastrada = new Date();
    static SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
    static List<Usuario> usuarios = new ArrayList<>();
    static List<Livros> livros = new ArrayList<>();
    static List<Emprestimo> listaEmprestimo = new ArrayList<>();

    public static void main(String[] args) {
        int escolha;
        System.out.println("----------------------------------");
        System.out.println("Bem vindo a " + BibliotecaNome.nome);
        System.out.println("----------------------------------");
        do {
            System.out.println("Digite a opção desejada!");
            System.out.println("1 - Usuário");
            System.out.println("2 - Livros");
            System.out.println("3 - Empréstimo");
            System.out.println("0 - SAIR");

            escolha = input.nextInt();

            switch (escolha) {
                case 0 -> System.out.println("Até mais!\nVolte sempre!");
                case 1 -> {
                    System.out.println("----------------------------");
                    System.out.println("Opção - " + escolha);
                    System.out.println("----------------------------");
                    menuUsuario();
                }
                case 2 -> {
                    System.out.println("----------------------------");
                    System.out.println("Opção - " + escolha);
                    System.out.println("----------------------------");
                    menuLivro();
                }
                case 3 -> {
                    System.out.println("----------------------------");
                    System.out.println("Opção - " + escolha);
                    System.out.println("----------------------------");
                    menuEmprestimo();
                }
                default -> System.out.println("Opção inválida!\nDigite novamente uma opção válida");
            }

        } while (escolha != 0);

        input.close();
    }

    public static void menuUsuario() {
        int escolha;
        do {
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuário");
            System.out.println("3 - Buscar usuário por nome");
            System.out.println("4 - Remover usuário");
            System.out.println("5 - Atualizar dados do usuário");

            System.out.println("0 - VOLTAR");

            escolha = input.nextInt();

            switch (escolha) {
                case 0:
                    break;
                case 1:
                    Usuario usuario = new Usuario();
                    cadastrarUsuario(usuario);
                    break;
                case 2:
                    imprimirUsuarios();
                    break;
                case 3:
                    if (!usuarios.isEmpty()) {
                        System.out.println("------------------------------------------------");
                        System.out.println("Digite o nome do usuário para pesquisa:");
                        System.out.println("------------------------------------------------");
                        input.nextLine();
                        String nomePesquisar = input.nextLine().toLowerCase();
                        buscarUsuarioNome(nomePesquisar);
                    } else {
                        System.out.println("Nenhum usuário cadastrado");
                    }
                    break;
                case 4:
                    if (usuarios.isEmpty()) {
                        System.out.println("Nenhum usuário cadastrado");
                    } else {
                        imprimirUsuarios();
                        System.out.println("----------------------------");
                        System.out.println("Digite o id do usuário para remover:");
                        System.out.println("----------------------------");
                        int idRemover = input.nextInt();
                        removerUsuario(idRemover);
                    }
                    break;
                case 5:
                    if (!usuarios.isEmpty()) {
                        imprimirUsuarios();
                        System.out.println("Digite o id do usuário para atualizar:");
                        int idAtualizar = input.nextInt();
                        atualizarDados(idAtualizar);
                    }else {
                        System.out.println("Nenhum usuário cadastrado");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!\nDigite novamente uma opção válida");
                    break;
            }
        } while (escolha != 0);

    }

    public static void cadastrarUsuario(Usuario usuario) {
        System.out.println("----------------------------");
        System.out.println("Cadastro de usuário");
        System.out.println("----------------------------");

        System.out.println("Digite seu nome");
        input.nextLine();
        String nome = input.nextLine();
        usuario.setNome(nome);
        System.out.println("Digite o logradouro");
        String logradouro = input.nextLine();
        usuario.setLogradouro(logradouro);
        System.out.println("Digite o bairro");
        String bairro = input.nextLine();
        usuario.setBairro(bairro);
        System.out.println("Digite o estado");
        String estado = input.nextLine();
        usuario.setEstado(estado);
        System.out.println("Digite o cep");
        String cep = input.nextLine();
        usuario.setCep(cep);
        System.out.println("Digite o cpf");
        String cpf = input.nextLine();
        usuario.setCpf(cpf);
        System.out.println("Digite o rg");
        String rg = input.nextLine();
        usuario.setRg(rg);
        System.out.println("Digite o telefone");
        String telefone = input.nextLine();
        usuario.setTelefone(telefone);
        System.out.println("Digite o email");
        String email = input.nextLine();
        usuario.setEmail(email);
        System.out.println("Digite a data de nascimento");
        String dataNascimento = input.nextLine();
        usuario.setDataNascimento(dataNascimento);
        usuario.setId((usuarios.size() + 1));
        usuario.setDataCadastro(dataFormatada.format(dataCadastrada));
        usuarios.add(usuario);
        System.out.println("Usuário adicionado com sucesso!");
    }

    public static void buscarUsuarioNome(String nomePesquisar) {
        for (Usuario u : usuarios) {
            if (nomePesquisar.equals(u.getNome().toLowerCase())) {
                System.out.println("Usuário achado!");
                System.out.println(u);
                break;
            }
        }
    }

    public static void imprimirUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado");
        } else {
            System.out.println("----------------------------");
            System.out.println("Listando usuários!");
            System.out.println("----------------------------");
            for (Usuario u : usuarios) {
                System.out.println(u);
            }
        }
    }

    public static void removerUsuario(int idRemover) {
        Iterator<Usuario> iterator = usuarios.iterator();
        while (iterator.hasNext()) {
            Usuario u = iterator.next();
            if (idRemover == u.getId()) {
                System.out.println("Usuário achado!");
                iterator.remove();
                System.out.println("Usuário removido!");
            }
        }
    }

    public static void atualizarDados(int idAtualizar) {
        for (Usuario u : usuarios) {
            if (idAtualizar == u.getId()) {
                System.out.println("Escolha qual conjunto de dado para atualizar");
                System.out.println("1 - Endereço ");
                System.out.println("2 - Dados pessoais");
                int opcao = input.nextInt();
                if (opcao == 1) {
                    System.out.println("Digite o logradouro:");
                    input.nextLine();
                    String logradouro = input.nextLine();
                    u.setLogradouro(logradouro);
                    System.out.println("Digite o bairro:");
                    String bairro = input.nextLine();
                    u.setBairro(bairro);
                    System.out.println("Digite o estado:");
                    String estado = input.nextLine();
                    u.setEstado(estado);
                    System.out.println("Digite o cep:");
                    String cep = input.nextLine();
                    u.setCep(cep);
                    break;
                } else if (opcao == 2) {
                    System.out.println("Digite seu nome:");
                    input.nextLine();
                    String nome = input.nextLine();
                    u.setNome(nome);
                    System.out.println("Digite o rg:");
                    String rg = input.nextLine();
                    u.setRg(rg);
                    System.out.println("Digite o telefone:");
                    String telefone = input.nextLine();
                    u.setTelefone(telefone);
                    System.out.println("Digite o email:");
                    String email = input.nextLine();
                    u.setEmail(email);
                    System.out.println("Digite a data de nascimento:");
                    String dataNascimento = input.nextLine();
                    u.setDataNascimento(dataNascimento);
                    break;
                } else {
                    System.out.println("Opção inválida!");
                }
            }
        }
    }

    private static void menuLivro() {
        int escolha;
        do {
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Buscar livro por título");
            System.out.println("4 - Remover livro");
            System.out.println("0 - VOLTAR");

            escolha = input.nextInt();

            switch (escolha) {
                case 0:
                    break;
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    if (!livros.isEmpty()) {
                        System.out.println("------------------------------------------------");
                        System.out.println("Digite o título do livro para busca:");
                        System.out.println("------------------------------------------------");
                        input.nextLine();
                        String buscarLivroPorTitulo = input.nextLine().toLowerCase();
                        buscarLivroPorTitulo(buscarLivroPorTitulo);
                    } else {
                        System.out.println("Nenhum livro cadastrado");
                    }
                    break;
                case 4:
                    if (livros.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado");
                    } else {
                        listarLivros();
                        System.out.println("----------------------------");
                        System.out.println("Digite o tombo do livro para remover:");
                        System.out.println("----------------------------");
                        input.nextLine();
                        String tomboPesquisa = input.nextLine().toLowerCase();
                        removerLivroPorTombo(tomboPesquisa);
                    }
                    break;
                default:
                    System.out.println("Opção inválida!\nDigite novamente uma opção válida");
                    break;
            }
        } while (escolha != 0);
    }


    public static void cadastrarLivro(){
        System.out.println("----------------------------");
        System.out.println("Cadastro de livros");
        System.out.println("----------------------------");

        System.out.println("Digite o título");
        input.nextLine();
        String titulo = input.nextLine();
        System.out.println("Digite o tombo");
        String tombo = input.nextLine();
        System.out.println("Digite o autor");
        String autor = input.nextLine();
        System.out.println("Digite a editora");
        String editora = input.nextLine();
        System.out.println("Digite a categoria");
        String categoria = input.nextLine();
        System.out.println("Digite o ano");
        int ano = input.nextInt();
        livros.add(new Livros(titulo, tombo, editora,categoria,autor,ano, dataFormatada.format(dataCadastrada)));
        System.out.println("Livro adicionado com sucesso!");

    }

    public static void listarLivros(){
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado");
        } else {
            System.out.println("----------------------------");
            System.out.println("Listando livros!");
            System.out.println("----------------------------");
            for (Livros l : livros) {
                System.out.println(l);
            }
        }
    }

    public static void buscarLivroPorTitulo(String tituloPesquisa) {
        for (Livros l : livros) {
            if (tituloPesquisa.equals(l.getTitulo().toLowerCase())) {
                System.out.println("Livro achado!");
                System.out.println(l);
                break;
            }
        }
    }

    public static void removerLivroPorTombo(String tomboPesquisa){
        for (Livros l : livros) {
            if (tomboPesquisa.equals(l.getTombo().toLowerCase())) {
                System.out.println("Livro achado!");
                System.out.println(l);
                livros.remove(l);
                System.out.println("Livro removido!");
                break;
            }
        }
    }

    public static void menuEmprestimo() {
        int escolha;
        do {
            System.out.println("1 - Fazer empréstimo");
            System.out.println("2 - Devolver livro");
            System.out.println("3 - Listar livros disponíveis");
            System.out.println("4 - Listar Usuários com livros emprestados");
            System.out.println("5 - Renovar empréstimo");

            System.out.println("0 - VOLTAR");

            escolha = input.nextInt();

            switch (escolha) {
                case 0:
                    break;
                case 1:
                    if(usuarios.isEmpty() || livros.isEmpty()){
                        System.out.println("\nNão pode fazer nenhum empréstimo, na aplicação não existe usuários ou livros cadastrados.\n");
                    }else{
                        listarLivroEmSituacaoEmprestimo();
                        System.out.println("Qual livro você quer emprestar?(DIGITE O TITULO)");
                        input.nextLine();
                        String livroEmprestimo = input.nextLine().toLowerCase();

                        imprimirUsuarios();
                        System.out.println("Para quem você quer emprestar?(DIGITE O NOME)");
                        String nomeEmprestar = input.nextLine().toLowerCase();

                        for (Livros l: livros) {
                            for (Usuario u: usuarios) {
                                if (livroEmprestimo.equals(l.getTitulo().toLowerCase()) &&
                                        nomeEmprestar.equals(u.getNome().toLowerCase())){
                                    realizarEmprestimo(u, l);
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    if(usuarios.isEmpty() || livros.isEmpty()){
                        System.out.println("Não pode fazer nenhuma devolução, no app não existe usuários ou livros cadastrados.\n");
                    }else{
                        percorrerListaEmprestimo();
                        System.out.println("De qual usuário você quer devolver o livro:");
                        input.nextLine();
                        String nomeDevolver = input.nextLine().toLowerCase();
                        for (Livros l: livros) {
                            for (Usuario u: usuarios) {
                                if (nomeDevolver.equals(u.getNome().toLowerCase()) && !u.getLivrosPegados().isEmpty()){
                                    realizarDevolucao(u, l);
                                }
                            }
                        }
                    }
                    break;
                case 3:
                   if (!livros.isEmpty()){
                        for (Livros l: livros) {
                            if (l.isSituacaoParaEmprestimo()){
                                System.out.println(l);
                            }
                        }
                    }else {
                        System.out.println("No momento, não tem nenhum livro disponível!");
                    }
                    break;
                case 4:
                    if(!listaEmprestimo.isEmpty()){
                        for (Usuario u: usuarios) {
                            if (!u.getLivrosPegados().isEmpty()){
                                percorrerListaEmprestimo();
                            }
                        }
                    }else{
                        System.out.println("No momento, não temos nenhum empréstimo!");
                    }
                    break;
                case 5:
                    if(listaEmprestimo.isEmpty()){
                        System.out.println("Não pode fazer nenhuma renovação, não tem nenhum vinculo entre usuário e livro ainda.\n");
                    }else{
                        System.out.println("Digite o número da reserva para renovar o empréstimo:");
                        percorrerListaEmprestimo();
                        input.nextLine();
                        int numReserva = input.nextInt();
                        for (Emprestimo e: listaEmprestimo){
                            if (numReserva == e.getNumeroReserva()){
                                renovarEmprestimo(e.getUsuario(), e.getLivro(), e);
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida!\nDigite novamente uma opção válida");
                    break;
            }
        } while (escolha != 0);

    }

    public static void realizarEmprestimo(Usuario usuario, Livros livro){
        System.out.println("----------------------------");
        System.out.println("Realizando empréstimo de livros");
        System.out.println("----------------------------");
        System.out.println("Digite a data para devolução:");
        String dataDevolucao = input.nextLine();

        if (livro.isSituacaoParaEmprestimo()) {
            livro.setSituacaoParaEmprestimo(false);
            usuario.getLivrosPegados().add(livro);
            Emprestimo emprestimo = new Emprestimo(livro, dataFormatada.format(dataCadastrada), dataDevolucao, usuario);
            listaEmprestimo.add(emprestimo);
            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            System.out.println("Livro indisponível para empréstimo.");
        }
    }

    public static void realizarDevolucao(Usuario usuario, Livros livro) {
        if (usuario.getLivrosPegados().contains(livro)) {
            livro.setSituacaoParaEmprestimo(true);
            usuario.getLivrosPegados().remove(livro);
            listaEmprestimo.removeIf(e -> e.getLivro() == livro);
            System.out.println("Devolução realizada com sucesso!");
        } else {
            System.out.println("Este livro não foi emprestado por este usuário.");
        }
    }

    public static void renovarEmprestimo(Usuario usuario, Livros livro, Emprestimo emprestimo) {
        if (usuario.getLivrosPegados().contains(livro)) {
            System.out.println("Digite a nova data para devolução:");
            input.nextLine();
            String novaData = input.nextLine().toLowerCase();
            emprestimo.setDataDevolucao(novaData);
            System.out.println("Renovação realizada com sucesso!");
        } else {
            System.out.println("Este livro não foi emprestado por este usuário.");
        }
    }

    public static void percorrerListaEmprestimo(){
        if(listaEmprestimo.isEmpty()){
            System.out.println("Lista vazia. Nenhum livro emprestado!");
        }else{
            for (Emprestimo e: listaEmprestimo) {
                System.out.println(e);
            }
        }
    }

    public static void listarLivroEmSituacaoEmprestimo(){
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado");
        } else {
            System.out.println("----------------------------");
            System.out.println("Listando livros!");
            System.out.println("----------------------------");
            for (Livros l : livros) {
                if (l.isSituacaoParaEmprestimo()){
                    System.out.println(l);
                }
            }
        }
    }

}
