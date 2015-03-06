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
public interface Asset {
    
	int getPurchasePrice();
	int getCurrentValue();
	int amoritize(int years);
    
    
}
