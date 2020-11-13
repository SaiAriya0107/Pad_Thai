

package pad_thai;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.geom.Rectangle2D;

public class Level1_Stage extends JPanel implements ActionListener {
    
    Person1 person = new Person1();
    
    private ImageIcon CookBG = new ImageIcon(this.getClass().getResource("CookBG1.jpg"));
    private ImageIcon Back = new ImageIcon(this.getClass().getResource("CloseButton.png"));
    private ImageIcon Ingredients = new ImageIcon(this.getClass().getResource("ingredients.png"));
    private ImageIcon pan = new ImageIcon(this.getClass().getResource("pan.png"));
    private ImageIcon padthaiwithpan = new ImageIcon(this.getClass().getResource("padthaiwithpan.png"));
    private ImageIcon plate = new ImageIcon(this.getClass().getResource("plate.png"));
    private ImageIcon PadthaiInPlate = new ImageIcon(this.getClass().getResource("PadthaiInPlate.png"));
    private ImageIcon shrimp = new ImageIcon(this.getClass().getResource("shrimp.png"));
    private ImageIcon greentea = new ImageIcon(this.getClass().getResource("greentea.png"));
    private ImageIcon greentea1cup = new ImageIcon(this.getClass().getResource("greentea1cup.png"));
    private ImageIcon PadthaiWithShrimp = new ImageIcon(this.getClass().getResource("PadthaiWithShrimp.png"));
    private ImageIcon yes = new ImageIcon(this.getClass().getResource("yes.png"));
    private ImageIcon no = new ImageIcon(this.getClass().getResource("no.png"));
    
    private ImageIcon win = new ImageIcon(this.getClass().getResource("win1.png"));
    private ImageIcon lose = new ImageIcon(this.getClass().getResource("lose1.png"));
    
    
    public JButton BackButton = new JButton(Back);
    public JButton IngredientsBT = new JButton(Ingredients);
    public JButton Pan1BT = new JButton(pan);
    
    public JButton PadPan1BT = new JButton(padthaiwithpan);
    
    public JButton Plate1BT = new JButton(plate);
    
    public JButton PadPlate1BT = new JButton(PadthaiInPlate);
    
    public JButton ShrimpBT = new JButton(shrimp);
    public JButton GreenteaBT = new JButton(greentea);
    
    public JButton PadShrimp1BT = new JButton(PadthaiWithShrimp);
    
    boolean checkpan1 = false;
    
    //*** chack padthai on plate***//
    boolean checkplate1 = false;
    
    boolean checkpadplate1 = false;
    
    boolean CGiveOPad = false;
    boolean CGiveOShrimp = false;
    boolean CGiveOTea = false;
    
    boolean tuppad1 = false;
    
    boolean tupkung1 = false;
    
    public boolean CPadPlate = false;
    public boolean CPadShrimp = false;
    public boolean CGreentea = false;
    
    public int times;
    public int randomc;
    public int cos;
    public boolean checkdebug = true;
    public boolean pass = false;
    public int countplate = 0;
    public int countcup = 0;
    
    int timepan = 5;
    int checktimepan1 = timepan;
    
    
    int timeBonus = 20;
    int Bonus = 0;
    boolean Cbonuttime = false;
    boolean COrder_true = false ;
    
    int checkperson = 0;
    
    Thread timecount = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                    times--;
                    if(checkpan1 == true &&  checktimepan1 > 0){
                        checktimepan1--;
                    }
                    if(timeBonus > 0){
                        timeBonus--;
                        Cbonuttime=true;
                    }
                    else{
                        Cbonuttime=false;
                    }
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                }
                if(checkdebug == true){
                    repaint();
                }        
            }
        }
    });
    
    public Level1_Stage() {
        
        timecount.start();
        
        setLayout(null);
        BackButton.setBounds(1100, 0, 84, 90);
        BackButton.setBorderPainted(false);
        BackButton.setBorder(null);
        BackButton.setOpaque(false);
        BackButton.setContentAreaFilled(false);
        add(BackButton);
        
        
        setLayout(null);
        IngredientsBT.setBounds(820,350, 292, 187);
        IngredientsBT.setBorderPainted(false);
        IngredientsBT.setBorder(null);
        IngredientsBT.setOpaque(false);
        IngredientsBT.setContentAreaFilled(false);
        add(IngredientsBT);
        IngredientsBT.addActionListener(this);
        
        setLayout(null);
        Pan1BT.setBounds(320,473, 128, 112);
        Pan1BT.setBorderPainted(false);
        Pan1BT.setBorder(null);
        Pan1BT.setOpaque(false);
        Pan1BT.setContentAreaFilled(false);
        add(Pan1BT);
        Pan1BT.addActionListener(this);
        
        setLayout(null);
        Plate1BT.setBounds(485,490, 135, 85);
        Plate1BT.setBorderPainted(false);
        Plate1BT.setBorder(null);
        Plate1BT.setOpaque(false);
        Plate1BT.setContentAreaFilled(false);
        add(Plate1BT);
        Plate1BT.addActionListener(this);
        
        setLayout(null);
        ShrimpBT.setBounds(640,485, 159, 87);
        ShrimpBT.setBorderPainted(false);
        ShrimpBT.setBorder(null);
        ShrimpBT.setOpaque(false);
        ShrimpBT.setContentAreaFilled(false);
        add(ShrimpBT);
        ShrimpBT.addActionListener(this);
        
        setLayout(null);
        GreenteaBT.setBounds(185,365, 166, 103);
        GreenteaBT.setBorderPainted(false);
        GreenteaBT.setBorder(null);
        GreenteaBT.setOpaque(false);
        GreenteaBT.setContentAreaFilled(false);
        add(GreenteaBT);
        GreenteaBT.addActionListener(this);
        
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(CookBG.getImage(), 0, 0, 1200, 665, this);
        
        g.setColor(Color.WHITE);
        g.fillRect(10, 10, 220, 190);
        
        g.setColor(Color.BLACK);
        g.setFont(new Font("Tohama",Font.BOLD,25));
        g.drawString("Time : "+times,40,35);
        
        g.setColor(Color.BLUE);
        g.setFont(new Font("Tohama",Font.BOLD,25));
        g.drawString("Plate : "+countplate,40,70);
        
        g.setColor(Color.GREEN);
        g.setFont(new Font("Tohama",Font.BOLD,25));
        g.drawString("Cup : "+countcup,40,105);
        g.setFont(new Font("Tohama",Font.BOLD,20));
        
        g.setColor(Color.ORANGE);
        g.setFont(new Font("Tohama",Font.BOLD,25));
        g.drawString("Bonus : "+Bonus,40,140);
        g.setFont(new Font("Tohama",Font.BOLD,20));
        
        g.setColor(Color.RED);
        g.setFont(new Font("Tohama",Font.BOLD,25));
        g.drawString("Time Bonus : "+timeBonus,40,175);
        g.setFont(new Font("Tohama",Font.BOLD,20));
        
        
        g.setColor(Color.CYAN);
        g.fillOval(437, 527, 30, 30);
        
        g.setColor(Color.BLUE);
        g.drawOval(437, 527, 30, 30);
        
        g.setColor(Color.BLUE); 
        g.drawString(""+checktimepan1, 445,550);
        
        if(cos > 0){
            randomc = (int)(Math.random() * (3  - 0 + 0) + 0);
            System.out.println(randomc);
            if(randomc == 0) {
                checkperson = 1;
            }
            else if(randomc == 1) {
                checkperson = 2;              
            }
            else if(randomc == 2){
                checkperson = 5;
            }
            cos = 0;   
        }
        if(checkperson == 1){
            g.drawImage(PadthaiWithShrimp.getImage(),350,155,130,83,this);
            g.drawImage(person.im[0].getImage(),500,140,180,200,this);
            CPadShrimp=true;           
        }
        else if(checkperson == 2){
            g.drawImage(PadthaiInPlate.getImage(),350,155,130,83,this);
            g.drawImage(person.im[1].getImage(),500,140,180,200,this);
            CPadPlate=true;     
        }
        else if(checkperson == 5){
            g.drawImage(greentea1cup.getImage(),650,200,60,102,this);
            g.drawImage(person.im[2].getImage(),500,140,180,200,this);
            CGreentea=true; 
        }
        
        //*******Order Padthai********//
        if(CPadPlate == true){
            if(CGiveOPad == true){
                countplate++;
                cos = 1;
                COrder_true = true;
                timeBonus = 20;
                CPadPlate = false;
                CGiveOPad = false;
                g.drawImage(yes.getImage(),500,200,120,120,this);
            }
            else if(CGiveOShrimp == true){
                Cbonuttime = false;
                CGiveOShrimp = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            
            else if(CGiveOTea == true){
                Cbonuttime = false;
                CGiveOTea = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
        }
        
        //********Order Padthai with Shrimp*******//
        if(CPadShrimp == true){
            if(CGiveOPad == true){
                Cbonuttime = false;
                CGiveOPad = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOShrimp == true){
                countplate++;
                cos = 1;
                timeBonus = 20;
                COrder_true = true;
                CPadPlate = false;
                CPadShrimp = false;
                CGiveOShrimp = false;
                g.drawImage(yes.getImage(),500,200,120,120,this);
            }
            
            else if(CGiveOTea == true){
                Cbonuttime = false;
                CGiveOTea = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
        }
        
        //***** Order Green Tea *****//
        if(CGreentea == true ){
            if(CGiveOPad == true){
                Cbonuttime = false;
                CGiveOPad = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOShrimp == true){
                Cbonuttime = false;
                CGiveOShrimp = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOTea == true){
                System.out.println("Greentea");
                countcup++;
                cos = 1;
                timeBonus = 20;
                COrder_true = true;
                CGiveOTea = false;
                CGreentea = false;
                g.drawImage(yes.getImage(),500,200,120,120,this);
            }
        }
        //******Get Bonus*****//
        if(Cbonuttime==true && COrder_true == true){
            Bonus += 10;
            COrder_true =false;
        }
        
        
        //**********How to win in game**********//
        if(times <= 0){
            if(countplate >= 5 && countcup >= 1){
                g.drawImage(win.getImage(),350, 120, 403, 334, this);
                timecount.stop();
                this.removeAll();
            }
            else{
                if(countplate < 5 || countcup < 1)
                g.drawImage(lose.getImage(),350, 120, 403, 334, this);
                timecount.stop();
                this.removeAll();
            }
        }
    }
    
    
    public void actionPerformed(ActionEvent e) {
        //*************************************//
        //*****put ingradients on the pan*****//
        //*************************************//
        if(e.getSource() == IngredientsBT){
            if(checkpan1 == false){
                this.remove(Pan1BT);
                setLayout(null);
                PadPan1BT.setBounds(325,473, 124, 113);
                PadPan1BT.setBorderPainted(false);
                PadPan1BT.setBorder(null);
                PadPan1BT.setOpaque(false);
                PadPan1BT.setContentAreaFilled(false);
                add(PadPan1BT);
                PadPan1BT.addActionListener(this);
                checkpan1 = true;
            }
        }
        //**********************************//
        //*****put Padthai on the plate*****//
        //**********************************//
      
        else if(e.getSource() == PadPan1BT){
            if(checktimepan1 <= 0 && tuppad1 == false && tupkung1 == false ){
                    this.remove(PadPan1BT);
                    this.remove(Plate1BT);
                    setLayout(null);
                    PadPlate1BT.setBounds(485,490, 130,83);
                    PadPlate1BT.setBorderPainted(false);
                    PadPlate1BT.setBorder(null);
                    PadPlate1BT.setOpaque(false);
                    PadPlate1BT.setContentAreaFilled(false);
                    add(PadPlate1BT);
                    PadPlate1BT.addActionListener(this);
                    checkpan1 = false;
                    checkplate1 = true;
                    checkpadplate1 = true;
                    tuppad1 = true;
                    checktimepan1 = timepan;
                    
            }
        }
        //**********************************//
        //*****put sidedish in padthai*****//
        //**********************************//
        else if(e.getSource() == ShrimpBT){
            if(checkpadplate1 == true){
                this.remove(PadPlate1BT);
                setLayout(null);
                PadShrimp1BT.setBounds(485,490, 130,83);
                PadShrimp1BT.setBorderPainted(false);
                PadShrimp1BT.setBorder(null);
                PadShrimp1BT.setOpaque(false);
                PadShrimp1BT.setContentAreaFilled(false);
                add(PadShrimp1BT);
                PadShrimp1BT.addActionListener(this);
                checkpadplate1 = false;
                tupkung1 = true;
            }
        }
        
        //*********************************//
        //*****Give Order to Customer*****//
        //*********************************//
        else if(e.getSource() == this.GreenteaBT){
            CGiveOTea = true;
        }
        
        else if(e.getSource() == this.PadPlate1BT){
            remove(PadPlate1BT);
            CGiveOPad = true;
            checkplate1 = false;
            tuppad1 = false;
        }
        else if(e.getSource() == this.PadShrimp1BT){
            remove(PadShrimp1BT);
            CGiveOShrimp = true;
            tuppad1 = false;
            tupkung1 = false;
        }
        this.repaint();
    }
}
