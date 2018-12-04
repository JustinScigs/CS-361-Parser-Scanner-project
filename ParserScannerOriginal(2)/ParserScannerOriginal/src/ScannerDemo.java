/**
 * @author Christelle
 * 
 */
public class ScannerDemo {

	private static String file1 = "C:\\Users\\jnice\\Downloads\\ParserScannerOriginal(2)\\ParserScannerOriginal\\src\\prog2.jay";
	private static int counter = 1;

	public static void main(String args[]) {

		TokenStream ts = new TokenStream(file1);

		System.out.println(file1);

		while (!ts.isEndofFile()) {
			// TO BE COMPLETEDs

			System.out.println("Token " + counter + ":" + ts.nextToken().toString());
			counter = counter + 1;
		}
	}
}
