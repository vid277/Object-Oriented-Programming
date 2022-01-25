import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This GUI converts celsius to fahrenheit
 *
 * @author (Vidyoot Senthilvenkatesh)
 * @version (11/16/2021)
 */
public class Temperature extends JFrame
{
    private JLabel celsiusLabel;
    private JLabel fahrenheitLabel;
    private JButton convertButton;
    private JTextField tempTextField;
    private JTextField fTextField;
    private JButton clear;
    private JPanel p;
    
    public Temperature()
    {
        setLayout(new FlowLayout());   
        celsiusLabel = new JLabel("Celsius");
        fahrenheitLabel = new JLabel("Fahrenheit");
        convertButton = new JButton("Convert");
        tempTextField = new JTextField(5);
        fTextField = new JTextField(5);
        p = new JPanel();
        clear = new JButton("Clear");
        
        p.add(clear);
        p.add(celsiusLabel);
        p.add(tempTextField);
        p.add(fahrenheitLabel);
        p.add(fTextField);
        p.add(convertButton);
        add(p);
        setTitle("Celsius Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        convertButton.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent avt)
            {
                int tempFarh = (int)(Double.parseDouble(tempTextField.getText())*1.8)+32;
                fTextField.setText(""+tempFarh);
            }
        });
    }
}

