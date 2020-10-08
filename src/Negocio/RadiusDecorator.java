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
public class RadiusDecorator extends BicycleDecorator{
    protected String radius;
    public RadiusDecorator(Bicycle specialBicycle, String radius) {
        super(specialBicycle);
        this.radius = radius;
    }
    
    @Override
    public String showBicycle(){
        return super.showBicycle() + addRadius();
    }

    private String addRadius() {
        return"+ " + this.radius;
    }

}
