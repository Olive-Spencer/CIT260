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
        + "\nP - Print list of locations to file"
        + "\nQ - Quit to main menu"
        + "\nPlease enter your choice:");
    }
    
    
   
        @Override
        public boolean doAction(String inputs) {
        String menuItem = inputs;
        
        
        
        
        
        
        
        switch (menuItem)
        {
            case "G": 
                this.console.println("The goal of the game is to get at least one person to Oregon.");
                break;
            case "E": 
                this.console.println("More on resource estimates coming soon.");
                break;
            case "O": 
                OccupationsSortView occupationsSortView = new OccupationsSortView();
                occupationsSortView.display();
                break;
            case "I": 
                ItemListHelpView itemListHelpView = new ItemListHelpView();
                itemListHelpView.display();
                break;
            case "L": 
                LocationSortView locationSorting = new LocationSortView();
                locationSorting.display();
                break;
            case "P": 
                LocationPrintView locationPrintView = new LocationPrintView();
                locationPrintView.display();
                break;
            case "Q": 
                return true;
            default: 
                this.console.println("Invalid menu item");
        }
        return false;
    }

    
}
