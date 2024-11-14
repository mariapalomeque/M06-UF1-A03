package App;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import Model.Article;

public class GestioArticle {

    public ArrayList<Article> AfegirArticles(BufferedReader reader) throws IOException {

        ArrayList<Article> LlistaArticle = new ArrayList<>();

        boolean addArticles = true;

        while (addArticles) {

            System.out.println("Quin article vols afegir?: ");
            String nomArticle = reader.readLine();
    
            System.out.println("Quantitat: ");

            float quantitat = 0;
            boolean numberValid = false;

            while(!numberValid) {
                try {
                    quantitat = Float.parseFloat(reader.readLine());
                    numberValid = true;
                   
               } catch (Exception e) {
                   System.out.println("Format de quantitat no vàlid, torneu a introduir la quantitat fent servir nombres");
               }

            }
 
            System.out.println("Quina unitat (indicar Kg, g, ... o simplement u per unitats)? :");

            boolean unitatValida = false;

            String unitat = "";

            while(!unitatValida) {
                
                unitat = reader.readLine();

                if (!unitat.matches("^[a-zA-Z]+$")) {
                    System.out.println("format d'unitats no vàlides");
                } else {
                    unitatValida = true;
                }
            }

            System.out.println("Preu unitari (per unitat, Kg, ..) en euros? :");

            float preu = 0;

            numberValid = false;

            while(!numberValid) {
                try {
                    preu = Float.parseFloat(reader.readLine());
                    numberValid = true;
                   
               } catch (Exception e) {
                   System.out.println("Format de preu no vàlid, torneu a introduir la quantitat fent servir nombres");
               }

            }

            Article article = new Article(nomArticle,quantitat, unitat, preu);
    
            LlistaArticle.add(article);

            System.out.println("Vols introduir cap article més? Si (S) per més afegir més: ");

            if (!(reader.readLine().matches("[Ss]"))) {    
                addArticles = false;
            }

        }

        return LlistaArticle;

    }
    
}
