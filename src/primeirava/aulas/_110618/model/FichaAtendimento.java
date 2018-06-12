package primeirava.aulas._110618.model;

import java.util.Observable;

public class FichaAtendimento extends Observable{
    
    private int numero;
    
    public FichaAtendimento(){}
    
    public FichaAtendimento(int numero){
        this.numero = numero;
    }
    
    public void incX(){
        numero++;
        
        // Obrigatorio em todos os modelos que houver atualização
        setChanged(); // Mudança de estado
        notifyObservers(numero); // Notifica os observadores
    }
    
    public int getX(){
        return numero;
    }
}