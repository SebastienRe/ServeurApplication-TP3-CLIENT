import javax.naming.Context;
import javax.naming.InitialContext;

import bean_entity.CannotGetNullAuthor;

public class Client_entity {
    public static void main(String[] args) throws Exception {
        Context initcont = new InitialContext();
        bean_entity.GestionLivreInterface cm = (bean_entity.GestionLivreInterface) initcont.lookup("bean_entity.GestionLivreInterface");

        question1(cm);

        question2(cm);

        question3(cm);
    }

    public static void question1(bean_entity.GestionLivreInterface cm) {
        System.out.println("Question 1 : One to One");
        System.out.println("nb pages : " + cm.getNbPages("111")); // On affiche le nombre de pages du livre 111
    }

    public static void question2(bean_entity.GestionLivreInterface cm) throws CannotGetNullAuthor {
        System.out.println("Question 2 : One to Many");
        cm.unsetAuteur("3333"); // On supprime l'auteur du livre 3333
        cm.setAuteur("3333", 33); // On ajoute un auteur au livre 3333
        System.out.println("Auteur : " + cm.getAuteur("3333")); // On affiche l'auteur du livre 3333
    }

    public static void question3(bean_entity.GestionLivreInterface cm) {
        System.out.println("Question 3 : Relation bidirectionnelle OneToMany ");
        String livres = cm.getLivresAuthor("3333"); 
        // On affiche les livres de l'auteur qui a fait le livre 3333
        System.out.println("Livres de l'auteur : " + livres);
    }

}