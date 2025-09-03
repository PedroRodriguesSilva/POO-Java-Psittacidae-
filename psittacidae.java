public class psittacidae {
    // Atributos
    String especie;
    String corPrincipal;
    double envergadura;
    double peso;

    // Construtor
    public psittacidae(String especie, String corPrincipal, double envergadura, double peso) {
        this.especie = especie;
        this.corPrincipal = corPrincipal;
        this.envergadura = envergadura;
        this.peso = peso;
    }

    // Métodos
    public void voar() {
        System.out.println(especie + " está voando!");
    }

    public void emitirSom() {
        System.out.println(especie + " está emitindo sons característicos!");
    }

    public void comer(String alimento) {
        System.out.println(especie + " está comendo " + alimento + ".");
    }

    public void mostrarInfo() {
        System.out.println("Espécie: " + especie);
        System.out.println("Cor Principal: " + corPrincipal);
        System.out.println("Envergadura: " + envergadura + " cm");
        System.out.println("Peso: " + peso + " kg");
    }
}