public class ParserDemo {

	public static void main(String[] args) {
		TokenStream tStream = new TokenStream("C:\\Users\\jnice\\Downloads\\ParserScannerOriginal(2)\\ParserScannerOriginal\\src\\prog2.jay");
		System.out.println("test1");
		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		System.out.println("test2");
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");
	}

}
