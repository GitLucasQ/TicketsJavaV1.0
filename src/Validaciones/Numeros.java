
package Validaciones;


public class Numeros {
    
    public static boolean esNumero(String valor){
        try {
            Integer.parseInt(valor);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static boolean precValido(String valor){
        try {
            Float.parseFloat(valor);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
