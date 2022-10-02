package br.com.devinhouse.teste;

public class Calculadora {

    int x;
    int y;

    public Calculadora(){

    }
    public Calculadora(int x, int y){
        this.x = x;
        this.y = y;
        
    }

    public int divide(){
        int div = 0 ;
        try{
            // div = this.x / this.y;
           
           throw new CalculadoraException("Tristleza");

        }catch(CalculadoraException e){
            e.getMessage();

        }
        return div;
        
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX( int x) {
        this.x = x;
    }
    
    public void setY( int y) {
        this.y = y;
    }


    
}
