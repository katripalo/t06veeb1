package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi!!";
    }
    
    @RequestMapping("/tervitus")
    String tervitus2(String eesnimi){  
        return "Tere, "+eesnimi;
    }
	
	@RequestMapping("/korrutus/{arv1}/{arv2}")
	String korrutamine(@PathVariable String arv1, @PathVariable String arv2) {
		if(arv1==null){return "esimene arv puudub";}
		int vastus=Integer.parseInt(arv1)*Integer.parseInt(arv2);
		return String.valueOf(vastus);
	}
 
	//http://greeny.cs.tlu.ee:10111/korrutus?arv1=4&arv2=5
	//http://greeny.cs.tlu.ee:33333/arvutamine.html
	//mvn package
	//java -jar -Dserver.port=33333 target/boot3-1.0-SNAPSHOT.jar

	
	
	
 
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }
}
