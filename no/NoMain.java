package estruturaDeDados.no;

public class NoMain {

	public static void main(String... args) {
		No<String> noJava = new No<String>("Conteúdo Java");
		No<String> noPython = new No<String>("Conteúdo Python");
		noJava.setNextValue(noPython);
		No<String> noSql = new No<String>("Conteúdo SQL");
		noPython.setNextValue(noSql);

		System.out.println(noJava.toStringEncadeado());
		System.out.println(noPython.toStringEncadeado());
		System.out.println(noSql.toStringEncadeado());
	}
}
