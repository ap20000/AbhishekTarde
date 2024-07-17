/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhishektradeconcern.controller;

import com.abhishektradeconcern.model.AbhishekTradeModel;




/**
 *
 * @author abhishek
 */
public class SelectionSort {
    public AbhishekTradeModel[] selectionBYBrand(AbhishekTradeModel[] LaptopModel){
        int scope = LaptopModel.length;

        for(int step = 0; step < scope - 1; step++){   // Iterate through the array
            int min = step;

            for(int next = step + 1; next < scope; next++){ // Find the index of the minimum element in the unsorted part of the array
                if (LaptopModel[next].getBrand().compareTo(
                        LaptopModel[min].getBrand())<0){
                    min = next;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            AbhishekTradeModel temp = LaptopModel[step];
            LaptopModel[step] = LaptopModel[min];
            LaptopModel[min] = temp;
        }
        return LaptopModel;
    }

    public AbhishekTradeModel[] selectionBYName(AbhishekTradeModel[] LaptopModel)
    {
        int scope = LaptopModel.length;

        for(int step = 0; step < scope - 1; step++){ // Iterate through the array
            int min = step;

            for(int next = step + 1; next < scope; next++){ // Find the index of the minimum element in the unsorted part of the array
                if(LaptopModel[next].getName().compareTo(
                        LaptopModel[min].getName())<0){
                    min = next;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            AbhishekTradeModel temp = LaptopModel[step];
            LaptopModel[step] = LaptopModel[min];
            LaptopModel[min] = temp;
        }
        return LaptopModel;
    }
}