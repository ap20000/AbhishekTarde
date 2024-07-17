/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhishektradeconcern.controller;

import com.abhishektradeconcern.model.AbhishekTradeModel;

/**
 *@author abhishek
 */
public class InsertionSort {
     public AbhishekTradeModel[] insertionBYID(AbhishekTradeModel[] LaptopModel){
        int range = LaptopModel.length;
         
        for (int step = 1; step < range; step++) { // Iterate over the array starting from the second element.
            AbhishekTradeModel key = LaptopModel[step];
            int index = step - 1;
            
             while (index >= 0 && LaptopModel[index].getLaptopID()> key.getLaptopID()) {  // Compare LaptopID and move elements to the right until the correct position for the key is found.
                LaptopModel[index + 1] = LaptopModel[index];
                index = index - 1;
            }
            LaptopModel[index + 1] = key;
        }
        return LaptopModel;
    }
    
    public AbhishekTradeModel[] insertionBYPrice(AbhishekTradeModel[] LaptopModel){
        int range = LaptopModel.length;
        
        for (int step = 1; step < range; step++) { // Iterate over the array starting from the second element.
            AbhishekTradeModel key = LaptopModel[step];
            int index = step - 1;
            
             while (index >= 0 && LaptopModel[index].getPrice()> key.getPrice()) {  // Compare Price and move elements to the right until the correct position for the key is found.
                LaptopModel[index + 1] = LaptopModel[index];
                index = index - 1;
            }
            LaptopModel[index + 1] = key;
        }
        return LaptopModel;
    }
}

