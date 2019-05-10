import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JRadioButton;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Interface extends JFrame {
	private GridBagLayout layout;
	private GridBagConstraints conteiner;
	private JPanel panel;
	private Box box;
	private Box box2;
	private JPanel panel2;
	private Box box3;
	private JPanel panel3;
	private JComboBox list;
	private String[] quali = {"High","Medium","Low"};
	
	public Interface() {
		super("Printer");
		layout = new GridBagLayout();
		setLayout(layout);
		conteiner = new GridBagConstraints();
		
		JLabel label1 = new JLabel("Printer: MyPrinter");
		add(label1);
		
		JTextArea area1 = new JTextArea("",4,4);
		conteiner.fill = GridBagConstraints.HORIZONTAL;
		addComponent(area1,0,1,1,1);
		
		panel = new JPanel();
		box = new Box(3);
		JCheckBox check1 = new JCheckBox("Image");
		JCheckBox check2 = new JCheckBox("Text");
		JCheckBox check3 = new JCheckBox("Code");
		JCheckBox check4 = new JCheckBox("Print to File");
		box.add(check1);
		box.add(check2);
		box.add(check3);
		panel.add(box);
		addComponent(panel,1,1,1,1);
		
		JTextArea area2 = new JTextArea("",4,3);
		addComponent(area2,2,1,1,1);
		
		panel2 = new JPanel();
		box2 = new Box(3);
		JRadioButton Applet = new JRadioButton("Applet");
		JRadioButton Selection = new JRadioButton("Selection");
		JRadioButton All = new JRadioButton("All");		
		box2.add(Selection);
		box2.add(All);
		box2.add(Applet);
		panel2.add(box2);
		addComponent(panel2,3,1,1,1);
		
		JTextArea area3 = new JTextArea("",4,4);
		addComponent(area3,4,1,1,1);
		
		panel3 = new JPanel();
		box3 = new Box(3);
		JButton OK = new JButton("OK");
		JButton Cancel = new JButton("Cancel");
		JButton Setup = new JButton("Setup...");
		JButton Help = new JButton("Help");
		box3.add(OK);
		box3.add(Box.createRigidArea(new Dimension(30,10)));
		box3.add(Cancel);
		box3.add(Box.createRigidArea(new Dimension(0,10)));
		box3.add(Setup);
		box3.add(Box.createRigidArea(new Dimension(0,10)));
		box3.add(Help);
		panel3.add(box3);
		addComponent(box3,8,1,5,5);
		
		JLabel label2 = new JLabel("     Print Quality          ");
		addComponent(label2,0,2,5,2);
		
		list = new JComboBox(quali);
		addComponent(list,1,2,1,1);
		addComponent(check4,3,2,1,1);
		
	}

	private void addComponent(Component component, int x, int y, int w, int h) {
		conteiner.gridx = x;
		conteiner.gridy = y;
		conteiner.gridwidth = w;
		conteiner.gridheight = h;
		layout.setConstraints(component, conteiner);
		add(component);
		}
}

	public static void main(String[] args) {
		Interface teste = new Interface();
		teste.setSize(600, 200); 
		teste.setVisible(true);
		teste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

