import java.util.Scanner;
class TP01ex03
{
    //Gabriel Kenji Utiyama CB3012069
    //Gustavo Barbosa da Silva CB3010627
    
    //3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.
   
    public static void main(String[] args) 
    {
        double lado, diagonal, areaQuadrado;
        
        lado = 0;
        diagonal = 0;
        Scanner ler = new Scanner(System.in);  
 
        System.out.println("Informe o valor do lado: \n");
        lado = Double.parseDouble(ler.nextLine());
        System.out.println("Informe o valor da diagonal: \n");
        diagonal = Double.parseDouble(ler.nextLine());
        areaQuadrado = lado * 4 * diagonal * 2 / 2;
        System.out.println("O valor da area do Quadrado é: " + areaQuadrado);
    }
}
