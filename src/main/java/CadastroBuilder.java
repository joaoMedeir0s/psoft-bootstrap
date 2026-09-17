public class CadastroBuilder {
    private final String NOME;
    private final Cpf CPF;
    private int idade;
    private Telefone telefone;
    private String profissao;
    private Papel papel;

    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;
    private String complemento;

    public CadastroBuilder (String nome, String cpf) {
        this.NOME = nome;
        this.CPF = new Cpf(cpf);
    }

    public CadastroBuilder idade(int idade) {
        this.idade = idade;
        return this;
    }

    public CadastroBuilder telefone(String telefone) {
        this.telefone = new Telefone(telefone);
        return this;
    }

    public CadastroBuilder profissao(String profissao) {
        this.profissao = profissao;
        return this;
    }

    public CadastroBuilder papel(String papel) {
        this.papel = Papel.valueOf(papel);
        return this;
    }

    public CadastroBuilder estado(String estado) {
        this.estado = estado;
        return this;
    }

    public CadastroBuilder cidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public CadastroBuilder bairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public CadastroBuilder rua(String rua) {
        this.rua = rua;
        return this;
    }

    public CadastroBuilder numero(int numero) {
        this.numero = numero;
        return this;
    }

    public CadastroBuilder complemento(String complemento) {
        this.complemento = complemento;
        return this;
    }
}
