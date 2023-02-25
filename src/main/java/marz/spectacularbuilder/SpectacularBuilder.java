/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package marz.spectacularbuilder;

/**
 *
 * @author marz
 */
public class SpectacularBuilder {

    public static void main(String[] args) {
        
        var spectacularUser = new User.Builder()
                .firstName("Michael")
                .lastName("Spect")
                .age(33)
                .city("Danzig")
                .build();
        System.out.println(spectacularUser);
     
        var moreSpectacularUser = new User.Builder()
                .firstName("Alexander")
                .city("Berlin")
                .build();
        System.out.println(moreSpectacularUser);
        
        var ultimateSpectacularUser = new User.Builder()
                .lastName("Burger")
                .age(40)
                .build();
        System.out.println(ultimateSpectacularUser);
    }
}
