package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private  int idade;
    private double[] salarios;
    private double media = 0;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios != null) {
            return;
        }
            for (double salario : salarios) {
                System.out.println(salario + " ");
            }
            imprimeMediaSalario();
        }


    public void imprimeMediaSalario(){
        if(salarios == null){
            return;
        }

        if(salarios != null) {
            for (double salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
        }

        System.out.println("Média Salarial " + media);
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
}
