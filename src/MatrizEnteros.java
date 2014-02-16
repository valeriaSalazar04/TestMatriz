/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ValeriaG
 */
public class MatrizEnteros {
     private int matriz[][];

    public MatrizEnteros() {
    }

    public MatrizEnteros(int filas , int columnas) {
        
       if(columnas==0)
       {
           //creando matrices dispersas
           this.matriz=new int[filas][];
           crearElementosDispersos();
       }
       else
       {
        this.matriz = new int[filas][columnas];
        crearElementos();
       }
    }
    
    
    private void crearElementosDispersos()
    {
        for(int i=0;i<this.matriz.length;i++)
        {
            int columnas=(int)(Math.random()*this.matriz.length+1);
            this.matriz[i]=new int[columnas];
            crearElementosVector(this.matriz[i]);
        }
    }
    
    
    
    private void crearElementos()
    {
        for(int i=0;i<this.matriz.length;i++)
        {
            crearElementosVector(this.matriz[i]);
        }
        
    }
    
    
    private void crearElementosVector(int vectorCols[])
    {
        for(int j=0;j<vectorCols.length;j++)
        {
            int elemento=(int)(Math.random()*vectorCols.length);
            vectorCols[j]=elemento;
        }
    }
    
    
    
    //foreach o iterador
    public String toString()
    {
    String msg="";
        for(int vectorCols[]:this.matriz)
        {
            for(int elemento:vectorCols)
            {
                msg+=elemento+"\t";
            }
            msg+="\n";
        }
     return (msg);
    }
    
    
    //manera convencional
    public String toString2()
    {
    String msg="";
        for(int i=0; i<this.matriz.length;i++)
        {
            for(int j=0;j<this.matriz[i].length;j++)
            {
                msg+=this.matriz[i][j]+"\t";
            }
            msg+="\n";
        }
     return (msg);
    }
    
    
    
    /*
     * @return true si la matriz es dispersa o false en caso contrario
     */
    public boolean esDispersa(){
        int i=0;
        int aux =matriz[i].length;
        int aux2=0;
        
                for (i=i+1; i<matriz.length; i++){
                   aux2=matriz[i].length;
                
                   if (aux!= aux2){
                    return true;
                }
                   }
                
            
    
                 return false;
    }
    
    /**
     * Compara si dos objetos de la clase MatrizEnteros son iguales
     * @param obj la matriz2 a comparar
     * @return 
     */
    public boolean equals(Object obj)
    {
        MatrizEnteros m2=(MatrizEnteros)obj;
        
        boolean uno=this.esDispersa();
        boolean dos=m2.esDispersa();
        
        if (uno==true && dos==true ){
              boolean resul=comparoPosiciones(m2);
        
        if (resul== true){
             boolean comparar=compararElementos(m2);
        if (comparar == true){
        return true;
    }
        }
        }
        return false;
        
    }
    
   public boolean comparoPosiciones (MatrizEnteros m2){
       int cont=0;
//       MatrizEnteros m2=(MatrizEnteros)obj;
       if (matriz.length==m2.matriz.length){
       for (int i=0;i<matriz.length;i++){
          
               if (matriz[i].length==m2.matriz[i].length){
                   cont ++;
               }
               if (cont == matriz.length){
                   return true;
               }
           }
       }
     
    return false;
}
      public boolean compararElementos (MatrizEnteros m){
          
          int cont =0;
          for (int i=0; i<matriz.length;i++){
          for (int j=0; j<matriz[i].length;j++){
              if (matriz[i][j]==m.matriz[i][j]){
                  cont ++;
              }
          }
      }
          if (cont==matriz.length){
          return true;
      }
          return false;
   }
}
    

