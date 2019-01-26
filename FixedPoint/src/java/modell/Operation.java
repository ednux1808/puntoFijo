/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

/**
 *
 * @author Eduardo
 */
public class Operation {
    
    private String operationInput = "";
    private int x = 0;
    private double Ea = 0;
    String []keyWord = {"POTENCI","EXP","RAIZ"};
    String letterArray = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
    
    public void testing(){
        this.setOperationInput("POTENCIA(x,3)+5x/8");
        this.setX(4);
    }
    
   
    public void fixedPoint(){
        String memoria = "";
        for(int i = 0; i < operationInput.length(); i++){
           char letter = operationInput.charAt(i);
           
           if(esLetra(letter) == true){
               //Si es letra
               if(letter == 'x'){
                   System.out.println("es una variable x");
               }else{
                   
                   if(verificarKey(memoria)){
                       System.out.println("key potencia");
                   }else{
                       memoria += letter;
                   }
               }
               
           }else{
               //No es letra
            //    System.out.println("No es letra "+letter);
           }
           
                
        }
        
    
    }
    
    public boolean verificarKey(String key){
        for (String keyWord1 : keyWord) {
            if (key == null ? keyWord1 == null : key.equals(keyWord1)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean esLetra(char comprobar){
        for(int i = 0; i < this.letterArray.length(); i++){
            char letter = this.letterArray.charAt(i);
            if(comprobar == letter){
                return true;
            }
            
        }
        return false;
    }

    public String getOperationInput() {
        return operationInput;
    }

    public void setOperationInput(String operationInput) {
        this.operationInput = operationInput;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getEa() {
        return Ea;
    }

    public void setEa(double Ea) {
        this.Ea = Ea;
    }
    
    
    
}
