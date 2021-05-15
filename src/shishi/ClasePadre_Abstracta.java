package shishi;

import java.util.Scanner;

public abstract class ClasePadre_Abstracta {

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);
   //Declarar el Scanner antes de empezar para ocuparlo dentro de todo el codigo
    public void Operaciones() {
        int bandera = 0;
        int seleccion = 0;
        
        do {
            do {
                System.out.println("Porfavor seleccione una opción:");
                System.out.println("    1. Consulta de saldo.");
                System.out.println("    2. Retiro de efectivo.");
                System.out.println("    3. Deposito de efectivo.");
                System.out.println("    4. Salir.");
                seleccion = entrada.nextInt();
                
                /* es importane decirle que de caso contrario que no seleccione 
                algo dentro del rango que le pedimos darle un "else"
                */
                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    //Simple estetica no hay necesidad
                    System.out.println("-------------------------------------------------");
                    System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                    System.out.println("-------------------------------------------------");
                }
            } while (bandera == 0);
            
            if(seleccion == 1){
                ClasePadre_Abstracta mensajero = new saldo();
                mensajero.Transacciones();
            }else if(seleccion == 2){
                ClasePadre_Abstracta mensajero = new Shishi();
                mensajero.Transacciones();
            } else if(seleccion == 3){
                ClasePadre_Abstracta mensajero = new clase_deposito();
                mensajero.Transacciones();
            } else if(seleccion == 4){
                System.out.println("--------------------------");
                System.out.println("¡Gracias!, vuelva pronto.");
                System.out.println("--------------------------");
                bandera = 2;
            }
        } while (bandera != 2);
    }
    
    //Método para solicitar cantidad de retiro
    public void Retiro(){
        retiro = entrada.nextInt();
    }
    
    //Método para solicitar deposito
    public void Deposito(){
        deposito = entrada.nextInt();
    }
    
    //Método abstracto necesitaremos override en las otras clases para ocuparlo
    public abstract void Transacciones();
    
    //Métodos setter para establecer y getter para obteber
    public int getSaldo(){
        return saldo;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
}
