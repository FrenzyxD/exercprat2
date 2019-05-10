import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.*;

public class ShowColors2JFrame extends JFrame {
    private JButton changeColorJButton;
    private JButton colorJButton;
    private JButton okJButton;
    private JButton cancelJButton;
    private JButton plusJButton;
    private JButton minusJButton;
    private JButton eraseJButton;
    private Color color = Color.LIGHT_GRAY;
    private JPanel colorJPanel;
    private JPanel ButtonsWest;
    private JPanel ButtonsNorth;
    private JPanel Maxmin;


    public ShowColors2JFrame() {
        super("Usando JColorChooser");
        colorJPanel = new JPanel();
        colorJPanel.setBackground(color);

        PaintPanel paintPanel = new PaintPanel();
        paintPanel.setBackground(Color.WHITE);

        ButtonsNorth = new JPanel();
        ButtonsNorth.setBackground(color);
        plusJButton = new JButton("+");
        plusJButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        paintPanel.plusComponent();
                    }
                }
        );

        minusJButton = new JButton("-");
        minusJButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        paintPanel.minusComponent();
                    }
                }
        );

        eraseJButton = new JButton("Erase");
        eraseJButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        paintPanel.eraseButton();
                    }
                }
        );

        ButtonsWest = new JPanel();
        ButtonsWest.setBackground(color);
        ButtonsWest.setLayout(new BoxLayout(ButtonsWest, BoxLayout.Y_AXIS));


        colorJButton = new JButton("   Cor   ");
        colorJButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        color = JColorChooser.showDialog(ShowColors2JFrame.this, "Escolhe uma cor", color);
                        if (color == null)
                            color = Color.LIGHT_GRAY;
                        colorJPanel.setBackground(color);
                        ButtonsWest.setBackground(color);
                        ButtonsNorth.setBackground(color);
                    }
                }
        );

        okJButton = new JButton("    OK   ");
        okJButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        paintPanel.okButton(color);
                    }
                }
        );

        cancelJButton = new JButton("Cancel");
        cancelJButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        color = Color.LIGHT_GRAY;
                        colorJPanel.setBackground(color);
                        ButtonsWest.setBackground(color);
                        ButtonsNorth.setBackground(color);
                    }
                }
        );

        ButtonsNorth.add(plusJButton, BorderLayout.NORTH);
        ButtonsNorth.add(minusJButton, BorderLayout.NORTH);
        ButtonsNorth.add(eraseJButton, BorderLayout.NORTH);

        ButtonsWest.add(okJButton);
        ButtonsWest.add(cancelJButton);
        ButtonsWest.add(colorJButton);

        add(paintPanel, BorderLayout.CENTER);
        add(ButtonsNorth, BorderLayout.NORTH);
        add(ButtonsWest, BorderLayout.WEST);
        add(colorJPanel, BorderLayout.EAST);
        setSize(600, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        ShowColors2JFrame application = new ShowColors2JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}