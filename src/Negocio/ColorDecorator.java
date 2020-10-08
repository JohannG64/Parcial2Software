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
        return super.getSpecialBicycle().showBicycle() + addColors();
    }

    private String addColors() {
        return "+ " + this.color;
    }

    @Override
    public void setSerial(String Serial) {
        super.getSpecialBicycle().setSerial(Serial);
    }

    @Override
    public String getSerial() {
        return super.getSpecialBicycle().getSerial();
    }

    @Override
    public void setMarca(String Marca) {
        super.getSpecialBicycle().setMarca(Marca);
    }

    @Override
    public String getMarca() {
        return super.getSpecialBicycle().getMarca();
    }

    @Override
    public void setModelo(String Modelo) {
        super.getSpecialBicycle().setModelo(Modelo);
    }

    @Override
    public String getModelo() {
        return super.getSpecialBicycle().getModelo();
    }

}
