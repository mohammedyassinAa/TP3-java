package tp3p;
import java.util.Set;

public class Produit {
    private String id;
    private String nom;
    private double prix;
    private String categorie;
    private int anneeFabric;
    private Set<Integer> evaluations;

    // Constructeur
    public Produit(String id, String nom, double prix, String categorie, int anneeFabric, Set<Integer> evaluations) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.categorie = categorie;
        this.anneeFabric = anneeFabric;
        this.evaluations = evaluations;
    }

    // Getters et Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getCategorie() {
        return categorie;
    }

    public int getAnneeFabric() {
        return anneeFabric;
    }

    public Set<Integer> getEvaluations() {
        return evaluations;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", categorie='" + categorie + '\'' +
                ", anneeFabric=" + anneeFabric +
                ", evaluations=" + evaluations +
                '}';
    }
}
