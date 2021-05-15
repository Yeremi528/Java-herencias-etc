
package shishi;


public class clase_deposito extends ClasePadre_Abstracta {
    //Llamar a la clase abstracta para poder ocupar setter and getter 
    @Override
    public void Transacciones(){
        System.out.println("Cuanto quieres depositar");
        Deposito();
        transacciones=getSaldo();
        setSaldo(transacciones+deposito);
        System.out.println("Has depositado " + deposito);
        System.out.println("Tu saldo actual es " + getSaldo());
        
        
        
    }
    
}
