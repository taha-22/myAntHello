/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cmp3osmantm
 */
public class SayHello implements Greetings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "udari-kvaz@ru";
        if (args.length > 0) {
            name=args[0];
        }
        System.out.println("Privet daragoi " + name + " :)");
        
    }
    
}
