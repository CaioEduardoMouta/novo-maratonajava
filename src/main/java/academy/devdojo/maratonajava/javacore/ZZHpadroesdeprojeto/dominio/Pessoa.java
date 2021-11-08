package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public class Pessoa {
    private String firstName;
    private String lastName;
    private String username;
    private String email;

    private Pessoa(String firstName, String lastName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static final class PessoaBuilder {
        private String firstName;
        private String lastName;
        private String username;
        private String email;

        public PessoaBuilder() {
        }

        public static PessoaBuilder buildr() {
            return new PessoaBuilder();
        }

        public PessoaBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PessoaBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PessoaBuilder username(String username) {
            this.username = username;
            return this;
        }

        public PessoaBuilder email(String email) {
            this.email = email;
            return this;
        }


        public Pessoa build() {
            return new Pessoa(firstName, lastName, username, email);
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
