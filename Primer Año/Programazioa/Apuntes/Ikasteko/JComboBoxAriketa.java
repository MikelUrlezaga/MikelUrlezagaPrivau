import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class JComboBoxAriketa {

	private JTextField tf;
	private JComboBox combo;
	private JFrame v;

	public static void main(String[] args) {
		new JComboBoxAriketa();
	}
	
	public JComboBoxAriketa()
	{

		tf = new JTextField(20);
		
		
		combo = new JComboBox();
		combo.addItem("uno");
		combo.addItem("dos");
		combo.addItem("tres");
		

		combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(combo.getSelectedItem().toString());
			}
		});

		
		v = new JFrame();
		v.getContentPane().setLayout(new FlowLayout());
		v.getContentPane().add(combo);
		v.getContentPane().add(tf);
		v.pack();
		v.setVisible(true);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
