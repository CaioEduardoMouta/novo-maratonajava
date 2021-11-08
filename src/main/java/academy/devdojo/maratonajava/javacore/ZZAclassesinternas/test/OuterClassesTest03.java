package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;


public class OuterClassesTest03 {
    private String nome = "Caio";
    static class  Nested {
        private String lastName = "Mouta";
        void print(){
            System.out.println(new OuterClassesTest03().nome +" "+lastName);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest03.Nested nested = new OuterClassesTest03.Nested();
        nested.print();
    }

}
