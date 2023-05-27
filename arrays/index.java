package arrays;

public class index {
    public static void main(String[] args) {
        int[] numeros = new int [7];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        numeros[6] = 7;

        for(int i =0; i < numeros.length; i++){
          System.out.println(numeros[i]);  
        }

        int[] listaNumeros = {9,10,12,25,2};
        int maior = listaNumeros[0], menor = listaNumeros[0];
        float media = (float)0;

        for (int i=0; i < listaNumeros.length; i++){
            if(listaNumeros[i] > maior) {
                maior = listaNumeros[i];
            }
            if(listaNumeros[i] < menor) {
                menor = listaNumeros[i];
            }
            media += listaNumeros[i];
        }
        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("média: " + media/listaNumeros.length);
    }
}
