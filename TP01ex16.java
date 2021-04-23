import java.util.Scanner;

public class TP01ex16 {
//Gabriel Kenji Utiyama CB3012069
//Gustavo Barbosa da Silva CB3010627
    
/*16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos.*/
    
    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);
        double grau;
        
        System.out.print("Digite o valor do angulo: "  );
        
        grau = Double.parseDouble(ler.nextLine());
        
        double a = Math.toRadians(grau);

        System.out.print("\nA Seno de " + grau + " e " +  Math.sin(a) );
        System.out.print("\nA Coseno de " + grau + " e " +  Math.cos(a));
        System.out.print("\nA Tangente de " + grau + " e " + Math.tan(a));
        System.out.print("\nA Secante de " + grau + " e " + (1/Math.cos(a)) + "\n");
    }
    
}