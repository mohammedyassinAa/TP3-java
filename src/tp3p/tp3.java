package tp3p;
import java.util.*;
import java.util.stream.*;


public class tp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mois = new ArrayList<>(Arrays.asList(
			    "janvier", "février", "mars", "avril", "mai", "juin", 
			    "juillet", "août", "septembre", "octobre", "novembre", "décembre"
			));
		
		List<String> NM = mois.stream()
	            // Filtrer les mois qui contiennent la lettre 'a'
				.filter(m -> !m.toLowerCase().contains("a"))
//				Maper
				.map(String::toUpperCase)
//				collecter 
				.collect(Collectors.toList());
	     		NM.forEach(System.out::println);
			
}
	}
