/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinversion;

/**
 *
 * @author G5
 */
public class Dvd implements Product{
    
    @Override
    public void getSample() {
        System.out.println("Im a dvd");
    }

}
