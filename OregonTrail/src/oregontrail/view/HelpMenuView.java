/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.Scanner;

/**
 *
 * @author Coby
 */
public class HelpMenuView extends View {
    public HelpMenuView(){
        super("\nG - What is the goal of the game?"
        + "\nE - Estimate amount of resources needed"
        + "\nO - List of Occupations"
        + "\nI - List of Items and Weight"
        + "\nL - List of locations and the average distance between them"
        + "\nQ - Quit to main menu"
        + "\nPlease enter your choice:");
    }
    
    
   
        @Override
        public boolean doAction(String inputs) {
        String menuItem = inputs;
        ItemListHelpView itemListHelpView = new ItemListHelpView();
        LocationSortView locationSorting = new LocationSortView();
        OccupationsSortView occupationsSortView = new OccupationsSortView();
        switch (menuItem)
        {
            case "G": System.out.println("The goal of the game is to get at least one person to Oregon.");
            break;
            case "E": System.out.println("More on resource estimates coming soon.");
            break;
            case "O": occupationsSortView.display();
            break;
            case "I": itemListHelpView.display();
            break;
            case "L": locationSorting.display();
            break;
            case "Q": return true;
            default: System.out.println("Invalid menu item");
        }
        return false;
    }

    
}
