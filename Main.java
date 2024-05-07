public class Main {
    public static void main(String[] args) {
        // Criando instâncias das classes e testando os construtores e métodos
        A objA = new A(); // Chamando construtor padrão da classe A
        System.out.println();

        B objB = new B(); // Chamando construtor padrão da classe B
        objB.a1(); // Chamando método a1 da classe B
        System.out.println();

        C objC = new C(); // Chamando construtor padrão da classe C
        objC.a1(); // Chamando método a1 da classe C
        objC.b2(); // Chamando método b2 da classe C
        System.out.println();

        A objAArg = new A(10); // Chamando construtor com argumento da classe A
        B objBArg = new B(20); // Chamando construtor com argumento da classe B
        C objCArg = new C(30); // Chamando construtor com argumento da classe C
    }
}
