package occ.cs272.jfcapp02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acm.graphics.GCanvas;
import acm.graphics.GImage;

import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.SystemColor;

public class JFCApp02 extends JFrame
{

    private JPanel contentPane;
    
    private JFileChooser chooser;
    private GImage img;
    private GCanvas canvas;

    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    JFCApp02 frame = new JFCApp02();
                    frame.setVisible(true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public JFCApp02()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 805, 700);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        
        canvas = new GCanvas();
        contentPane.add(canvas, BorderLayout.SOUTH);
        
        setContentPane(contentPane);
        
        
        JButton btnNewButton = new JButton("$T#wjfwi{ow$jGO{JW$HO");
        
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    img = new GImage(chooser.getSelectedFile().getAbsolutePath());
                    canvas.add(img);
                }
            }
        });
        btnNewButton.setForeground(SystemColor.controlText);
        btnNewButton.setFont(new Font("Verdana", Font.BOLD, 18));
        
        contentPane.add(btnNewButton, BorderLayout.NORTH);
        
        this.setContentPane(contentPane);
        
        chooser = new JFileChooser();
        
    }

}
