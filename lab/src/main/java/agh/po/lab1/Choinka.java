public class Choinka{
	public static void main(String[] args) {
		String znak = "*";
		for(int i=0; i<Integer.parseInt(args[0]); i++)
		{
			System.out.println(znak);
			znak+="*";
		}
	}
}