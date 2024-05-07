// Classe C
public class C extends B {
    // Construtor padrão
    public C() {
        super(); // Chamada implícita ao construtor padrão da classe pai (B)
        System.out.println("Construtor padrão da classe C");
    }

    // Construtor com argumento
    public C(int arg) {
        super(arg); // Chamada explícita ao construtor com argumento da classe pai (B)
        System.out.println("Construtor com argumento da classe C");
    }

    // Sobrescrevendo o método a1 da classe pai (B)
    @Override
    public void a1() {
        super.a1(); // Chamada ao método a1 da classe pai (B)
        System.out.println("Método a1 sobrescrito da classe C");
    }

    // Método b2
    public void b2() {
        System.out.println("Método b2 da classe C");
    }
}