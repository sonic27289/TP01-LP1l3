import java.util.Scanner;
class TP01ex17
{
    //Gabriel Kenji Utiyama CB3012069
    //Gustavo Barbosa da Silva CB3010627
    
    /*17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.*/
   
    public static void main(String[] args) 
    {
        double x, y, total;
        
        x = 0;
        y = 0;
        Scanner ler = new Scanner(System.in);  
 
        System.out.println("Informe o valor de X: \n");
        x = Double.parseDouble(ler.nextLine());
        System.out.println("Informe o valor de Y: \n");
        y = Double.parseDouble(ler.nextLine());
        total = StrictMath.pow(x, y);
        System.out.println("O valor de X elevado a Y é: " + total);
    }
}
