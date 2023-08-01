import java.util.Scanner;



public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametro1 = sc.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametro2 = sc.nextInt();
        
        try {
            contar(parametro1, parametro2);
            for(int i = parametro1; i<= parametro2; i++){

                System.out.println(i);
            }
            
            
        } catch (ParametrosInvalidosException e) {
            
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            
        }
    }
    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        int contagem = parametro2 - parametro1;
        if(parametro1 > parametro2){
            throw new ParametrosInvalidosException(); 
        }
    }
}
