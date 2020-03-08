package model;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

public class PokemonDAO {
	static String uri = "https://pokeapi.co/api/v2/pokemon/";
	static RestTemplate rt= new RestTemplate();

	
	public void PokemonDAO() {
		
	}
	
	public static Pokemon obtenerPokemon(String nombre) {

	uri="https://pokeapi.co/api/v2/pokemon/"+nombre;
	Map<String,String> params = new HashMap<>();
	System.out.println(nombre);
	System.out.println(uri);

		Pokemon pokemon = rt.getForObject(uri, Pokemon.class);
		System.out.println(pokemon.getNombre());
		return pokemon;

	}


}
