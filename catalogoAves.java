public class catalogoAves {
    public static void main(String[] args) {
        // Criando um objeto da classe Psittacidae
        psittacidae arara = new psittacidae(
                "Ara ararauna",   // espécie
                "Azul e Amarelo",// cor principal
                120.0,           // envergadura em cm
                1.2              // peso em kg
        );

        // Chamando os métodos
        arara.mostrarInfo();
        arara.voar();
        arara.emitirSom();
        arara.comer("sementes");
    }
}