package com.abhishektradeconcern.controller;

import com.abhishektradeconcern.model.AbhishekTradeModel;

/**
 *
 * @author abhishek
 */
public class BinarySearchAlgorithm {

    public int searchthroughBrand(AbhishekTradeModel[] laptopArr, int low, int high, String searchKey){
        if(high>=low){
            int midle = (low + high)/2;
 
            // If the element is present at the middle itself
            if (laptopArr[midle].getBrand().equals(searchKey))
                return midle;
 
            // If the element is smaller than mid, search in the left subarray
            
            if (laptopArr[midle].getBrand().compareTo(searchKey)>0)
                return searchthroughBrand(laptopArr, low, midle - 1, searchKey);
 
             // Else search in the right subarray
            
            return searchthroughBrand(laptopArr, midle + 1, high, searchKey);
        }
        return -1; // Brand not found
    }
    public int searchthroughName(AbhishekTradeModel[] laptopArr, int low, int high, String searchKey){
        if(high>=low){
            int midle = (low + high)/2;
 
            // If the element is present at the middle itself
            if (laptopArr[midle].getName().equals(searchKey))
                return midle;
 
            // If the element is smaller than mid, search in the left subarray
            if (laptopArr[midle].getName().compareTo(searchKey)>0)
                return searchthroughName(laptopArr, low, midle - 1, searchKey);
 
            // Else search in the right subarray
            return searchthroughName(laptopArr, midle + 1, high, searchKey);
        }
        return -1; // Name not found
    }
    public int searchthroughPrice(AbhishekTradeModel[] laptopArr, int low, int high, int searchKey){
        if(high>=low){
            int midle = (low + high)/2;

            // If the element is present at the middle itself
            if (laptopArr[midle].getPrice() == searchKey)
                return midle;
 
            // If the element is smaller than mid, search in the left subarray
            if (laptopArr[midle].getPrice() > searchKey)
                return searchthroughPrice(laptopArr, low, midle - 1, searchKey);
 
            // Else search in the right subarray
            return searchthroughPrice(laptopArr, midle + 1, high, searchKey);
        }
        return -1; //Price not found
    }
    public int searchthroughLaptopID(AbhishekTradeModel[] laptopArr, int low, int high, int searchKey){
        if(high>=low){
            int midle = (low + high)/2;

            // If the element is present at the middle itself
            if (laptopArr[midle].getLaptopID()== searchKey)
                return midle;
 
            // If the element is smaller than mid, search in the left subarray
            if (laptopArr[midle].getLaptopID() > searchKey)
                return searchthroughLaptopID(laptopArr, low, midle - 1, searchKey);
 
            // Else search in the right subarray
            return searchthroughLaptopID(laptopArr, midle + 1, high, searchKey);
        }
        return -1; // LaptopID not found
    }

}
