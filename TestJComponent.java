/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learnswing;
import javax . swing .*;
import javax . swing . border .*;
import java . awt .*;
import java . awt. event .*;


class Fereastra extends JFrame {
    public Fereastra ( String titlu ) {
            super ( titlu );
            getContentPane (). setLayout (new FlowLayout ());
            setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
            
            // Folosirea chenarelor
            Border lowered , raised ;
            TitledBorder title ;
            lowered = BorderFactory . createLoweredBevelBorder ();
            raised = BorderFactory . createRaisedBevelBorder ();
            title = BorderFactory . createTitledBorder (" Borders ");
            
            final JPanel panel = new JPanel ();
            panel . setPreferredSize (new Dimension (400 ,200) );
            panel . setBackground ( Color . blue );
            panel . setBorder ( title );
            
            getContentPane ().add( panel );
            JLabel label1 = new JLabel (" Lowered ");
            label1 . setBorder ( lowered );
            panel .add( label1 );
            
            JLabel label2 = new JLabel (" Raised ");
            label2 . setBorder ( raised );
            panel .add( label2 );
            
            // Controlul opacitatii
            JButton btn1 = new JButton (" Opaque ");
            btn1 . setOpaque ( true ); // implicit
            panel .add( btn1 );
            JButton btn2 = new JButton (" Transparent ");
            btn2 . setOpaque ( false );
            panel .add( btn2 );
            
            // ToolTips
            label1 . setToolTipText (" Eticheta coborata ");
            label2 . setToolTipText (" Eticheta ridicata ");
            btn1 . setToolTipText (" Buton opac ");

            // Textul poate fi HTML
            btn2 . setToolTipText ("<html ><b> Apasati <font color =red >F2</ font > " + " cand butonul are <u> focusul </u>");
            // Asocierea unor actiuni ( KeyBindings )
            /* Apasarea tastei F2 cand focusul este pe butonul al   doilea       va determina schimbarea culorii panelului */
            
            btn2 . getInputMap ().put( KeyStroke . getKeyStroke ("F2")," schimbaCuloare ");
            btn2 . getActionMap ().put(" schimbaCuloare ", new AbstractAction () {
                    private Color color = Color .red ;
                    public void actionPerformed ( ActionEvent e) {
                    panel . setBackground ( color );
                    color = ( color == Color . red ? Color . blue : Color .red)
                    ;
                    }
                    });
            pack ();
            }
    
}

public class TestJComponent {
    
    public static void main ( String args []) {
        new Fereastra (" Facilitati JComponent "). show ();
    }
    
}