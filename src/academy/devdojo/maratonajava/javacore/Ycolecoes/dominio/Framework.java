package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;



public class Framework implements  Comparable<Framework>{
    private Long id;
    private String nome;
    private double dificuldade;
    private int quantidade;

    public Framework(Long id, String nome, double dificuldade) {
        Objects.requireNonNull(id, "Não pode ser null");
        Objects.requireNonNull(nome, "Não pode ser null");
        this.id = id;
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    public Framework(Long id, String nome, double dificuldade, int quantidade) {
        this(id, nome, dificuldade);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Framework framework = (Framework) o;
        return id.equals(framework.id) && nome.equals(framework.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Framework{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dificuldade=" + dificuldade +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(double dificuldade) {
        this.dificuldade = dificuldade;
    }

    @Override
    public int compareTo(Framework java) {

        return this.nome.compareTo(java.getNome());
        //return Double.compare(dificuldade, java.getDificuldade());
       // return this.id.compareTo(java.getId());
    }
}
