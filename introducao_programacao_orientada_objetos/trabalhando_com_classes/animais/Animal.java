package introducao_programacao_orientada_objetos.trabalhando_com_classes.animais;

public class Animal {
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


   //Métodos
/* 
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getRaca(){
        return this.raça;
    }

    public void setRaca(String raça){
        this.raça = raça;
    }

    public int getAltura(){
        return this.altura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    } */

    public String getInfo() {
        return "Características do meu Animal: [nome= " + nome + ", cor= " + cor + ", raça= " + raça + ", altura= " + altura + "cm, peso= " + peso + "kg ]";
    }
}
