/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author Ghada
 */
public class ENGStudent implements Student{

    @Override
    public void show(Specialty con) {
        System.out.println("Engeering Student !");
        con.setSpecialty(this);
    }
    
}
