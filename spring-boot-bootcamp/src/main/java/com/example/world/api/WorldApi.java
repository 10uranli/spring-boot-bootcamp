package com.example.world.api;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.example.world.domain.Country;
import com.example.world.repository.WorldDao;

@RestController
@RequestScope
public class WorldApi {

	/*coupling interface üzerinden kuruldu.*/
	@Autowired //dependcy bagımlılıgı soyluyoruz.
	private WorldDao worldDao;
	
	/*loose coupling : gevşek bağımlılık, sınıflar, moduller arası, uygulamalar arası
	Burada dao çağırınca interfaceler arası çağırmalıyız, kontraktı yani.
	Doğrudan classa eriştirmiyoruz.
	Bu loose coupling
	*/
	@GetMapping("/continents")// bu url ile get isteğini yakalar
	public Collection<String> getAllContinents(){
		return worldDao.getAllContinents();
	}
	
	@GetMapping(value = "/countries" 
			/*, produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}*/)//DEFAULT OLARAK json, zorunlu degil yazman
	public Collection<Country> getContinentsCountries(@RequestParam(required = false, defaultValue = "Asia") String continent){
		//query param gerekli countries?continent=Asia gibi
		//required = false, defaultValue = "Asia" zorunlu değil parametre gelmezse Asia default getir
		return worldDao.findCountriesByContinent(continent);
	}
}
