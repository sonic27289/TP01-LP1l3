import java.util.Scanner;
class TP01ex09 
{
    //Gabriel Kenji Utiyama CB3012069
    //Gustavo Barbosa da Silva CB3010627
    
    /*9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos valores da resistência e corrente elétrica que serão digitados. 
Utilize a lei de Ohm.*/
   
    public static void main(String[] args) 
    {
        double corrente, resistencia, tensao;
        
        corrente = 0;
        resistencia = 0;
        Scanner ler = new Scanner(System.in);  
 
        System.out.println("Informe o valor da corrente: \n");
        corrente = Double.parseDouble(ler.nextLine());
        System.out.println("Informe o valor da resistencia: \n");
        resistencia = Double.parseDouble(ler.nextLine());
        tensao = corrente * resistencia;
        System.out.println("A tensão do equipamento é: " + tensao);
    }
}
