import java.util.InputMismatchException;
import java.util.Scanner;
public class DesafioControleFluxo {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner (System.in);
        
        int parametroUm, parametroDois, subtrair;

            try {
                System.out.println("Digite o primeiro parâmetro");
                parametroUm = leitor.nextInt();
                System.out.println("Digite o segundo parâmetro");
                parametroDois = leitor.nextInt();
                subtrair = parametroDois - parametroUm;
                if (parametroDois > parametroUm) {
                    for (int contador = 1; contador <= subtrair; contador++) {
                        System.out.println(contador);
                    }
                } else if (parametroDois <= parametroUm) {
                    System.out.println("O segundo parâmetro deve ser maior do que o parâmetro um");                    
                }
            }
            catch (InputMismatchException e){
                System.out.println("Os parâmetros devem ser númericos");
            }           
    }
}