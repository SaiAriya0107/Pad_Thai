
package pad_thai;
import javax.swing.*;


public class Person3  {
    public ImageIcon[] im = new ImageIcon[5];
    public int x;
    public int count = 0;

    Person3(){
        for(int i=0;i<im.length;i++){
            im[i] = new ImageIcon(this.getClass().getResource("person"+(i+1)+".png"));
	}
    }
}

