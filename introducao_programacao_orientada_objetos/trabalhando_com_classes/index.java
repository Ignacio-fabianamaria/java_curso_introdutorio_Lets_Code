package introducao_programacao_orientada_objetos.trabalhando_com_classes;

import introducao_programacao_orientada_objetos.trabalhando_com_classes.animais.Cachorro;

public class index {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Bob";
        cachorro1.raça = "Labrador";
        cachorro1.cor = "caramelo";
        cachorro1.altura = 50;
        cachorro1.peso = 4.5;

        System.out.println(cachorro1.getInfo());
    }
}
