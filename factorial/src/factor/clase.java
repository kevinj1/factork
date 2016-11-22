
package factor;

import javax.swing.JOptionPane;


public class clase {

    public clase() {
    }
    
    
    public void calcular(){
        
        int alma=1;
       
       
        for(int i=1;i<=10;i++){
            
            for(int j=1;j<=i;j++){
                alma = alma*j;
                
                
            }            
            JOptionPane.showMessageDialog(null,alma);
            alma = 1;
        }
         
    }
}
