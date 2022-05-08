package Pokemon;

import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) throws FileNotFoundException{

		Pokemon pokemon = new Pokemon("001");
		
		System.out.println(pokemon.getBase());

	}

}
