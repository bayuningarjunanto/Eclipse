import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class bebas extends JFrame {

	private JPanel contentPane;
	private JTextField Angka1;
	private JTextField Angka2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bebas frame = new bebas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public bebas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Angka1");
		label.setBounds(46, 38, 46, 14);
		contentPane.add(label);
		
		Angka1 = new JTextField();
		Angka1.setBounds(114, 35, 86, 20);
		contentPane.add(Angka1);
		Angka1.setColumns(10);
		
		Angka2 = new JTextField();
		Angka2.setBounds(114, 83, 86, 20);
		contentPane.add(Angka2);
		Angka2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Angka2");
		lblNewLabel.setBounds(46, 86, 46, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton tambah = new JRadioButton("Tambah");
		buttonGroup.add(tambah);
		tambah.setBounds(41, 123, 109, 23);
		contentPane.add(tambah);
		
		JRadioButton kali = new JRadioButton("Kali");
		buttonGroup.add(kali);
		kali.setBounds(41, 161, 109, 23);
		contentPane.add(kali);
		
		JRadioButton kurang = new JRadioButton("Kurang");
		buttonGroup.add(kurang);
		kurang.setBounds(191, 123, 109, 23);
		contentPane.add(kurang);
		
		JRadioButton bagi = new JRadioButton("Bagi");
		buttonGroup.add(bagi);
		bagi.setBounds(191, 161, 109, 23);
		contentPane.add(bagi);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String angka11 = Angka1.getText();
				String angka22 = Angka2.getText();
				int angka111 = Integer.parseInt(angka11);
				int angka222 = Integer.parseInt(angka22);
				int nilai;
				String keterangan;
				
				if(tambah.isSelected()){
					nilai = angka111 + angka222;
					keterangan = "tambah";
				}else if(kurang.isSelected()){
					nilai = angka111 - angka222;
					keterangan = "kurang";
				}else if(kali.isSelected()){
					nilai = angka111 * angka222;
					keterangan = "kali";
				}else{
					nilai = angka111 / angka222;
					keterangan = "bagi";
				}
				JOptionPane.showMessageDialog(null, angka11 + " " + keterangan + " " + angka22 + " " + nilai);
			}
		});
		btnNewButton.setBounds(111, 197, 89, 23);
		contentPane.add(btnNewButton);
	}
}
