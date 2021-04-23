import java.util.Scanner;
class TP01ex01 
{
    //Gabriel Kenji Utiyama CB3012069
    //Gustavo Barbosa da Silva CB3010627
    
    //1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
   
    public static void main(String[] args) 
    {
        double base, altura, areaRetangulo;
        
        base = 0;
        altura = 0;
        Scanner ler = new Scanner(System.in);  
 
        System.out.println("Informe o valor da base: \n");
        base = Double.parseDouble(ler.nextLine());
        System.out.println("Informe o valor da altura: \n");
        altura = Double.parseDouble(ler.nextLine());
        areaRetangulo = base * altura;
        System.out.println("O valor da area do Retangulo é: " + areaRetangulo);
    }
}

