/**
*	Tipos Primitivos
*	@author LucasSafeno
*/
public class TiposPrimitivos{
	public static void main(String[] args){
		int idade = 31;
		double preco = 12.45;
		char sexo = 'M'; // aspas simples para char. Recebe apenas uma letra
		boolean casado = true; // Recebe apenas dois valores. true ou false
		
		byte b = 127; // cem
		short s = 3276; // 32 mil
		int i = 20000000; // 2 bilhões
		long l =  9000000; //  9 quintilhões
		
		
		double d = 1.7976931348623157E+308; //IEEE 754
		//float = 123F;
		
		// Forma binaria
		byte bb = 0b01010101; // precisa começar com prefixo 0b / 8 bits - 1 byte 
		short ss = 0b0101010101010101; // 16bits - 2 bytes
		int ii = 0b01010101010101010101010101010101; // 32bits / 4bytes
		
		// Cast implicito
		i = s;
		System.out.println(s);
		System.out.println(i);
		
		// Cast explicito
		i = (int) l;
		System.out.println(l);
		System.out.println(i);
			
		
		// System.out.println(ii);
		
	}
}