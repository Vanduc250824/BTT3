package btt3;

import java.applet.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class AppletExample extends Frame implements ItemListener {

    private Checkbox cbBold;
    private Checkbox cbItalic;
    private TextField tfText;

    AppletExample()
    {
        setTitle("Applet Viewer: Demo Compoment.class");
        tfText = new TextField("Sample Text", 16);
        Font font = new Font("Courier", Font.PLAIN, 14);
        tfText.setFont(font);
        
        cbBold = new Checkbox("Bold");
        cbItalic = new Checkbox("Italic");

        add(tfText);
        add(cbBold);
        add(cbItalic);

       
        cbBold.addItemListener(this);
        cbItalic.addItemListener(this);

        setSize(352, 132);
        int width = getWidth();
        int height = getHeight();
        tfText.setBounds(width / 2 - 110 , height/ 2, 140, 20);
        cbBold.setBounds(width / 2 + 35, height/ 2, 39, 17);
        cbItalic.setBounds(width / 2 + 75, height/ 2, 39, 17);


        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        int valBold = Font.PLAIN;
        int valItalic = Font.PLAIN;
        if(cbBold.getState())
            valBold = Font.BOLD;
        if(cbItalic.getState())
            valItalic = Font.ITALIC;
        Font font = new Font("Courier", valBold + valItalic, 14);
        tfText.setFont(font);
    }
}