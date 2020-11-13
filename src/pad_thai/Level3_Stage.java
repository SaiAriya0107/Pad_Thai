

package pad_thai;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.geom.Rectangle2D;

public class Level3_Stage extends JPanel implements ActionListener {
    
    Person3 person = new Person3();
    
    private ImageIcon CookBG = new ImageIcon(this.getClass().getResource("CookBG.jpg"));
    private ImageIcon Back = new ImageIcon(this.getClass().getResource("CloseButton.png"));
    private ImageIcon Ingredients = new ImageIcon(this.getClass().getResource("ingredients.png"));
    private ImageIcon pan = new ImageIcon(this.getClass().getResource("pan.png"));
    private ImageIcon padthaiwithpan = new ImageIcon(this.getClass().getResource("padthaiwithpan.png"));
    private ImageIcon plate = new ImageIcon(this.getClass().getResource("plate.png"));
    private ImageIcon PadthaiInPlate = new ImageIcon(this.getClass().getResource("PadthaiInPlate.png"));
    private ImageIcon shrimp = new ImageIcon(this.getClass().getResource("shrimp.png"));
    private ImageIcon squid = new ImageIcon(this.getClass().getResource("squid.png"));
    private ImageIcon shell = new ImageIcon(this.getClass().getResource("shell.png"));
    private ImageIcon greentea = new ImageIcon(this.getClass().getResource("greentea.png"));
    private ImageIcon greentea1cup = new ImageIcon(this.getClass().getResource("greentea1cup.png"));
    private ImageIcon PadthaiWithShrimp = new ImageIcon(this.getClass().getResource("PadthaiWithShrimp.png"));
    private ImageIcon PadthaiWithSquid = new ImageIcon(this.getClass().getResource("PadthaiWithSquid.png"));
    private ImageIcon PadthaiWithShell = new ImageIcon(this.getClass().getResource("PadthaiWithShell.png"));
    private ImageIcon yes = new ImageIcon(this.getClass().getResource("yes.png"));
    private ImageIcon no = new ImageIcon(this.getClass().getResource("no.png"));
    
    private ImageIcon win = new ImageIcon(this.getClass().getResource("win3.png"));
    private ImageIcon lose = new ImageIcon(this.getClass().getResource("lose3.png"));
    
    
    public JButton BackButton = new JButton(Back);
    public JButton IngredientsBT = new JButton(Ingredients);
    public JButton Pan1BT = new JButton(pan);
    public JButton Pan2BT = new JButton(pan);
    public JButton Pan3BT = new JButton(pan);
    
    public JButton PadPan1BT = new JButton(padthaiwithpan);
    public JButton PadPan2BT = new JButton(padthaiwithpan);
    public JButton PadPan3BT = new JButton(padthaiwithpan);
    
    public JButton Plate1BT = new JButton(plate);
    public JButton Plate2BT = new JButton(plate);
    public JButton Plate3BT = new JButton(plate);
    
    public JButton PadPlate1BT = new JButton(PadthaiInPlate);
    public JButton PadPlate2BT = new JButton(PadthaiInPlate);
    public JButton PadPlate3BT = new JButton(PadthaiInPlate);
    
    public JButton ShrimpBT = new JButton(shrimp);
    public JButton SquidBT = new JButton(squid);
    public JButton ShellBT = new JButton(shell);
    public JButton GreenteaBT = new JButton(greentea);
    
    public JButton PadShrimp1BT = new JButton(PadthaiWithShrimp);
    public JButton PadShrimp2BT = new JButton(PadthaiWithShrimp);
    public JButton PadShrimp3BT = new JButton(PadthaiWithShrimp);
    
    public JButton PadSquid1BT = new JButton(PadthaiWithSquid);
    public JButton PadSquid2BT = new JButton(PadthaiWithSquid);
    public JButton PadSquid3BT = new JButton(PadthaiWithSquid);
    
    public JButton PadShell1BT = new JButton(PadthaiWithShell);
    public JButton PadShell2BT = new JButton(PadthaiWithShell);
    public JButton PadShell3BT = new JButton(PadthaiWithShell);
    
    boolean checkpan1 = false;
    boolean checkpan2 = false;
    boolean checkpan3 = false;
    
    //*** chack padthai on plate***//
    boolean checkplate1 = false;
    boolean checkplate2 = false;
    boolean checkplate3 = false;
    
    boolean checkpadplate1 = false;
    boolean checkpadplate2 = false;
    boolean checkpadplate3 = false;
    
    boolean CGiveOPad = false;
    boolean CGiveOShrimp = false;
    boolean CGiveOSquid = false;
    boolean CGiveOShell = false;
    boolean CGiveOTea = false;
    
    boolean tuppad1 = false;
    boolean tuppad2 = false;
    boolean tuppad3 = false;
    
    boolean tupkung1 = false;
    boolean tupkung2 = false;
    boolean tupkung3 = false;
    
    boolean tupmuk1 = false;
    boolean tupmuk2 = false;
    boolean tupmuk3 = false;
    
    boolean tupshell1 = false;
    boolean tupshell2 = false;
    boolean tupshell3 = false;
    
    public boolean CPadPlate = false;
    public boolean CPadShrimp = false;
    public boolean CPadSquid = false;
    public boolean CPadShell = false;
    public boolean CGreentea = false;
    
    
   
    public int times;
    public int randomc = (int)(Math.random() * (2 - 0 + 0) + 0);
    public int cos;
    public boolean checkdebug = true;
    public boolean pass = false;
    public int countplate = 0;
    public int countcup = 0;
    
    int timepan = 5;
    int checktimepan1 = timepan;
    int checktimepan2 = timepan;
    int checktimepan3 = timepan;
    
    int checkperson = 0;
    
    Thread timecount = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                    if(checkpan1 == true &&  checktimepan1 > 0){
                        checktimepan1--;
                    }
                    if(checkpan2 == true && checktimepan2 > 0){
                        checktimepan2--;
                    }
                    if(checkpan3 == true && checktimepan3 > 0){
                        checktimepan3--;
                    }
                    times--;
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                }
                if(checkdebug == true){
                    repaint();
                }        
            }
        }
    });
    
    public Level3_Stage() {
        
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
        Pan2BT.setBounds(335,400, 128, 112);
        Pan2BT.setBorderPainted(false);
        Pan2BT.setBorder(null);
        Pan2BT.setOpaque(false);
        Pan2BT.setContentAreaFilled(false);
        add(Pan2BT);
        Pan2BT.addActionListener(this);
        
        setLayout(null);
        Pan3BT.setBounds(345,330, 128, 112);
        Pan3BT.setBorderPainted(false);
        Pan3BT.setBorder(null);
        Pan3BT.setOpaque(false);
        Pan3BT.setContentAreaFilled(false);
        add(Pan3BT);
        Pan3BT.addActionListener(this);
        
        setLayout(null);
        Plate1BT.setBounds(485,490, 135, 85);
        Plate1BT.setBorderPainted(false);
        Plate1BT.setBorder(null);
        Plate1BT.setOpaque(false);
        Plate1BT.setContentAreaFilled(false);
        add(Plate1BT);
        Plate1BT.addActionListener(this);
        
        setLayout(null);
        Plate2BT.setBounds(490,415, 135, 85);
        Plate2BT.setBorderPainted(false);
        Plate2BT.setBorder(null);
        Plate2BT.setOpaque(false);
        Plate2BT.setContentAreaFilled(false);
        add(Plate2BT);
        Plate2BT.addActionListener(this);
        
        Plate3BT.setBounds(490,340, 135, 85);
        Plate3BT.setBorderPainted(false);
        Plate3BT.setBorder(null);
        Plate3BT.setOpaque(false);
        Plate3BT.setContentAreaFilled(false);
        add(Plate3BT);
        Plate3BT.addActionListener(this);
        
        setLayout(null);
        ShrimpBT.setBounds(640,485, 159, 87);
        ShrimpBT.setBorderPainted(false);
        ShrimpBT.setBorder(null);
        ShrimpBT.setOpaque(false);
        ShrimpBT.setContentAreaFilled(false);
        add(ShrimpBT);
        ShrimpBT.addActionListener(this);
        
        setLayout(null);
        SquidBT.setBounds(640,400, 149, 97);
        SquidBT.setBorderPainted(false);
        SquidBT.setBorder(null);
        SquidBT.setOpaque(false);
        SquidBT.setContentAreaFilled(false);
        add(SquidBT);
        SquidBT.addActionListener(this);
        
        setLayout(null);
        ShellBT.setBounds(635,335, 151, 86);
        ShellBT.setBorderPainted(false);
        ShellBT.setBorder(null);
        ShellBT.setOpaque(false);
        ShellBT.setContentAreaFilled(false);
        add(ShellBT);
        ShellBT.addActionListener(this);
        
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
        g.fillRect(10, 10, 180, 110);
        
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
        
        
        g.setColor(Color.CYAN);
        g.fillOval(437, 527, 30, 30);
        g.fillOval(440,462, 30, 30);
        g.fillOval(450,387, 30, 30);
        
        g.setColor(Color.BLUE);
        g.drawOval(437, 527, 30, 30);
        g.drawOval(440,462, 30, 30);
        g.drawOval(450,387, 30, 30);
        
        g.setColor(Color.BLUE); 
        g.drawString(""+checktimepan1, 445,550);
        g.drawString(""+checktimepan2, 445,485);
        g.drawString(""+checktimepan3, 455,410);
        
        if(cos > 0){
            randomc = (int)(Math.random() * (5  - 0 + 0) + 0);
            System.out.println(randomc);
            if(randomc == 0) {
                checkperson = 1;
            }
            else if(randomc == 1) {
                checkperson = 2;              
            }
            else if(randomc == 2) {
                checkperson = 3;
            }
            else if(randomc == 3){
                checkperson = 4;
            }
            else if(randomc == 4){
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
        else if(checkperson == 3){
            g.drawImage(PadthaiWithShell.getImage(),350,155,130,83,this);
            g.drawImage(person.im[2].getImage(),500,140,180,200,this);
            CPadShell=true; 
        }
        else if(checkperson == 4){
            g.drawImage(PadthaiWithSquid.getImage(),650,200,130,83,this);
            g.drawImage(person.im[3].getImage(),500,140,180,200,this);
            CPadSquid=true; 
        }
        else if(checkperson == 5){
            g.drawImage(greentea1cup.getImage(),650,200,60,102,this);
            g.drawImage(person.im[4].getImage(),500,140,180,200,this);
            CGreentea=true; 
        }
        
        //*******Order Padthai********//
        if(CPadPlate == true){
            if(CGiveOPad == true){
                countplate++;
                cos = 1;
                CPadPlate = false;
                CGiveOPad = false;
                g.drawImage(yes.getImage(),500,200,120,120,this);
            }
            else if(CGiveOShrimp == true){
                CGiveOShrimp = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOSquid == true){
                CGiveOSquid = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOShell == true){
                CGiveOShell = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOTea == true){
                CGiveOTea = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
        }
        
        //********Order Padthai with Shrimp*******//
        if(CPadShrimp == true){
            if(CGiveOPad == true){
                CGiveOPad = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOShrimp == true){
                countplate++;
                cos = 1;
                CPadPlate = false;
                CPadShrimp = false;
                CGiveOShrimp = false;
                g.drawImage(yes.getImage(),500,200,120,120,this);
            }
            else if(CGiveOSquid == true){
                CGiveOSquid = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOShell == true){
                CGiveOShell = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOTea == true){
                CGiveOTea = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
        }
        
        //**********Order Padthai with Squid**********//
        if(CPadSquid == true){
            if(CGiveOPad == true){
                CGiveOPad = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOShrimp == true){
                CGiveOShrimp = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOSquid == true){
                countplate++;
                cos = 1;
                CPadPlate = false;
                CPadSquid = false;
                CGiveOSquid = false;
                g.drawImage(yes.getImage(),500,200,120,120,this);
            }
            else if(CGiveOShell == true){
                CGiveOShell = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOTea == true){
                CGiveOTea = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
        }
        
        //***** Order Padthai with Shell *****//
        if(CPadShell == true){
            if(CGiveOPad == true){
                CGiveOPad = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOShrimp == true){
                CGiveOShrimp = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOSquid == true){
                CGiveOSquid = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOShell == true){
                countplate++;
                cos = 1;
                CPadPlate = false;
                CGiveOShell = false;
                CPadShell = false;
                g.drawImage(yes.getImage(),500,200,120,120,this);
            }
            else if(CGiveOTea == true){
                CGiveOTea = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
        }
        
        //***** Order Green Tea *****//
        if(CGreentea == true ){
            if(CGiveOPad == true){
                CGiveOPad = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOShrimp == true){
                CGiveOShrimp = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOSquid == true){
                CGiveOSquid = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOShell == true){
                CGiveOShell = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOTea == true){
                countcup++;
                cos = 1;
                CGiveOTea = false;
                CGreentea = false;
                g.drawImage(yes.getImage(),500,200,120,120,this);
            }
        }
        
        //**********How to win in game**********//
        if(times <= 0){
            if(countplate >= 20 && countcup >= 3){
                g.drawImage(win.getImage(), 350, 120, 403, 334, this);
                timecount.stop();
                this.removeAll();
            }
            else{
                if(countplate < 20 || countcup < 3)
                g.drawImage(lose.getImage(), 350, 120, 403, 334, this);
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
            else if(checkpan2 == false){
                this.remove(Pan2BT);
                setLayout(null);
                PadPan2BT.setBounds(340,400, 124, 113);
                PadPan2BT.setBorderPainted(false);
                PadPan2BT.setBorder(null);
                PadPan2BT.setOpaque(false);
                PadPan2BT.setContentAreaFilled(false);
                add(PadPan2BT);
                PadPan2BT.addActionListener(this);
                checkpan2 = true;
            }
            else if(checkpan3 == false){
                this.remove(Pan3BT);
                setLayout(null);
                PadPan3BT.setBounds(345,330, 124, 113);
                PadPan3BT.setBorderPainted(false);
                PadPan3BT.setBorder(null);
                PadPan3BT.setOpaque(false);
                PadPan3BT.setContentAreaFilled(false);
                add(PadPan3BT);
                PadPan3BT.addActionListener(this);
                checkpan3 = true;
            }
        }
        //**********************************//
        //*****put Padthai on the plate*****//
        //**********************************//
      
        else if(e.getSource() == PadPan1BT){
            if(checktimepan1 <= 0 && tuppad1 == false && tupkung1 == false && tupmuk1 == false && tupshell1 == false){
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
        
        else if(e.getSource() == PadPan2BT){
            if(checktimepan2 <= 0 && tuppad2 == false && tupkung2 == false && tupmuk2 == false && tupshell2 == false){
                this.remove(PadPan2BT);
                this.remove(Plate2BT);
                setLayout(null);
                PadPlate2BT.setBounds(490,415, 130,83);
                PadPlate2BT.setBorderPainted(false);
                PadPlate2BT.setBorder(null);
                PadPlate2BT.setOpaque(false);
                PadPlate2BT.setContentAreaFilled(false);
                add(PadPlate2BT);
                PadPlate2BT.addActionListener(this);
                checkpan2 = false;
                checkplate2 = true;
                checkpadplate2 = true;
                tuppad2 = true;
                checktimepan2 = timepan;
                
            }
        }
        else if(e.getSource() == PadPan3BT){
            if(checktimepan3 <= 0 && tuppad3 == false && tupkung3 == false && tupmuk3 == false && tupshell3 == false){
                this.remove(PadPan3BT);
                this.remove(Plate3BT);
                setLayout(null);
                PadPlate3BT.setBounds(495,340, 130,83);
                PadPlate3BT.setBorderPainted(false);
                PadPlate3BT.setBorder(null);
                PadPlate3BT.setOpaque(false);
                PadPlate3BT.setContentAreaFilled(false);
                add(PadPlate3BT);
                PadPlate3BT.addActionListener(this);
                checkpan3 = false;
                checkplate3 = true;
                checkpadplate3 = true;
                tuppad3 = true;
                checktimepan3 = timepan;
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
                checkplate1 = false;
                checkpadplate1 = false;
                tupkung1 = true;
            }
            else if(checkpadplate2 == true){
                this.remove(PadPlate2BT);
                setLayout(null);
                PadShrimp2BT.setBounds(490,415, 130,83);
                PadShrimp2BT.setBorderPainted(false);
                PadShrimp2BT.setBorder(null);
                PadShrimp2BT.setOpaque(false);
                PadShrimp2BT.setContentAreaFilled(false);
                add(PadShrimp2BT);
                PadShrimp2BT.addActionListener(this);
                checkplate2 = false;
                checkpadplate2 = false;
                tupkung2 = true;
            }
            else if(checkpadplate3 == true){
                this.remove(PadPlate3BT);
                setLayout(null);
                PadShrimp3BT.setBounds(490,340, 130,83);
                PadShrimp3BT.setBorderPainted(false);
                PadShrimp3BT.setBorder(null);
                PadShrimp3BT.setOpaque(false);
                PadShrimp3BT.setContentAreaFilled(false);
                add(PadShrimp3BT);
                PadShrimp3BT.addActionListener(this);
                checkplate3 = false;
                checkpadplate3 = false;
                tupkung3 = true;
            }
        }
        
        else if(e.getSource() == SquidBT){
            if(checkpadplate1 == true){
                this.remove(PadPlate1BT);
                setLayout(null);
                PadSquid1BT.setBounds(485,490, 130,83);
                PadSquid1BT.setBorderPainted(false);
                PadSquid1BT.setBorder(null);
                PadSquid1BT.setOpaque(false);
                PadSquid1BT.setContentAreaFilled(false);
                add(PadSquid1BT);
                PadSquid1BT.addActionListener(this);
                checkplate1 = false;
                checkpadplate1 = false;
                tupmuk1 = true;
            }
            else if(checkpadplate2 == true){
                this.remove(PadPlate2BT);
                setLayout(null);
                PadSquid2BT.setBounds(490,415, 130,83);
                PadSquid2BT.setBorderPainted(false);
                PadSquid2BT.setBorder(null);
                PadSquid2BT.setOpaque(false);
                PadSquid2BT.setContentAreaFilled(false);
                add(PadSquid2BT);
                PadSquid2BT.addActionListener(this);
                checkplate2 = false;
                checkpadplate2 = false;
                tupmuk2 = true;
            }
            else if(checkpadplate3 == true){
                this.remove(PadPlate3BT);
                setLayout(null);
                PadSquid3BT.setBounds(490,340, 130,83);
                PadSquid3BT.setBorderPainted(false);
                PadSquid3BT.setBorder(null);
                PadSquid3BT.setOpaque(false);
                PadSquid3BT.setContentAreaFilled(false);
                add(PadSquid3BT);
                PadSquid3BT.addActionListener(this);
                checkplate3 = false;
                checkpadplate3 = false;
                tupmuk3 = true;
            }
        }
        
        else if(e.getSource() == ShellBT){
            if(checkpadplate1 == true){
                this.remove(PadPlate1BT);
                setLayout(null);
                PadShell1BT.setBounds(485,490, 130,83);
                PadShell1BT.setBorderPainted(false);
                PadShell1BT.setBorder(null);
                PadShell1BT.setOpaque(false);
                PadShell1BT.setContentAreaFilled(false);
                add(PadShell1BT);
                PadShell1BT.addActionListener(this);
                checkplate1 = false;
                checkpadplate1 = false;
                tupshell1 = true;
            }
            else if(checkpadplate2 == true){
                this.remove(PadPlate2BT);
                setLayout(null);
                PadShell2BT.setBounds(490,415, 130,83);
                PadShell2BT.setBorderPainted(false);
                PadShell2BT.setBorder(null);
                PadShell2BT.setOpaque(false);
                PadShell2BT.setContentAreaFilled(false);
                add(PadShell2BT);
                PadShell2BT.addActionListener(this);
                checkplate2 = false;
                checkpadplate2 = false;
                tupshell2 = true;
            }
            else if(checkpadplate3 == true){
                this.remove(PadPlate3BT);
                setLayout(null);
                PadShell3BT.setBounds(490,340, 130,83);
                PadShell3BT.setBorderPainted(false);
                PadShell3BT.setBorder(null);
                PadShell3BT.setOpaque(false);
                PadShell3BT.setContentAreaFilled(false);
                add(PadShell3BT);
                PadShell3BT.addActionListener(this);
                checkplate3 = false;
                checkpadplate3 = false;
                tupshell3 = true;
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
        
        else if(e.getSource() == this.PadPlate2BT){
            remove(PadPlate2BT);
            CGiveOPad = true;
            checkplate2 = false;
            tuppad2 = false;
        }
        
        else if(e.getSource() == this.PadPlate3BT){
            remove(PadPlate3BT);
            CGiveOPad = true;
            checkplate3 = false;
            tuppad3 = false;
        }
        
        else if(e.getSource() == this.PadShrimp1BT){
            remove(PadShrimp1BT);
            CGiveOShrimp = true;
            tuppad1 = false;
            tupkung1 = false;
        }
        
        else if(e.getSource() == this.PadShrimp2BT){
            remove(PadShrimp2BT);
            CGiveOShrimp = true;
            tuppad2 = false;
            tupkung2 = false;
        }
        
        else if(e.getSource() == this.PadShrimp3BT){
            remove(PadShrimp3BT);
            CGiveOShrimp = true;
            tuppad3 = false;
            tupkung3 = false;
        }
        
        else if(e.getSource() == this.PadSquid1BT){
            remove(PadSquid1BT);
            CGiveOSquid = true;
            tuppad1 = false;
            tupmuk1 = false;
        }
        
        else if(e.getSource() == this.PadSquid2BT){
            remove(PadSquid2BT);
            CGiveOSquid = true;
            tuppad2 = false;
            tupmuk2 = false;
        }
        
        else if(e.getSource() == this.PadSquid3BT){
            remove(PadSquid3BT);
            CGiveOSquid = true;
            tuppad3 = false;
            tupmuk3 = false;
        }
        
        else if(e.getSource() == this.PadShell1BT){
            remove(PadShell1BT);
            CGiveOShell = true;
            tuppad1 = false;
            tupshell1 = false;
        }
        
        else if(e.getSource() == this.PadShell2BT){
            remove(PadShell2BT);
            CGiveOShell = true;
            tuppad2 = false;
            tupshell2 = false;
        }
        
        else if(e.getSource() == this.PadShell3BT){
            remove(PadShell3BT);
            CGiveOShell = true;
            tuppad3 = false;
            tupshell3 = false;
        }
        
        this.repaint();
    }
}
