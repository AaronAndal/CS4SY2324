/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4charmandal;

/**
 *
 * @author CHARM
 */
public class CS4CharmAndal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name1 = "Cheeseburger Pringles";
        int rating1 = 1;
        int caloriesPerServing1 = 150;
        String limitedEdition1 = "True";
        String ratingComparison1;
        
        String name2 = "Sour Cream Pringles";
        int rating2 = 9;
        int caloriesPerServing2 = 150;
        String limitedEdition2 = "False";
        String ratingComparison2;
        
        String name3 = "BBQ Pringles";
        int rating3 = 10;
        int caloriesPerServing3 = 150;
        String limitedEdition3 = "False";
        String ratingComparison3;

        int meanRating = (rating1 + rating2 + rating3) / 3;
        int totalRating = rating1 + rating2 + rating3;

        if (rating1 > meanRating) {
            ratingComparison1 = "Yes";
        } else {
            ratingComparison1 = "No";
        }

        if (rating2 > meanRating) {
            ratingComparison2 = "Yes";
        } else {
            ratingComparison2 = "No";
        }

        if (rating3 > meanRating) {
            ratingComparison3 = "Yes";
        } else {
            ratingComparison3 = "No";
        }
        
        System.out.println("Flavor #1: " + name1);
        System.out.println( "    " + "Flavor Rating (Out of 10): " + rating1);
        System.out.println( "    " + "Calories (per Serving): " + caloriesPerServing1);
        System.out.println( "    " + "Limited Edition: " + limitedEdition1);
        System.out.println( "    " + "Is the rating higher than the mean rating" + '(' + meanRating + ")?: " + ratingComparison1);
        System.out.println();
        
        System.out.println("Flavor #2: " + name2);
        System.out.println( "    " + "Flavor Rating (Out of 10): " + rating2);
        System.out.println( "    " + "Calories (per Serving): " + caloriesPerServing2);
        System.out.println( "    " + "Limited Edition: " + limitedEdition2);
        System.out.println( "    " + "Is the rating higher than the mean rating" + '(' + meanRating + ")?: " + ratingComparison2);
        System.out.println();
        
        System.out.println("Flavor #3: " + name3);
        System.out.println( "    " + "Flavor Rating (Out of 10): " + rating3);
        System.out.println( "    " + "Calories (per Serving): " + caloriesPerServing3);
        System.out.println( "    " + "Limited Edition: " + limitedEdition3);
        System.out.println( "    " + "Is the rating higher than the mean rating" + '(' + meanRating + ")?: " + ratingComparison3);
        System.out.println();
        
        System.out.println("Mean Rating: " + meanRating);
        if ((rating1 == rating2) && (rating2 == rating3)) {
            System.out.println("All ratings are equal: True");
        }
        else {
            System.out.println("All ratings are equal: False");
        }
        System.out.println("Total Rating: " + totalRating);
        
    }
    
}
