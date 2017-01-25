/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learnswing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * Tests internal Frames
 * @author Catalin Mazilu
 */

class MyParentFrame extends JFrame{
    
    MyParentFrame(String title){
        super(title);
        setSize(500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MyInternalFrame f1 = new MyInternalFrame("Prima ");
        f1.setVisible(true);
        
        MyInternalFrame f2 = new MyInternalFrame("Catalin ");
        f2.setVisible(true);
        
        JDesktopPane desktop = new JDesktopPane();
        desktop.add(f1);
        desktop.add(f2);
        
        setContentPane(desktop);
        
    }
}

class MyInternalFrame extends JInternalFrame {
    //number of internal frames;
    static int n=0;
    static final int  X=30, Y=30;
    
    MyInternalFrame(String title){
        super(title + (++n),true,true,true,true);
        setLocation(X*n,Y*n);
        setSize(200,200);
        
    }
}

public class TestInternalFrame {
  
    public static void main(String[] args){
        MyParentFrame pf = new MyParentFrame("Parent");
        pf.setVisible(true);
    }
    
    
}
