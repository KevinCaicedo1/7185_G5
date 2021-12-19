/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinversion;

/**
 *
 * @author CADBEN
 */
public class Shelf {
    Product product;

    public Shelf() {
    }

    void showProduct(Product product) {
          product.getSample();
    }
}
