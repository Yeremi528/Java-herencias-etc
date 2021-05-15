package shishi;

public class Shishi extends ClasePadre_Abstracta{
    //Sobrescribir transacciones para poder ocupar getter and setter
    @Override
    public void Transacciones(){
        System.out.println("Cuanto deseas retirar");
        Retiro();
        System.out.println("Cuanto deseas retirar:");
        if(retiro<=getSaldo()){
            transacciones=getSaldo();
            setSaldo(transacciones-retiro);
            System.out.println("Tu saldo actual es:" + getSaldo());
        }else{
            System.out.println("Saldo insuficiente");
            
        }
        
        
        
    }
   
   
   
        
     
        
        
    }
