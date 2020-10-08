package Negocio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author JohannG
 */
public abstract class BicycleDecorator implements Bicycle{
    protected Bicycle specialBicycle;
    public BicycleDecorator(Bicycle specialBicycle){
        this.specialBicycle = specialBicycle;
    }
    
    @Override
    public String showBicycle(){
        return this.specialBicycle.showBicycle();
    }

    public Bicycle getSpecialBicycle() {
        return specialBicycle;
    }
    
    
}
