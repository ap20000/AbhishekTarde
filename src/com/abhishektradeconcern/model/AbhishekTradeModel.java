/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhishektradeconcern.model;

/**
 *
 * @author NITRO5
 */
public class AbhishekTradeModel {
   private int laptopID;
   private String name;
   private String modelNumber;
   private String brand;
   private int price;
   private String memory;
   private String storage;
   private String processor;
   private String colour;
   private String specialfeatures;
 
    public AbhishekTradeModel(int laptopID,String name, String modelNumber,String brand,int price,String memory,String storage,String processor,String colour,
            String specialfeatures){
        this.laptopID = laptopID;
        this.name = name;
        this.modelNumber = modelNumber;
        this.price = price;
        this.processor = processor;
        this.colour = colour;
        this.brand=brand;
        this.memory=memory;
        this.storage=storage;
        this.specialfeatures = specialfeatures;
        
    }
    
    public int getLaptopID() {
        return laptopID;
    }

    public void setLaptopID(int laptopID) {
        this.laptopID = laptopID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
    
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public String getSpecialFeatures() {
        return specialfeatures;
    }

    public void setSpecialFeatures(String specialfeatures) {
        this.specialfeatures = name;
    }
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
    
    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
    
    
    
    
    
    
    
}
