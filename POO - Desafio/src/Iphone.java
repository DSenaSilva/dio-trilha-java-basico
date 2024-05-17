public class Iphone {
    public static void main(String[] args) throws Exception {

    AparelhoTelefonico ap = new AparelhoTelefonico();
	NavegadorInternet ni = new NavegadorInternet();
	ReprodutorMusical rm= new ReprodutorMusical();

	System.out.println("-------------------------- ");
    System.out.println("Mostrando açõe do Telefone ");
    System.out.println("-------------------------- ");
	 ap.ligar();
	 ap.atender();
	 ap.iniciarCorreioVoz();

     System.out.println("-------------------------- ");
     System.out.println("Mostrando açõe da Internet ");
     System.out.println("-------------------------- ");

	 ni.adicionarNovaAba();
	 ni.exibirPagina();
	 ni.atualizarPagina();

	 System.out.println("-------------------------------------- ");
 	 System.out.println("Mostrando açõe do Reprodutor de Música ");	
     System.out.println("-------------------------------------- ");

		rm.tocar();
		rm.pausar();
		rm.selecionarMusica();

     System.out.println("--------------------------------------- ");

    }
}
