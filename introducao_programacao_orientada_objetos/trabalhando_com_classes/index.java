package introducao_programacao_orientada_objetos.trabalhando_com_classes;

import introducao_programacao_orientada_objetos.trabalhando_com_classes.animais.Cachorro;

public class index {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();

        cachorro1.setNome("Bob"); 
        cachorro1.setRaca("Labrador") ;
        cachorro1.setCor("caramelo");
        cachorro1.setAltura(50);
        cachorro1.setPeso(4.5);

        Cachorro cachorro2 = new Cachorro("Lily", "Marrom", "Labrador", 65, 6.5);

        System.out.println(cachorro1.getInfo());
        System.out.println(cachorro2.getInfo());
    }
}
