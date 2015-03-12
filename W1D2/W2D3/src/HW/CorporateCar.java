/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

/**
 *
 * @author Pandoras_Box
 */
public class CorporateCar extends Vehicle implements Asset {

    public double purchasePrice;
    public double currentValue;

    private int yearPurchased;
    private String employee;

    @Override
    public void accelerate() {
        if (speed <= 65) {
            speed = speed + 5;

        } else {
            speed = 65;
        }
     @Override
     public void brake(){
        
         
         if (speed > 0) {
                speed = speed - 5;

            } else {
                speed = 0;
            }

        }

    }

    @Override
    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public int getYearPurchased() {
        return yearPurchased;
    }

    public void setYearPurchased(int yearPurchased) {
        this.yearPurchased = yearPurchased;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

}
