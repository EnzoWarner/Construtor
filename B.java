// Classe B
public class B extends A {
    // Construtor padrão
    public B() {
        super(); // Chamada implícita ao construtor padrão da classe pai (A)
        System.out.println("Construtor padrão da classe B");
    }

    // Construtor com argumento
    public B(int arg) {
        super(arg); // Chamada explícita ao construtor com argumento da classe pai (A)
        System.out.println("Construtor com argumento da classe B");
    }

    // Sobrescrevendo o método a1 da classe pai (A)
    @Override
    public void a1() {
        super.a1(); // Chamada ao método a1 da classe pai (A)
        System.out.println("Método a1 sobrescrito da classe B");
    }
}