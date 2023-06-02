import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{

    JFrame jf;
    JButton DarkButton;
    JButton sevenButton;
    JButton EightButton;
    JButton NineButton;
    JButton FourButton;
    JButton FiveButton;
    JButton SixButton;
    JButton ThreeButton;
    JButton TwoButton;
    JButton OneButton;
    JButton dotButton;
    JButton ZeroButton;
    JButton EqualButton;
    JButton AdditionButton;
    JButton SubstractionButton;
    JButton MultiplicationButton;
    JButton DivisionnButton;
    JButton ClearButton;
    JLabel disJLabel;
    boolean isoperatorclicked=false;
    String oldvalue;
    int a;
    
    
    
    

    public Calculator(){
        jf=new JFrame("CALCULATOR");
        jf.setLayout(null);
        jf.setSize(600, 600);
        disJLabel=new JLabel();
        disJLabel.setBounds(30, 50, 540, 60);
        disJLabel.setFont(new Font("Arial",Font.PLAIN,40));
        disJLabel.setBackground(Color.LIGHT_GRAY);
        disJLabel.setOpaque(true);
        disJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        disJLabel.setForeground(Color.white);
        jf.add(disJLabel);


        sevenButton=new JButton("7");
        sevenButton.setBounds(30, 120, 80, 80);
        jf.add(sevenButton);
        sevenButton.addActionListener(this);
        sevenButton.setFont(new Font("Arial",Font.PLAIN,40));

        EightButton=new JButton("8");
        EightButton.setBounds(130, 120, 80, 80);
        jf.add(EightButton);
        EightButton.addActionListener(this);
        EightButton.setFont(new Font("Arial",Font.PLAIN,40));

        NineButton=new JButton("9");
        NineButton.setBounds(230, 120, 80, 80);
        NineButton.addActionListener(this);
        jf.add(NineButton);
        NineButton.setFont(new Font("Arial",Font.PLAIN,40));

        FourButton=new JButton("4");
        FourButton.setBounds(30, 220, 80, 80);
        FourButton.addActionListener(this);
        jf.add(FourButton);
        FourButton.setFont(new Font("Arial",Font.PLAIN,40));

        FiveButton=new JButton("5");
        FiveButton.setBounds(130, 220, 80, 80);
        FiveButton.addActionListener(this);
        jf.add(FiveButton);
        FiveButton.setFont(new Font("Arial",Font.PLAIN,40));

        SixButton=new JButton("6");
        SixButton.setBounds(230, 220, 80, 80);
        SixButton.addActionListener(this);
        jf.add(SixButton);
        SixButton.setFont(new Font("Arial",Font.PLAIN,40));


        ThreeButton=new JButton("3");
        ThreeButton.setBounds(30, 320, 80, 80);
        ThreeButton.addActionListener(this);
        jf.add(ThreeButton);
        ThreeButton.setFont(new Font("Arial",Font.PLAIN,40));

        TwoButton=new JButton("2");
        TwoButton.setBounds(130, 320, 80, 80);
        TwoButton.addActionListener(this);
        jf.add(TwoButton);
        TwoButton.setFont(new Font("Arial",Font.PLAIN,40));

        OneButton=new JButton("1");
        OneButton.setBounds(230, 320, 80, 80);
        jf.add(OneButton);
        OneButton.addActionListener(this);
        OneButton.setFont(new Font("Arial",Font.PLAIN,40));

        dotButton=new JButton(".");
        dotButton.setBounds(30, 420, 80, 80);
        dotButton.addActionListener(this);
        jf.add(dotButton);
        dotButton.setFont(new Font("Arial",Font.PLAIN,40));

        ZeroButton=new JButton("0");
        ZeroButton.setBounds(130, 420, 80, 80);
        ZeroButton.addActionListener(this);
        jf.add(ZeroButton);
        ZeroButton.setFont(new Font("Arial",Font.PLAIN,40));

        EqualButton=new JButton("=");
        EqualButton.setBounds(230, 420, 80, 80);
        EqualButton.addActionListener(this);
        jf.add(EqualButton);
        EqualButton.setFont(new Font("Arial",Font.PLAIN,40));

        AdditionButton=new JButton("+");
        AdditionButton.setBounds(330, 120, 80, 80);
        AdditionButton.addActionListener(this);
        jf.add(AdditionButton);
        AdditionButton.setFont(new Font("Arial",Font.PLAIN,40));

        SubstractionButton=new JButton("-");
        SubstractionButton.setBounds(330, 220, 80, 80);
        SubstractionButton.addActionListener(this);
        jf.add(SubstractionButton);
        SubstractionButton.setFont(new Font("Arial",Font.PLAIN,40));

        MultiplicationButton=new JButton("*");
        MultiplicationButton.setBounds(330, 320, 80, 80);
        MultiplicationButton.addActionListener(this);
        jf.add(MultiplicationButton);
        MultiplicationButton.setFont(new Font("Arial",Font.PLAIN,40));

        DivisionnButton=new JButton("/");
        DivisionnButton.setBounds(330, 420, 80, 80);
        DivisionnButton.addActionListener(this);
        jf.add(DivisionnButton);
        DivisionnButton.setFont(new Font("Arial",Font.PLAIN,40));

        ClearButton=new JButton("CLEAR");
        ClearButton.setBounds(430, 120, 80, 80);
        ClearButton.addActionListener(this);
        jf.add(ClearButton);
        ClearButton.setFont(new Font("Arial",Font.PLAIN,13));

        DarkButton=new JButton("DARK");
        DarkButton.setBounds(430, 220, 80, 80);
        jf.add(DarkButton);
        DarkButton.addActionListener(this);
        DarkButton.setFont(new Font("Arial",Font.PLAIN,13));

        



        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==DarkButton) {
            jf.getContentPane().setBackground(Color.BLACK);
        }
        else if(e.getSource()==OneButton){
                if (isoperatorclicked) {
                    disJLabel.setText("1");
                    isoperatorclicked=false;
                    
                }
                else{

            disJLabel.setText(disJLabel.getText()+"1");
                }
        }
        else if(e.getSource()==TwoButton){
            if (isoperatorclicked) {
                    disJLabel.setText("2");
                    isoperatorclicked=false;
                }
                else{

            disJLabel.setText(disJLabel.getText()+"2");
                }
        }
        else if(e.getSource()==ThreeButton){
            if (isoperatorclicked) {
                    disJLabel.setText("3");
                    isoperatorclicked=false;
                }
                else{

            disJLabel.setText(disJLabel.getText()+"3");
                }
        }
        else if(e.getSource()==FourButton){
            if (isoperatorclicked) {
                    disJLabel.setText("4");
                    isoperatorclicked=false;
                }
                else{

            disJLabel.setText(disJLabel.getText()+"4");
                }
        }
        else if(e.getSource()==FiveButton){
            if (isoperatorclicked) {
                    disJLabel.setText("5");
                    isoperatorclicked=false;
                }
                else{

            disJLabel.setText(disJLabel.getText()+"5");
                }
        }
        else if(e.getSource()==SixButton){
            if (isoperatorclicked) {
                    disJLabel.setText("6");
                    isoperatorclicked=false;
                }
                else{

            disJLabel.setText(disJLabel.getText()+"6");
                }
        }
        else if(e.getSource()==sevenButton){
            if (isoperatorclicked) {
                    disJLabel.setText("7");
                    isoperatorclicked=false;
                }
                else{

            disJLabel.setText(disJLabel.getText()+"7");
                }
        }
        else if(e.getSource()==EightButton){
            if (isoperatorclicked) {
                    disJLabel.setText("8");
                    isoperatorclicked=false;
                }
                else{

            disJLabel.setText(disJLabel.getText()+"8");
                }
        }
        else if(e.getSource()==NineButton){
            if (isoperatorclicked) {
                    disJLabel.setText("9");
                    isoperatorclicked=false;
                }
                else{

            disJLabel.setText(disJLabel.getText()+"9");
                }
        }
        else if(e.getSource()==ZeroButton){
            if (isoperatorclicked) {
                    disJLabel.setText("0");
                    isoperatorclicked=false;
                }
                else{

            disJLabel.setText(disJLabel.getText()+"0");
                }
        }
        else if(e.getSource()==AdditionButton){
            
            isoperatorclicked=true;
            oldvalue=disJLabel.getText();
            disJLabel.setText("+");
            a=1;
        }
        else if(e.getSource()==SubstractionButton){
            isoperatorclicked=true;
            oldvalue=disJLabel.getText();
            disJLabel.setText("-");
            a=2;
        }
        else if(e.getSource()==MultiplicationButton){
            isoperatorclicked=true;
            oldvalue=disJLabel.getText();
            disJLabel.setText("*");
            a=3;
        }
        else if(e.getSource()==DivisionnButton){
            isoperatorclicked=true;
            oldvalue=disJLabel.getText();
            disJLabel.setText("/");
            a=4;
            
            
        }
        else if(e.getSource()==dotButton){
            disJLabel.setText(disJLabel.getText()+".");
        }
        else if(e.getSource()==ClearButton){
            disJLabel.setText("");
        }
        else if (e.getSource()==EqualButton) {
            
            String newValue=disJLabel.getText();
            float oldvalueF=Float.parseFloat(oldvalue);
            float newValueF=Float.parseFloat(newValue);
            float result=0;
            if(a==1){
                result=oldvalueF+newValueF;
            }
            
            else if(a==2){

                result=oldvalueF-newValueF;
            }
            else if(a==3){
                result=oldvalueF*newValueF;
            }
            else if(a==4){
                result=oldvalueF/newValueF;
            }
            disJLabel.setText(result+"");
            
        }
       
       
        
        
    }
}
