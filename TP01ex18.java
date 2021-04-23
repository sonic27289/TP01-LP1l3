import java.util.Scanner;

public class TP01ex18 {
//Gabriel Kenji Utiyama CB3012069
//Gustavo Barbosa da Silva CB3010627

/* 18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.*/
    
    public static void main(String[] args) {
        
        int i,j;
        double vt,pg, troco;
        vt = 0;
        troco = 0;
        Scanner ler = new Scanner(System.in);
        for(i=0; i <5; i++)
        {
           System.out.print("Digite o valor do " + (i+1) +" produto: "  );
           
           
           vt = vt + Integer.parseInt(ler.nextLine());
           
           System.out.print("Total R$" + vt + "\n");
        }
        System.out.print("O total da compra deu R$ " + vt);
        for(j=0; j<1;)
        {
            pg = 0;
            System.out.print("\nDigite o valor do pagamento da compra: "  );
            pg = Integer.parseInt(ler.nextLine());
            if(pg >= vt)
            {
                j = 1;
                
                troco = pg-vt;
            }
            else
            {
                System.out.print("\nO troco deve ser maior ou igual ao valor da compra"  );
            }
             
        }
        
        System.out.print("\nO valor do troco é R$" +  troco + "\n");
    }
    
}
