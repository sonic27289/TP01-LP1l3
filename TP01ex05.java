import java.util.Scanner;
class TP01ex05
{
    //Gabriel Kenji Utiyama CB3012069
    //Gustavo Barbosa da Silva CB3010627
    
    //5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.
   
    public static void main(String[] args) 
    {
        double raio, diametro, volumeEsfera;
        
        raio = 0;
        diametro = 0;
        Scanner ler = new Scanner(System.in);  
 
        System.out.println("Informe o valor do raio: \n");
        raio = Double.parseDouble(ler.nextLine());
        System.out.println("Informe o valor do diametro: \n");
        diametro = Double.parseDouble(ler.nextLine());
        volumeEsfera = (4 * 3.14) * (raio * raio * raio) / 3;
        System.out.println("O volume da Esfera é: " + volumeEsfera);
    }
}

