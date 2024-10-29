import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = entrada.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = entrada.nextInt();

        try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
            System.out.println("O segundo valor inserido deve ser maior que o primeiro. Favor refazer a operação!");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if(parametroDois < parametroUm){
           throw new ParametrosInvalidosException();
        }
		int contagem = parametroDois - parametroUm;

        for (int i=1; i<=contagem; i++ ){
            System.out.println("Imprimindo número " + i );
        }
    }
}
