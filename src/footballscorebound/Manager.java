/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballscorebound;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author theki
 */
public class Manager implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
       System.out.println("live result: "+evt.getNewValue());
    }
    
}
