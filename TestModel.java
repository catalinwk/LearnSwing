/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learnswing;

import javax . swing .*;
import javax.swing.event.*;

import javax.swing.ListSelectionModel;
import java . awt .*;
import java . awt. event .*;

class Fereastra2 extends JFrame implements ActionListener {
    
    String data1 [] = {" rosu ", " galben ", " albastru "};
    String data2 [] = {"red", " yellow ", " blue "};
    int tipModel = 1;
    JList lst;
    ListModel model1 , model2 ;
    
    public Fereastra2 ( String titlu ) {
            super ( titlu );
            setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
            
            // Lista initiala nu are nici un model
            lst = new JList ();
            getContentPane ().add(lst , BorderLayout . CENTER );
            
            // La apasara butonului schimbam modelul
            JButton btn = new JButton (" Schimba modelul ");
            getContentPane ().add(btn , BorderLayout . SOUTH );
            btn . addActionListener ( this );
            
            // Cream obiectele corespunzatoare celor doua modele
            model1 = new Model1 ();
            model2 = new Model2 ();
            lst . setModel ( model1 );
            
          
            
            
            
            pack ();
    }
    public void actionPerformed ( ActionEvent e) {
        if ( tipModel == 1) {
            lst . setModel ( model2 );
            tipModel = 2;
        }
        else {
            lst . setModel ( model1 );
            tipModel = 1;
    }
}
    // Clasele corespunzatoare celor doua modele
    class Model1 extends AbstractListModel {
        public int getSize () {
            return data1 . length ;
        }

        public Object getElementAt ( int index ) {
            return data1 [ index ];
        }
    }

    class Model2 extends AbstractListModel {
        public int getSize () {
            return data2 . length ;
       }
        public Object getElementAt ( int index ) {
            return data2 [ index ];
        }
    }

}


public class TestModel {
    public static void main ( String args []) {
        new Fereastra2 (" Test Model "). show ();
    }
}