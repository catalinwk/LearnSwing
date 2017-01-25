/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learnswing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Button created with JString
 * @author Catalin Mazilu
 */

class MyFrame extends JFrame implements ActionListener {
    
    MyFrame(String title){
        super(title);
        
        //setting FlowLayout
        getContentPane().setLayout(new FlowLayout());
        
        //creating a new button
        JButton b = new JButton("Click me");
        
        add(b);
        
        //adding Action listener
        b.addActionListener(this);
        
        //displaying the window
        setVisible(true);
        
        //resizing the windows
        pack();
        
    }
    
    
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}

public class LearnSwing {

    
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        MyFrame f = new MyFrame("My first Swing Window");
    }
}
