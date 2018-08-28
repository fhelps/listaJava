
public class Programa
{
	public static void main (String[] args)
	{
		ListaDesordenada<String> nomes;
		nomes = new ListaDesordenada<String> ();
		nomes.insiraNoComeco ("Adriana");
		nomes.insiraNoComeco ("Natalia");
		nomes.insiraNoComeco ("Carina");
		nomes.insiraNoComeco ("Bianca");
		nomes.insiraNoComeco ("Luana");



		try{
			nomes.insiraNoFim("Felipe");


			/**
			if(nomes.tem("Felipe"))
				System.out.println("Tem Felipe");
			else
				System.out.println("N�o tem Felipe");

			if(nomes.tem("a"))
				System.out.println("Tem a");
			else
				System.out.println("N�o tem a");
**/
			String print = null;

			print = (nomes.tem("Felipe")) ? "Tem Felipe" : "Nao tem Felipe";

			System.out.println(print);

			print = (nomes.tem("a")) ? "Tem a" : "Nao tem a";


			System.out.println(print);



			nomes.remova("Felipe");
			System.out.println("-------------------");
			System.out.println(nomes);
			nomes.insiraNoFim("Felipe");
			System.out.println("-------------------");
			System.out.println(nomes);
		}
		catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
}