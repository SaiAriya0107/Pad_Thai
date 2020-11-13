
package pad_thai;
import javax.swing.*;


public class Person2  {
    public ImageIcon[] im = new ImageIcon[4];
    public int x;
    public int count = 0;

    Person2(){
        for(int i=0;i<im.length;i++){
            im[i] = new ImageIcon(this.getClass().getResource("person"+(i+1)+".png"));
	}
    }
}
