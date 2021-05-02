
package calculadora;

import com.sun.java.swing.plaf.windows.resources.windows;
import vista.Vista;
import java.util.*;

public class CALCULADORA {

public float  Suma(float numero1 ,float  numero2){
    float res = numero1 + numero2;
 return res;   
}
public float Resta(float numero1,float numero2){
     float res = numero1 - numero2;
 return res;   
   
}
public float Multi(float numero1,float numero2){
     float res = numero1 * numero2;
 return res;   
   
}
public float Divicion(float numero1,float numero2){
     float res = numero1 / numero2;
 return res;   
   
}
    public static void main(String[] args) {
        Vista window = new Vista();
        window.setVisible(true);
    }
}