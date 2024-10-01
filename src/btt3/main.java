
package btt3;

/**
 *
 * @author leduc
 */

import javax.swing.SwingUtilities;
public class main {
    public static void main(String []args)
    {
      new AppletExample();
      new AdditionOperator();
        new PrimeNumber();
        
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerimeterandArea().setVisible(true);
            }
        });
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComplexNumber().setVisible(true);
            }
        });
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ArraysAndLists().setVisible(true);
            }
        });
    }
}
