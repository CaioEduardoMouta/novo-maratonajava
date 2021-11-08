package academy.devdojo.maratonajava.javacore.Hheranca.Dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    static{
        System.out.println("Dentro do bloco estático de pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicialização de pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de pessoa");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor pessoa ");
        this.nome = nome;
    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua()+ " " +this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
