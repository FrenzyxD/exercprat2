import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class GridBagFrame extends JFrame {
    private GridBagLayout layout;
    private GridBagConstraints conteiner;

    public GridBagFrame() {
        super("Printer");
        layout= new GridBagLayout();
        setLayout(layout);
        conteiner = new GridBagConstraints();

        JTextArea area1 = new JTextArea("Alololo",3,10); 		//Areas de texto
        JTextArea area2 = new JTextArea("",3,4);
        JTextArea area3 = new JTextArea("",3,7);

        JCheckBox Image = new JCheckBox("Image"); 				// Checkbox
        JCheckBox Text = new JCheckBox("Text");
        JCheckBox Code = new JCheckBox("Code");
        JCheckBox Print = new JCheckBox("Print to File");

        JRadioButton Selection = new JRadioButton("Selection"); //RadioButtons
        JRadioButton All = new JRadioButton("All");
        JRadioButton Applet = new JRadioButton("Applet");

        String[] names = {"High","Medium","Low"}; 				//ComboBox
        JComboBox High = new JComboBox(names);

        JButton Ok = new JButton("Ok");							//Buttons
        JButton Cancel = new JButton("Cancel");
        JButton Setings = new JButton("Setings");
        JButton Help = new JButton("Help");

        conteiner.fill = GridBagConstraints.SOUTH;				//Add components
        addComponent(area1,3,3,0,0);

    }

    private void addComponent(Component component, int column, int row, int weight, int height) {
        conteiner.gridx = column;
        conteiner.gridy = row;									//Values of components(height,etc)
        conteiner.gridwidth = weight;
        conteiner.gridheight = height;
        layout.setConstraints(component, conteiner);
        add(component);
    }
}