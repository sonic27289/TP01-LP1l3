import java.util.Scanner;

public class TP01ex08 {
//Gabriel Kenji Utiyama CB3012069
//Gustavo Barbosa da Silva CB3010627

/* 8. Sabendo que uma milha mar�tima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quil�metro possui mil metros, fazer um programa para
converter milhas mar�timas em quil�metros. */
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double Milha, M, KM;
        
        System.out.print("Digite o valor de milhas maritimas: "  );
        Milha = Double.parseDouble(ler.nextLine());
        

        M = 1852 * Milha;
        KM = M /1000;

        
        System.out.printf(M + " milhas maritimas sao iguais a "+  KM + "KM");
        
    }
    
}
