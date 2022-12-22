/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Ismael
 */

public class hoverLabelEfect{
    
    private JLabel jlabel;

    public hoverLabelEfect(JLabel jlabel) {
        this.jlabel = jlabel;
        this.jlabel.setOpaque(true);
        this.jlabel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnteredEfect(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedEfect(evt);
            }
        });
    }
    
    private void mouseEnteredEfect(MouseEvent ev){
        this.jlabel.setBackground(new Color(230,230,230));
        this.jlabel.setHorizontalAlignment(SwingConstants.CENTER);
    }
    
    private void mouseExitedEfect(MouseEvent ev){
        this.jlabel.setBackground(Color.white);
         this.jlabel.setHorizontalAlignment(SwingConstants.LEFT);
    }
    
    
    
}
