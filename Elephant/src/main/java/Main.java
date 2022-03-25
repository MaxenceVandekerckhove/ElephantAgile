import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Démarrage de l'application");
        String article;
        System.out.println("Veuillez saisir un article");

        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
            String nomArticle = reader.readLine();

        System.out.println("Mon article : " + nomArticle);

        double prixArticle;

        System.out.println("Veuillez saisir un prix");
        prixArticle = parseDouble(reader.readLine());

        System.out.println("Article : " + nomArticle + " Prix: " + prixArticle);

        Integer nombreArticle;
        System.out.println("Veuillez saisir un nombre d'article");

        nombreArticle = parseInt(reader.readLine());

        System.out.println("Article : " + nomArticle + " Prix: " + prixArticle + " Nombre d'article : " + nombreArticle);

        double prixTotalDesArticles;
        prixTotalDesArticles = prixArticle * nombreArticle;
        System.out.println("Prix total des articles : " + prixTotalDesArticles + "€");

        Integer discountRate;

        Boolean reduction = false;

        double prixApresReduction;

        discountRate = 1;
        if ( prixTotalDesArticles > 1000) {

            reduction = true;

            System.out.println("Vous avez le droit à une promotion !");

            if(prixTotalDesArticles >= 10000 && prixTotalDesArticles < 5000) {
                discountRate = 3;
            }
            if(prixTotalDesArticles >= 5000 && prixTotalDesArticles < 7000) {
                discountRate = 5;
            }
            if(prixTotalDesArticles >= 7000 && prixTotalDesArticles < 10000) {
                discountRate = 7;
            }
            if(prixTotalDesArticles >= 10000 && prixTotalDesArticles < 50000) {
                discountRate = 10;
            }
            if(prixTotalDesArticles > 50000) {
                discountRate = 15;
            }
            System.out.println("Vous avez le droit à " + discountRate + "% de promotion");
        }
        else {
            System.out.println("Prix normal");
        }

        if(reduction){
            prixApresReduction = prixTotalDesArticles * 1-(discountRate/100);
            System.out.println("Prix après réduction : " + prixApresReduction);
        } else {
            prixApresReduction = prixTotalDesArticles;
        }

        double tva = 20/100;

        double prixFinal = prixApresReduction * (1+tva);

        System.out.println("Prix final : " + prixFinal);

    }
}
