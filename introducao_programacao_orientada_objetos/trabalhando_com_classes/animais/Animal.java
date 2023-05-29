package introducao_programacao_orientada_objetos.trabalhando_com_classes.animais;

public abstract class Animal {
     //Atributos
   protected String nome, cor, raça;
   protected int altura;
   protected double peso;

   //Construtores
   public Animal(){};//construtor genérico
   public Animal(String nome, String cor, String raça, int altura, double peso){
    this.nome = nome;
    this.cor = cor;
    this.raça = raça;
    this.altura = altura;
    this.peso = peso;
   }


   

    public String getInfo() {
        return "Características do meu Animal: [nome= " + nome + ", cor= " + cor + ", raça= " + raça + ", altura= " + altura + "cm, peso= " + peso + "kg ]";
    }
}
