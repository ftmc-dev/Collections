import java.util.HashSet;
import java.util.Objects;

public class Etudiant implements Comparable<Etudiant> {
    private String matricule;
    public String nom;
    public String prenom;
    public String filiere;

    public Etudiant(String matricule, String nom, String prenom, String filiere) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.filiere = filiere;
    }
    public static void main(String[] args){
        HashSet<String> student = new HashSet<>();

        student.add(String.valueOf(new Etudiant("123", "John", "Jean", "GL")));
        student.add(String.valueOf(new Etudiant("123", "John", "Jean", "GL")));

        System.out.println(student);

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant student = (Etudiant) o;
        return Objects.equals(matricule, matricule);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricule);
    }

    @Override
    public String toString() {
        return this.matricule + " " + this.nom + " " + this.prenom + " " + this.filiere ;
    }

    @Override
    public int compareTo(Etudiant o) {
        return 0;
    }
}
