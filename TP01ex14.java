import java.util.Scanner;

public class TP01ex14 {
//Gabriel Kenji Utiyama CB3012069
//Gustavo Barbosa da Silva CB3010627

/*14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
digitados.*/

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i;
        double volC, volEs, volLivre, a,r = 0;
        
        System.out.print("Digite o valor da aresta do cubo: "  );
        a = Double.parseDouble(ler.nextLine());
        
        for(i=0; i <1;)
        {
           System.out.print("Digite o valor do raio da esfera: "  );
           r = Double.parseDouble(ler.nextLine());
           if(r <= a/2 )
           {
               i++;
           }
           else
           {
               System.out.print("ERRO!! O valor do raio deve ser menor ou igual a metade do valor da aresta que e " + a/2 + "\n"  );
           }

        }

        volC = a * a * a;
        volEs = 4 * Math.PI * Math.pow(r,3)/3;
        
        volLivre = volC - volEs;
        System.out.printf("O volume livre e de %.1f %n",  volLivre);
        
    }
    
}
