import java.awt.*;       
public class FlowLayoutExample  extends Frame
{   
Button buttons[];     
FlowLayoutExample()  
{      
     for (int i = 0;i<10;i++) {    
      buttons[i] = new Button ("Button " + (i + 1));      
	 add (buttons[i]);       
 }
setLayout(new FlowLayout(FlowLayout.LEFT, 20, 25));    		
   setSize(300, 300);    
 setVisible(true);    
}     
public static void main(String args[])   
{    
    new FlowLayoutExample();    
}    
}    