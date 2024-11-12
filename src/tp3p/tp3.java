package tp3p;
import java.util.*;
import java.util.stream.*;


public class tp3 {

	public static void main(String[] args) {
//		Exercice3:
		Set<Integer> eval1 = new HashSet<>(Arrays.asList(3, 5, 4, 2, 5));
		Set<Integer> eval2 = new HashSet<>(Arrays.asList(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1));
		Set<Integer> eval3 = new HashSet<>(Arrays.asList(4, 5, 4, 5, 4, 5));
		Set<Integer> eval4 = new HashSet<>(Arrays.asList(2, 3, 2, 1, 2));
		Set<Integer> eval5 = new HashSet<>(Arrays.asList(5, 5, 5, 5, 5));

	        // Création de quelques objets Produit pour tester
	        Set<Produit> produits = new HashSet<>();
	        produits.add(new Produit("12", "Télévision", 1500.0, "Electronique", 2022, eval1));
	        produits.add(new Produit("34", "Canapé", 2500.0, "meuble", 2020, eval2));
	        produits.add(new Produit("56", "Livre de Java", 50.0, "librairie", 2021, eval3));
	        produits.add(new Produit("78", "Ordinateur", 1800.0, "Electronique", 2023, eval4));
	        produits.add(new Produit("90", "Table", 800.0, "meuble", 2019, eval5));
		
//		Stream1
		Set<Produit> produitsStream1 = produits.stream()
				.filter(produit -> produit.getAnneeFabric() <= 2021)
				.map(p -> {
	                String prefix = p.getCategorie().substring(0, 3).toUpperCase();
	                p.setId(prefix + "-" + p.getId());
	                return p;
	            })
	            .collect(Collectors.toSet());
//		Stream2
        Set<Produit> produitsStream2 = produits.stream()
                .filter(p -> !(p.getCategorie().equals("Electronique") && p.getPrix() > 2000))
                .map(p -> {
                    if (p.getCategorie().equals("Electronique")) {
                        p.setPrix(p.getPrix() * 0.85); // Remise de 15%
                    }
                    return p;
                })
                .filter(p -> p.getCategorie().equals("librairie"))
                .collect(Collectors.toSet());
        
        List<Produit> produitsStream3 = produits.stream()
                .filter(p -> !p.getCategorie().equals("meuble"))
                .map(p -> {
                    p.setPrix(p.getPrix() * 0.9); // Remise de 10%
                    return p;
                })
                .filter(p -> {
                    double moyenne = p.getEvaluations().stream().mapToInt(Integer::intValue).average().orElse(0);
                    return moyenne <= 2 && p.getEvaluations().size() > 20;
                })
                .map(p -> {
                    p.setId(p.getId() + "ME");
                    return p;
                })
                .filter(p -> p.getEvaluations().stream().filter(e -> e == 0).count() >= 7)
                .collect(Collectors.toList());
        
        
        // Affichage
        System.out.println("Stream 1 : " + produitsStream1);
       System.out.println("Stream 2 : " + produitsStream2);
        System.out.println("Stream 3 : " + produitsStream3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Ex2:
//		        // Création d'un ensemble de produits
//		        Set<Produit> produits = new HashSet<>(Arrays.asList(
//		            new Produit("Produit1", 50.0, "Catégorie1"),
//		            new Produit("Produit2", 150.0, "Catégorie2"),
//		            new Produit("Produit3", 75.0, "Catégorie1"),
//		            new Produit("Produit4", 200.0, "Catégorie3"),
//		            new Produit("Produit5", 90.0, "Catégorie2")
//		        ));
//
//		        // Opérations sur les streams
//		        Set<Produit> produitsModifies = produits.stream()
//		            // Filtrer les produits avec un prix inférieur ou égal à 100
//		            .filter(produit -> produit.getPrix() <= 100)
//		            // Appliquer un rabais de 10% sur le prix
//		            .map(produit -> {
//		                produit.setPrix(produit.getPrix() * 0.9); // Appliquer 10% de rabais
//		                return produit;
//		            })
//		            // Collecter les produits modifiés dans un nouvel ensemble
//		            .collect(Collectors.toSet());
//
//		        // Afficher la liste des produits modifiés
//		        produitsModifies.forEach(System.out::println);
		    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Exercice1:
//		// TODO Auto-generated method stub
//		List<String> mois = new ArrayList<>(Arrays.asList(
//			    "janvier", "février", "mars", "avril", "mai", "juin", 
//			    "juillet", "août", "septembre", "octobre", "novembre", "décembre"
//			));
//		
//		List<String> NM = mois.stream()
//	            // Filtrer les mois qui contiennent la lettre 'a'
//				.filter(m -> !m.toLowerCase().contains("a"))
////				Maper
//				.map(String::toUpperCase)
////				collecter 
//				.collect(Collectors.toList());
//	     		NM.forEach(System.out::println);
			
		
		
		
}
}
