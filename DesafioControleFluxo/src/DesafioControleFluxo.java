import java.util.Scanner;

public class DesafioControleFluxo {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo número: ");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println( "O segundo número deve ser maior que o primeiro");
		}
			
	}
    
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
             throw new ParametrosInvalidosException();
           
        }
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem

        for (int contagem1=0;contagem1 < contagem;contagem1++){
            System.out.println( (contagem1+1));
        }
	}
}
