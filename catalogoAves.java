public class catalogoAves {
    public static void main(String[] args) {

        psittacidae arara = new psittacidae(
                "Ara ararauna",
                "Azul e Amarelo",
                120.0,
                1.2
        );


        psittacidae papagaio = new psittacidae(
                "Amazona aestiva",
                "Verde",
                40.0,
                0.4
        );


        psittacidae cacatua = new psittacidae(
                "Cacatua galerita",
                "Branco com Crista Amarela",
                100.0,
                0.9
        );


        arara.mostrarInfo();
        arara.voar();
        arara.comer("frutas");

        System.out.println("-----------");

        papagaio.mostrarInfo();
        papagaio.emitirSom();
        papagaio.comer("sementes");

        System.out.println("-----------");

        cacatua.mostrarInfo();
        cacatua.voar();
        cacatua.emitirSom();
    }
}
