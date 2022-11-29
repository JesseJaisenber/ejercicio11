

package com.mycompany.once;

/**
 *
 * @author bernardez03
 */
public class Once {
    
    public Once(){
        try{
            ExcepcionA();
        } catch(Exception e){
            e.printStackTrace();
    }
        }
    public void ExcepcionA()throws Exception{
         try{
             ExcepcionB();
         } catch(Exception e){
             throw new Exception("Excepcion Superior", e);
         }
    }
    public void ExcepcionB() throws Exception{
    try{
    ExcepcionC();
} catch(Exception e){
    throw new Exception("Excepcion Intermedia", e);
}
}    
    
            public void ExcepcionC()throws Exception {
                throw new Exception ("Excepcion Inferior");
    

            }
         public static void main(String[] args){
             new Once();
         }
     

    }

