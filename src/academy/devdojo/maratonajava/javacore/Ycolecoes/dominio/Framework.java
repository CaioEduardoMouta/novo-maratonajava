package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Framework {
    private Long id;
    private String nome;
    private double dificuldade;

    public Framework(Long id, String nome, double dificuldade) {
        Objects.requireNonNull(id, "Não pode ser null");
        Objects.requireNonNull(nome, "Não pode ser null");
        this.id = id;
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Framework framework = (Framework) o;
        return Double.compare(framework.dificuldade, dificuldade) == 0 && Objects.equals(id, framework.id) && Objects.equals(nome, framework.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, dificuldade);
    }

    @Override
    public String toString() {
        return "Framework{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dificuldade=" + dificuldade +
                '}';
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
}
