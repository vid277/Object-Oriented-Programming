import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GUI extends JFrame
{   
    /**
     * Constructor for objects of class Calculator
     */
    private int clicks;
    private String[] buttons;
    public GUI()
    {
        //This is the main panel
        //Initializes the main panel
        setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(1275, 275));
        JLabel emp1 = new JLabel(" ", JLabel.CENTER);
        JLabel title = new JLabel("Please choose one", JLabel.RIGHT);
        JLabel title2 = new JLabel(" of the following: ", JLabel.LEFT);
        JLabel emp3 = new JLabel(" ", JLabel.CENTER);
        title.setFont(new Font("Serif", Font.PLAIN, 24));
        title2.setFont(new Font("Serif", Font.PLAIN, 24));
        JButton namepop = new JButton("Find increasing popularity names");
        JButton namerank = new JButton("Names that are ranked in all the decades");
        JButton onlyone = new JButton("Names that only appear in one decade ");
        JButton ranksfind = new JButton("Find out ranks for a given name");
        JButton names = new JButton("Display all names of a given rank for all decades ");
        JButton graph = new JButton("Graph");
        JButton search = new JButton("Search a name's most popular decade");
        JButton exit = new JButton("Exit");
        
        buttons = new String[7];
        
        namepop.setBackground(Color.ORANGE);
        namerank.setBackground(Color.ORANGE);
        onlyone.setBackground(Color.ORANGE);
        ranksfind.setBackground(Color.ORANGE);
        names.setBackground(Color.ORANGE);
        graph.setBackground(Color.ORANGE);
        search.setBackground(Color.ORANGE);
        exit.setBackground(Color.ORANGE);
        title.setBackground(Color.ORANGE);
        title2.setBackground(Color.ORANGE);
        
        ImageIcon icon = new ImageIcon("1417381.jpg");
        JLabel labelimg = new JLabel(icon);
        JLabel labelimg1 = new JLabel(icon);
        JLabel labelimg2 = new JLabel(icon);
        JLabel labelimg3 = new JLabel(icon);
        JLabel labelimg4 = new JLabel(icon);
        JLabel labelimg5 = new JLabel(icon);
    
        JButton clear = new JButton("clear");
        p.setLayout(new GridLayout(4, 2, 1, 1));
        
        p.add(labelimg2);
        //p.add(emp1);
        p.add(title,BorderLayout.CENTER);
        p.add(title2);
        p.add(labelimg1);
        //p.add(emp3);
        p.add(namepop);
        p.add(namerank);
        p.add(onlyone);
        p.add(ranksfind);
        p.add(names);
        p.add(graph);
        p.add(search);
        p.add(exit);
        p.add(labelimg);
        p.add(labelimg3);
        p.add(labelimg4);
        p.add(labelimg5);
        
        add(p, BorderLayout.CENTER);
        pack();
        setVisible(true);
        Names popul = new Names();
        
        p.setBackground(Color.WHITE);
        
        
        //Button 1:
        JPanel x = new JPanel();
        x.hide();
        setLayout(new BorderLayout());
        x.setPreferredSize(new Dimension(1300, 160));
        
        JTextArea textArea = new JTextArea(); 
        JScrollPane areaScrollPane = new JScrollPane(textArea);
        areaScrollPane.setVerticalScrollBarPolicy(
                        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        areaScrollPane.setPreferredSize(new Dimension(250, 250));
        textArea.setEditable(false);
        areaScrollPane.setFont(new Font("Serif", Font.PLAIN, 15));
        
        JButton back3 = new JButton("Back");
        JLabel titlepop = new JLabel("Some popular names are: ", JLabel.CENTER);
        titlepop.setFont(new Font("Serif", Font.PLAIN, 17));
        add(x, BorderLayout.SOUTH); 
        x.setLayout(new GridLayout(3, 1, 2, 10));
        
        textArea.setText(popul.popular());
        x.add(titlepop);
        x.add(areaScrollPane);
        x.add(back3);

        namepop.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                p.hide();
                p.setPreferredSize(new Dimension(1275, 275));
                
                x.show();
                
                titlepop.setHorizontalAlignment(JTextField.CENTER);
                
                add(x, BorderLayout.CENTER);
                pack();
            }
        });
        
        back3.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                x.setPreferredSize(new Dimension(1300, 135));
                x.setVisible(false);
                p.setVisible(true);
                p.setPreferredSize(new Dimension(1275, 275));
                add(p, BorderLayout.CENTER);    
                pack();
            }
        });
        
        
        //button 2
        JPanel a = new JPanel();
        a.hide();
        setLayout(new BorderLayout());
        a.setPreferredSize(new Dimension(1300, 160));
        
        JTextArea textstore = new JTextArea(5, 20); 
        JScrollPane scrolling = new JScrollPane(textstore);
        areaScrollPane.setVerticalScrollBarPolicy(
                        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrolling.setPreferredSize(new Dimension(250, 250));
        textstore.setEditable(false);
        scrolling.setFont(new Font("Serif", Font.PLAIN, 15));
        
        JButton back4 = new JButton("Back");
        JLabel titlerank = new JLabel("Names that are ranked in all decades: ", JLabel.CENTER);
        titlerank.setFont(new Font("Serif", Font.PLAIN, 17));
        add(a, BorderLayout.SOUTH); 
        a.setLayout(new GridLayout(3, 1, 2, 10));
        
        textstore.setText(popul.rankall());
        a.add(titlerank);
        a.add(scrolling);
        a.add(back4);
        
        namerank.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {  
                p.hide();
                p.setPreferredSize(new Dimension(1275, 275));
                
                a.show();
                
                titlerank.setHorizontalAlignment(JTextField.CENTER);
                
                add(a, BorderLayout.CENTER);
                pack();
            }
        });
        
        back4.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                a.setPreferredSize(new Dimension(1300, 135));
                a.setVisible(false);
                p.setVisible(true);
                p.setPreferredSize(new Dimension(1275, 275));
                add(p, BorderLayout.CENTER);    
                pack();
            }
        });
        
        
        JPanel d = new JPanel();
        d.hide();
        setLayout(new BorderLayout());
        d.setPreferredSize(new Dimension(1300, 160));
        
        JTextArea textmore = new JTextArea(5, 20); 
        JScrollPane scroll = new JScrollPane(textmore);
        areaScrollPane.setVerticalScrollBarPolicy(
                        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setPreferredSize(new Dimension(250, 250));
        textmore.setEditable(false);
        scroll.setFont(new Font("Serif", Font.PLAIN, 15));
        
        JButton back5 = new JButton("Back");
        JLabel titlerank1 = new JLabel("Names that are ranked in only one decade: ", JLabel.CENTER);
        titlerank1.setFont(new Font("Serif", Font.PLAIN, 17));
        add(d, BorderLayout.SOUTH); 
        d.setLayout(new GridLayout(3, 1, 2, 10));
        
        textmore.setText(popul.appearone());
        d.add(titlerank1);
        d.add(scroll);
        d.add(back5);
        
        onlyone.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                p.hide();
                p.setPreferredSize(new Dimension(1275, 275));
                
                d.show();
                
                titlerank.setHorizontalAlignment(JTextField.CENTER);
                
                add(d, BorderLayout.CENTER);
                pack();
            }
        });
        
        back5.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                d.setPreferredSize(new Dimension(1300, 135));
                d.setVisible(false);
                p.setVisible(true);
                p.setPreferredSize(new Dimension(1275, 275));
                add(p, BorderLayout.CENTER);    
                pack();
            }
        });
        
        
        //Initialize button 3
        JButton searchbut = new JButton("Search");
        setLayout(new BorderLayout());
        JPanel e = new JPanel();
        e.hide();
        JTextField inp2 = new JTextField(JTextField.CENTER);
        inp2.setFont(new Font("Serif", Font.PLAIN, 16));
        JButton back6 = new JButton("Back");
        JLabel title3 = new JLabel("Please input a rank (Integer 1 - 1000)", JLabel.CENTER);
        JLabel poplabel1 = new JLabel("Names that correspond to that rank: ", JLabel.CENTER);
        title3.setFont(new Font("Serif", Font.PLAIN, 16));
        poplabel1.setFont(new Font("Serif", Font.PLAIN, 16));
        e.setPreferredSize(new Dimension(1300, 135));
        add(e, BorderLayout.SOUTH);               
        e.setLayout(new GridLayout(3, 2, 2, 10));
        JTextArea store = new JTextArea(5, 20); 
        JScrollPane scrolls = new JScrollPane(store);
        areaScrollPane.setVerticalScrollBarPolicy(
                        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrolls.setPreferredSize(new Dimension(250, 250));
        store.setEditable(false);
        scrolls.setFont(new Font("Serif", Font.PLAIN, 15));
        
        e.add(title3);
        e.add(inp2);
        e.add(poplabel1);
        e.add(scrolls);
        e.add(back6);
        e.add(searchbut);
        
        names.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                p.hide();
                p.setPreferredSize(new Dimension(1275, 275));
                
                e.show();
                inp2.setHorizontalAlignment(JTextField.CENTER);
                
                add(e, BorderLayout.CENTER);
                pack(); 
            }
        });
        
         
        searchbut.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                int namecho = Integer.parseInt(inp2.getText());
                store.setText(("" + popul.findrank(namecho)));
            }
        });
        
        back6.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                e.setPreferredSize(new Dimension(1300, 135));
                inp2.setText("");
                store.setText("");
                e.setVisible(false);
                p.setVisible(true);
                p.setPreferredSize(new Dimension(1275, 275));
                add(p, BorderLayout.CENTER);    
                pack();
            }
        });
        
        
        //Initialize button 2
        JButton searchhigh = new JButton("Search");
        setLayout(new BorderLayout());
        JPanel r = new JPanel();
        r.hide();
        JTextField inp3 = new JTextField(JTextField.CENTER);
        inp3.setFont(new Font("Serif", Font.PLAIN, 16));
        JButton back7 = new JButton("Back");
        JLabel title4 = new JLabel("Please input a name (Words, not numbers):", JLabel.CENTER);
        JLabel poplabel2 = new JLabel("Highest rank for the given name is: ", JLabel.CENTER);
        title4.setFont(new Font("Serif", Font.PLAIN, 16));
        poplabel2.setFont(new Font("Serif", Font.PLAIN, 16));
        r.setPreferredSize(new Dimension(1300, 135));
        add(r, BorderLayout.SOUTH);               
        r.setLayout(new GridLayout(3, 2, 2, 10));
        JLabel rank = new JLabel("", JLabel.CENTER);
        
        r.add(title4);
        r.add(inp3);
        r.add(poplabel2);
        r.add(rank);
        r.add(back7);
        r.add(searchhigh);
        
        search.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                p.hide();
                p.setPreferredSize(new Dimension(1275, 275));
                
                r.show();
                inp3.setHorizontalAlignment(JTextField.CENTER);
                
                add(r, BorderLayout.CENTER);
                pack();
            }
        });
        
        searchhigh.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                String namecho = inp3.getText();
                rank.setText(("" + popul.highestrank(namecho)));
                rank.setHorizontalAlignment(JTextField.LEFT);
            }
        });
        
        back7.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                r.setPreferredSize(new Dimension(1300, 135));
                inp3.setText("");
                rank.setText("");
                r.setVisible(false);
                p.setVisible(true);
                p.setPreferredSize(new Dimension(1275, 275));
                add(p, BorderLayout.CENTER);    
                pack();
            }
        });
                
        
        
        //Button for panelj or to plot
        JPanel j = new JPanel();
        j.hide();
        JButton b2 = new JButton("Graph");
        setLayout(new BorderLayout());
        j.setPreferredSize(new Dimension(1300, 135));
        //p.hide();
        JTextField inp1 = new JTextField(JTextField.CENTER);
        inp1.setFont(new Font("Serif", Font.PLAIN, 17));
        JButton back2 = new JButton("Back");
        JLabel titleplot = new JLabel(" Please input a name: ", JLabel.CENTER);
        titleplot.setFont(new Font("Serif", Font.PLAIN, 16));
        add(j, BorderLayout.SOUTH);               
        j.setLayout(new GridLayout(2, 1, 2, 10));
        j.add(titleplot);
        j.add(inp1);
        j.add(back2);
        j.add(b2);
        
        graph.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                p.hide();
                p.setPreferredSize(new Dimension(1275, 275));
                
                j.show();
                
                titleplot.setHorizontalAlignment(JTextField.CENTER);
                
                add(j, BorderLayout.CENTER);
                pack(); 
            }
        });
        
        Names graph1 = new Names();    
        b2.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                String nameinput = inp1.getText();
                graph1.plot(nameinput);
            }
        });
        
        back2.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                j.setPreferredSize(new Dimension(1300, 135));
                inp1.setText("");
                j.setVisible(false);
                p.setVisible(true);
                p.setPreferredSize(new Dimension(1275, 275));
                add(p, BorderLayout.CENTER);    
                pack();
            }
        });
        
        
        
        //Button for Search
        JButton b1 = new JButton("Search");
        setLayout(new BorderLayout());
        JPanel f = new JPanel();
        f.hide();
        JTextField pan = new JTextField(JTextField.CENTER);
        pan.setFont(new Font("Serif", Font.PLAIN, 16));
        JButton back1 = new JButton("Back");
        JLabel title1 = new JLabel(" Please input a name (Words, not numbers): ", JLabel.CENTER);
        JLabel poplabel = new JLabel("Name Popularity: ", JLabel.CENTER);
        JLabel namedis = new JLabel( "", JLabel.LEFT);
        title1.setFont(new Font("Serif", Font.PLAIN, 16));
        poplabel.setFont(new Font("Serif", Font.PLAIN, 16));
        namedis.setFont(new Font("Serif", Font.PLAIN, 16));
        f.setPreferredSize(new Dimension(1300, 135));
        add(f, BorderLayout.SOUTH);               
        f.setLayout(new GridLayout(3, 2, 2, 10));
        f.add(title1);
        f.add(pan);
        f.add(poplabel);
        f.add(namedis);
        f.add(back1);
        f.add(b1);
                
        ranksfind.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                p.hide();
                p.setPreferredSize(new Dimension(1275, 275));
                
                f.show();
                pan.setHorizontalAlignment(JTextField.CENTER);
                
                add(f, BorderLayout.CENTER);
                pack();
            }            
        });
         
        Names mes = new Names();    
        b1.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                String namecho = pan.getText();
                namedis.setText(("" + mes.search(namecho)));
                namedis.setHorizontalAlignment(JTextField.LEFT);
            }
        });
        
        back1.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setPreferredSize(new Dimension(1300, 135));
                pan.setText("");
                namedis.setText("");
                f.setVisible(false);
                p.setVisible(true);
                p.setPreferredSize(new Dimension(1275, 275));
                add(p, BorderLayout.CENTER);    
                pack();
            }
        });
        
        
        //Button for exit
        clicks = 0;
        exit.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                clicks+=1;
                if (clicks == 2){
                    System.exit(0);
                }
                else if (clicks == 1){
                    exit.setText("Confirm?");
                    title.setText("Thank");
                    title2.setText(" You!");
                }
            }
        });
    }
}