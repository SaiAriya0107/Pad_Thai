
package pad_thai;
import javax.swing.*;


public class Person1  {
    public ImageIcon[] im = new ImageIcon[3];
    public int x;
    public int count = 0;

    Person1(){
        for(int i=0;i<im.length;i++){
            im[i] = new ImageIcon(this.getClass().getResource("person"+(i+1)+".png"));
	}
    }
}
