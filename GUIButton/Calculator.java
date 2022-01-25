import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Math;
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator extends JFrame
{
    private String s1;
    private String s2;

    //declare variables
    private boolean add;
    private boolean subtract;
    private boolean multiply;
    private boolean divide;
    private boolean sin1;
    private boolean cos1;
    private boolean tan1;
    private boolean pi1;
    /**
     * Constructor for objects of class Calculator
     */
    public Calculator()
    {
        //declare panel
        setLayout(new BorderLayout());
        JPanel p = new JPanel();
        JTextField f = new JTextField();
        f.setHorizontalAlignment(JTextField.RIGHT);
        add(f, BorderLayout.NORTH);
        
        //declaring each button
        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton ba = new JButton("+");
        JButton bs = new JButton("-");
        JButton bm = new JButton("x");
        JButton bd = new JButton("/");
        JButton be = new JButton("=");
        JButton sin = new JButton("sin");
        JButton cos = new JButton("cos");
        JButton tan = new JButton("tan");
        JButton pi = new JButton("pi");
        JButton period = new JButton(".");
        
        JButton clear = new JButton("clear");
        p.setLayout(new GridLayout(0, 6, 2, 2));
        
        //adding each button
        p.add(b0);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(ba);
        p.add(bs);
        p.add(be);
        p.add(bm);
        p.add(bd);
        p.add(sin);
        p.add(cos);
        p.add(tan);
        p.add(clear);
        p.add(period);
        p.add(pi);
        
        add(p, BorderLayout.CENTER);
        pack();
        setVisible(true);
        
        pi1 = false;
        //The action listners are listed below
        b1.addActionListener(
        new ActionListener()
                {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText() + "1");
            }
        });
        
        b2.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText() + "2");
            }
        });
        
        b3.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText() + "3");
            }
        });
        
        b4.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText() + "4");
            }
        });
        
        b5.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText() + "5");
            }
        });
        
        b6.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText() + "6");
            }
        });
        
        b7.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText() + "7");
            }
        });
        
        b8.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText() + "8");
            }
        });
        
        b9.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText() + "9");
            }
        });
        
               
        b0.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText() + "0");
            }
        });
        
        ba.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                s1 = f.getText();
                f.setText("");
                add = true;
            }
        });
        
        bs.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                s1 = f.getText();
                f.setText("");
                subtract = true;
            }
        });
        
        
        bm.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                s1 = f.getText();
                f.setText("");
                multiply = true;
            }
        });
        
        bd.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                s1 = f.getText();
                f.setText("");
                divide = true;
            }
        });
        
        tan.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                s1 = f.getText();
                f.setText("");
                f.setText(""+ Math.tan(Double.parseDouble(s1)));
                tan1 = true;
            }
        });
        
        cos.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                s1 = f.getText();
                f.setText("");
                f.setText(""+ Math.cos(Double.parseDouble(s1)));
                cos1 = true;
            }
        });
        
        sin.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                s1 = f.getText();
                f.setText("");
                f.setText(""+ Math.sin(Double.parseDouble(s1)));
                sin1 = true;
            }
        });
    
        period.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText() + ".");
            }
        });
        
        pi.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                s1 = f.getText();
                f.setText("");
                f.setText(""+Math.PI);
                pi1 = true;
            }
        });
        
        be.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                s2 = f.getText();
                Double a = Double.parseDouble(s1);
                Double b = Double.parseDouble(s2);
                if (add) {
                    f.setText(String.valueOf(a+b));
                }
                else if (subtract){
                    f.setText(String.valueOf(a-b));
                }
                else if(multiply){
                    f.setText(String.valueOf(a*b));
                }
                else if(divide){
                    f.setText(String.valueOf(a/b));
                }
                /*else if(tan1){
                    Math.tan(
                }
                else if(sin1){
                    
                }
                else if(cos1){
                    
                }*/
                add = false;
                subtract = false;
                multiply = false;
                divide = false;
            }
        });
        
        clear.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText("");
                s1 = "";
                s2 = "";
            }
        });
    }
}