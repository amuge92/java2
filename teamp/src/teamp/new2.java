package teamp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class new2 {
	public static void main(String[] args) {

		JFrame frm = new JFrame("���� �뿩 ���α׷�");

		// ������ ũ�� ����
		frm.setSize(568, 680);
		// �������� ȭ�� ����� ��ġ
		frm.setLocationRelativeTo(null);
		// �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���̾ƿ� ����
		frm.getContentPane().setLayout(null);

		// JLabel ����
		JLabel label10 = new JLabel("�뿩��");
		JLabel label11 = new JLabel("�ݳ���");
		JLabel label12 = new JLabel("<�뿩 ��Ȳ>");

		// <�뿩 ��Ȳ>
		JTextArea ta4 = new JTextArea();
		ta4.setText("�뿩���� ������ �ּ���.");

		// �뿩��(���ó�¥)
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		// �ݳ���(���÷κ��� 7�� ��)
		cal.add(Calendar.DAY_OF_YEAR, 7);
		Date nomal = cal.getTime();
		// �ݳ���(���÷κ��� 15�� ��)
		cal.add(Calendar.DAY_OF_YEAR, 15);
		Date max = cal.getTime();

		// �뿩�� (������)
		SpinnerDateModel model = new SpinnerDateModel(today, today, null, Calendar.DAY_OF_MONTH);
		// (ǥ���� ��¥,�ּ�,�ִ�,�ٲ� �κ�)
		JSpinner tf6 = new JSpinner(model);
		JSpinner.DateEditor editor = new JSpinner.DateEditor(tf6, "yyyy-MM-dd");
		JFormattedTextField rentday = editor.getTextField();
		rentday.setEditable(false);
		rentday.setHorizontalAlignment(JTextField.CENTER);
		tf6.setEditor(editor);

		// �ݳ����� �⺻������ ���ó�¥��+7�� �����صΰ� �뿩�ڰ� �ݳ����� +,-�Ҽ����� �ִ� 15�ϱ��� ����
		SpinnerDateModel model1 = new SpinnerDateModel(nomal, today, max, Calendar.DAY_OF_MONTH);
		JSpinner tf7 = new JSpinner(model1);
		JSpinner.DateEditor editor1 = new JSpinner.DateEditor(tf7, "yyyy-MM-dd");
		JFormattedTextField rentday1 = editor1.getTextField();
		rentday1.setEditable(true);
		rentday1.setHorizontalAlignment(JTextField.CENTER);
		tf7.setVisible(false);
		tf7.setEditor(editor1);
		frm.getContentPane().add(tf6);
		frm.getContentPane().add(tf7);

		// JButton ����
		JButton btn4 = new JButton("�뿩");// �뿩
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setEnabled(false);
				Thread t = new Thread() {
					public void run() {
						try {
							int time=(int)(Math.random()*1000)+800;
							ta4.setText("�������Դϴ�...");
							Thread.sleep(time);
							ta4.setText("��ø� ��ٷ� �ֽʽÿ�.");
							Thread.sleep(time);
							ta4.setText("<�뿩>�� �Ϸ�Ǿ����ϴ�."+"\n"+"<�ݳ���>�� �����ּ���.");
							Thread.sleep(2000);
							
							new text();
							
							
						} catch (InterruptedException e) {
							ta4.setText("�ý��� �����Դϴ�."+"\n"+"ó������ �ٽ� �������ּ���.");
						}
					}
				};
				t.start();
			}
		});
		JButton btn5 = new JButton("���");// ���
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta4.setText("<���>�Ǿ����ϴ�." + "\n" + "ó������ �ٽ� �������ּ���.");
				btn5.setEnabled(false);
			}
		});
		JButton btn3 = new JButton("OK");// �ݳ���
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta4.setText("<�뿩>�� �����ּ���.");
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn3.setEnabled(false);
			}	
		});
		JButton btn6 = new JButton("OK");// �뿩��
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf7.setVisible(true);
				btn6.setEnabled(false);
				ta4.setText("�ݳ����� �뿩�Ϸκ��� 1~15�̳��� �����մϴ�." + "\n" + "�ݳ����� �� �����ּ���.");
				btn3.setEnabled(true);
			}
		});
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		
		// JLabel ��ġ�� ũ�� ����
		label10.setBounds(240, 330, 65, 65); // �뿩��
		label11.setBounds(240, 360, 65, 65); // �ݳ���
		label12.setBounds(240, 450, 65, 65); // <�뿩 ��Ȳ>
		// JTextArea ��ġ�� ũ�� ����
		ta4.setBounds(245, 500, 270, 120); // <�뿩 ��Ȳ>
		// JTextField ��ġ�� ũ�� ����
		tf6.setBounds(280, 355, 200, 20); // �뿩��
		tf7.setBounds(280, 385, 200, 20); // �ݳ���
		// JButton ��ġ�� ũ�� ����
		btn3.setBounds(485, 385, 58, 20); // �ݳ���
		btn4.setBounds(350, 415, 58, 20); // �뿩
		btn5.setBounds(350, 445, 58, 20); // ���
		btn6.setBounds(485, 355, 58, 20); // �뿩��
		// �����ӿ��ٰ� JLabel �߰�
		frm.getContentPane().add(label10); // �뿩��
		frm.getContentPane().add(label11); // �ݳ���
		frm.getContentPane().add(label12); // <�뿩 ��Ȳ>
		// �����ӿ��ٰ� JTextField �߰�
		frm.getContentPane().add(tf6);// �뿩��
		frm.getContentPane().add(tf7);// �ݳ���
		// �����ӿ��ٰ� TextArea �߰�
		frm.getContentPane().add(ta4);// <�뿩 ��Ȳ>
		// �����ӿ��ٰ� ��ư �߰�
		frm.getContentPane().add(btn3);// �ݳ���
		frm.getContentPane().add(btn4);// �뿩
		frm.getContentPane().add(btn5);// ���
		frm.getContentPane().add(btn6);// �뿩��
		// �������� ���̵��� ����
		frm.setVisible(true);
	}

}

