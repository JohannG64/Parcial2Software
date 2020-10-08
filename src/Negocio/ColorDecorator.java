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
public class ColorDecorator extends BicycleDecorator{
    protected String color;
    public ColorDecorator(Bicycle specialBicycle, String color) {
        super(specialBicycle);
        this.color = color;
    }
    
    @Override
    public String showBicycle(){
        return super.showBicycle() + addColors();
    }

    private String addColors() {
        return "+ " + this.color;
    }

}
