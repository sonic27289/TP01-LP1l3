import java.util.Scanner;
class TP01ex11
{
    //Gabriel Kenji Utiyama CB3012069
    //Gustavo Barbosa da Silva CB3010627
    
    //11. A partir do di�metro de um c�rculo que ser� digitado, calcular e exibir sua �rea.
   
    public static void main(String[] args) 
    {
        double raio, diametro, areaCirculo;
        
        raio = 0;
        diametro = 0;
        Scanner ler = new Scanner(System.in);  
 
        System.out.println("Informe o valor do raio: \n");
        raio = Double.parseDouble(ler.nextLine());
        System.out.println("Informe o valor do diametro: \n");
        diametro = Double.parseDouble(ler.nextLine());
        areaCirculo = 3.14 * raio * raio;
        System.out.println("O �rea do circulo �: " + areaCirculo);
    }
}
