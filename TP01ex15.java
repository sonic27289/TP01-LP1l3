import java.util.Scanner;
class TP01ex15
{
    //Gabriel Kenji Utiyama CB3012069
    //Gustavo Barbosa da Silva CB3010627
    
    /*15. Entrar via teclado com o valor da cota��o do d�lar e uma certa quantidade de
d�lares. Calcular e exibir o valor correspondente em Reais (R$).*/
   
    public static void main(String[] args) 
    {
        double real, dolar, cotacao;
        
        dolar = 0;
        cotacao = 0;
        Scanner ler = new Scanner(System.in);  
 
        System.out.println("Informe o valor do D�lar: \n");
        dolar = Double.parseDouble(ler.nextLine());
        System.out.println("Informe o valor da Cota��o do D�lar: \n");
        cotacao = Double.parseDouble(ler.nextLine());
        real = (dolar * cotacao);
        System.out.println("O valor em Reais �: R$ " + real);
    }
}
