import java.util.Scanner;
class TP01ex07
{
    //Gabriel Kenji Utiyama CB3012069
    //Gustavo Barbosa da Silva CB3010627
    
    //7. Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.
   
    public static void main(String[] args) 
    {
        double valor1, valor2, media;
        
        valor1 = 0;
        valor2 = 0;
        Scanner ler = new Scanner(System.in);  
 
        System.out.println("Informe o primeiro valor: \n");
        valor1 = Double.parseDouble(ler.nextLine());
        System.out.println("Informe o segundo valor: \n");
        valor2 = Double.parseDouble(ler.nextLine());
        media = valor1 * valor2;
        System.out.println("A média geométrica dos valores é: " + media);
    }
}
