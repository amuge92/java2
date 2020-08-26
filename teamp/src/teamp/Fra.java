package teamp;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.JOptionPane;

/*
 ��� ����: ���� å �뿩 �뿩?
�̵����: <�������>, 
�̵������:<�˻�â>, <�Ű���û>, <�帣>(���� ��ư)
Ǫ�Ϳ���: <�뿩���>
Ǫ�Ϳ�����: <�뿩����>,<�ݳ���>, 
         <�뿩>, <���>
                   ��
                   
����
����
������
������ȣ
���ǻ�
åID
�ٰŸ�

����߰�(��ư) �뿩��(��ư)
 */

class Fra extends JFrame {
	public static void main(String[] args) {
		new Fra();

	}

	Fra() {
		HashMap<Integer, Book> mh = new HashMap<Integer, Book>();
		Book bk = new Book(1, "�ҳ���", "Ȳ����", "�Ѻ�����",
				"���� �Ҽ��� Ȳ���� ������ �Ҽ��� ��� �ʱ� ��ǰ"
						+ " �� ���ϴ� ������ ����� �Ҽ��� <�ҳ���>, <����>, <������>, <��>, <�۾���> �� 5���� ������ ��ȭ�� �Բ� �Ǿ���.",
				"C:\\Users\\Lee\\Desktop\\1.jpg", 1);
		mh.put(bk.book_id, bk);
		Book bk2 = new Book(2, "19��", "Ȳ����", "���Ǵ�", "��� �ǰ����", "C:\\Users\\Lee\\Desktop\\2.jpg", 1);
		mh.put(bk2.book_id, bk2);
		Book bk3 = new Book(3, "JAVA", "������", "�ֵ���ũ", "�����", "C:\\Users\\Lee\\Desktop\\bono.jpg", 4);
		mh.put(bk3.book_id, bk3);
		Book bk4 = new Book(4, "C", "Ȳ����", "���Ǵ�", "��� �ǰ����", "C:\\Users\\Lee\\Desktop\\no1.jpg", 3);
		mh.put(bk4.book_id, bk4);
		Book bk5 = new Book(5, "������", "Ȳ����", "���Ǵ�", "��� �ǰ����", "C:\\Users\\Lee\\Desktop\\no1.jpg", 2);
		mh.put(bk5.book_id, bk5);

		JFrame frm = new JFrame("���� �뿩 ���α׷�");
		Container c = frm.getContentPane();
		c.setBackground(new Color(244, 164, 96));
		// ������ ũ�� ����
		frm.setSize(568, 680);

		// �������� ȭ�� ����� ��ġ
		frm.setLocationRelativeTo(null);

		// �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ���̾ƿ� ����
		frm.getContentPane().setLayout(null);

		// JLabel ����
		JLabel label1 = new JLabel("���� å �뿩 �뿩?");
		JLabel label2 = new JLabel("�˻�");
		JLabel label3 = new JLabel("�帣");
		JLabel label4 = new JLabel("�̸�");
		JLabel label5 = new JLabel("����");
		JLabel label6 = new JLabel("�ּ�");
		JLabel label7 = new JLabel("����ó");
		JLabel label8 = new JLabel("<�Ű� ��û>");
		JLabel label9 = new JLabel("<�뿩 ���>");
		JLabel label10 = new JLabel("�뿩��");
		JLabel label11 = new JLabel("�ݳ���");
		JLabel label12 = new JLabel("<�뿩 ��Ȳ>");

		// JTextArea ����
		JTextArea ta1 = new JTextArea();// ���� ���
		JTextArea ta2 = new JTextArea();// <�Ű� ��û>
		JTextArea ta3 = new JTextArea();// <�뿩 ���>
		ta3.setEditable(false);
		JTextArea ta4 = new JTextArea();// <�뿩 ��Ȳ>
		ta4.setText("�뿩���� ������ �ּ���.");

		// �뿩��(���ó�¥)
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		// �ݳ���(���÷κ��� 7�� ��)
		cal.add(Calendar.DAY_OF_YEAR, 7);
		Date nomal = cal.getTime();
		cal.add(Calendar.DAY_OF_YEAR, 15);
		Date max = cal.getTime();

		// �뿩�� (���� �����ϸ� �ݳ��ϵ� ���� ������Ű�� ���� �� ã�Ƽ� �����ȵǰ� ���ص�)
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

		// JTextField ����
		JTextField tf1 = new JTextField(); // �˻�
		tf1.setText("���� �˻�");// �⺻ �Է� �� ����
		tf1.setEnabled(true);
		JTextField tf2 = new JTextField(); // �̸�
		JTextField tf3 = new JTextField(); // ����
		JTextField tf4 = new JTextField(); // �ּ�
		JTextField tf5 = new JTextField(); // ����ó
//		JTextField tf6 = new JTextField(); // �뿩��
//		JTextField tf7 = new JTextField(); // �ݳ���

		// JButton ����
		JButton btn1 = new JButton("OK");// �˻�
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = "";
				if (tf1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�˻�� �Է��ϼž� �մϴ�", "ERROR", JOptionPane.INFORMATION_MESSAGE);
				}

				for (int n = 1; n < mh.size(); n++) {
					if (mh.get(n).book_name.contains(tf1.getText())) {
						str += mh.get(n).book_name;
						System.out.println();
					}
				}
				ta4.setText(str);

			}
		});

		JButton btn2 = new JButton("OK");// ����ó

		JButton btn3 = new JButton("OK");// �ݳ���
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta4.setText("<�뿩>�� �����ּ���.");
				btn3.setEnabled(false);
			}
		});
//�뿩 ��ư 
		JButton btn4 = new JButton("�뿩");// �뿩
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tf2.getText().equals("") || tf3.getText().equals("") || tf4.getText().equals("")
						|| tf5.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�ʼ� �Է�ĭ�� ����ֽ��ϴ�.", "�˸�", JOptionPane.PLAIN_MESSAGE);

				} else {
					btn4.setEnabled(false);
					Thread t = new Thread() {
						public void run() {
							try {
								int time = (int) (Math.random() * 1000) + 800;
								ta4.setText("�������Դϴ�...");
								Thread.sleep(time);
								ta4.setText("��ø� ��ٷ� �ֽʽÿ�.");
								Thread.sleep(time);
								ta4.setText("<�뿩>�� �Ϸ�Ǿ����ϴ�." + "\n" + "<�ݳ���>�� �����ּ���.");
								Thread.sleep(2000);

								new text();
								frm.dispose();
							} catch (InterruptedException e) {
								ta4.setText("�ý��� �����Դϴ�." + "\n" + "ó������ �ٽ� �������ּ���.");
							}
						}
					};
					t.start();
				}
			}
		});

		JButton btn6 = new JButton("OK");// �뿩��
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btn6.setEnabled(false);
				tf7.setVisible(true);
				ta4.setText("�ݳ����� �뿩�Ϸκ��� 1~15�̳��� �����մϴ�." + "\n" + "�ݳ����� �� �����ּ���.");

			}
		});

		JButton btn5 = new JButton("���");// ���
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta4.setText("<���>�Ǿ����ϴ�." + "\n" + "ó������ �ٽ� �������ּ���.");

				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn6.setEnabled(true);
			}
		});

		JButton btn7 = new JButton("OK");// �ּ�

		// �г� ����
		JPanel jp1 = new JPanel();
		jp1.setBackground(new Color(240, 248, 255));
		// JRadioButton ����
		JRadioButton rb1 = new JRadioButton("�Ҽ�");
		JRadioButton rb2 = new JRadioButton("����");
		JRadioButton rb3 = new JRadioButton("��");

		// rb1 ������ư �������ֵ���
		rb1.setSelected(true);

		// ���� ��ư�� �׷�ȭ �ϱ� ���� ��ü ����
		ButtonGroup bg = new ButtonGroup();

		// �׷쿡 ���� ��ư�� ���Խ�Ų��.
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);

		// JLabel ��ġ�� ũ�� ����
		label1.setBounds(225, 0, 150, 50); // ���� å �뿩 �뿩?
		label2.setBounds(240, 30, 100, 50); // �˻�
		label3.setBounds(240, 60, 100, 50); // �帣
		label4.setBounds(240, 90, 100, 50); // �̸�
		label5.setBounds(240, 120, 100, 50); // ����
		label6.setBounds(240, 150, 100, 50); // �ּ�
		label7.setBounds(240, 180, 100, 50); // ����ó
		label8.setBounds(240, 210, 100, 50); // <�Ű� ��û>
		label9.setBounds(10, 300, 65, 65); // <�뿩 ���>
		label10.setBounds(240, 330, 65, 65); // �뿩��
		label11.setBounds(240, 360, 65, 65); // �ݳ���
		label12.setBounds(240, 450, 65, 65); // <�뿩 ��Ȳ>

		// JTextArea ��ġ�� ũ�� ����

		ta2.setBounds(245, 250, 270, 60); // <�Ű� ��û>
		ta3.setBounds(10, 350, 220, 270); // <�뿩 ���>
		ta4.setBounds(245, 500, 270, 120); // <�뿩 ��Ȳ>

		// JTextField ��ġ�� ũ�� ����
		tf1.setBounds(270, 45, 200, 20); // �˻�
		tf2.setBounds(270, 105, 80, 20); // �̸�
		tf3.setBounds(270, 135, 80, 20); // ����
		tf4.setBounds(270, 165, 210, 20); // �ּ�
		tf5.setBounds(280, 195, 200, 20); // ����ó
		tf6.setBounds(280, 355, 200, 20); // �뿩��
		tf7.setBounds(280, 385, 200, 20); // �ݳ���

		// JButton ��ġ�� ũ�� ����
		btn1.setBounds(475, 45, 58, 20); // �˻�
		btn2.setBounds(485, 195, 58, 20); // ����ó
		btn3.setBounds(485, 385, 58, 20); // �ݳ���
		btn4.setBounds(280, 415, 88, 50); // �뿩
		btn5.setBounds(400, 415, 88, 50); // ���
		btn6.setBounds(485, 355, 58, 20); // �뿩��
		btn7.setBounds(485, 165, 58, 20); // �ּ�

		// JRadioButton ��ġ�� ũ�� ����
		rb1.setBounds(265, 70, 49, 30); // �Ҽ�
		rb2.setBounds(315, 70, 49, 30); // ����
		rb3.setBounds(365, 70, 49, 30); // ��

		// �г� ��ġ ũ�� �׵θ�
		LineBorder lb = new LineBorder(new Color(255, 182, 193));
		jp1.setBounds(10, 40, 220, 270); // ���� ���
		jp1.setLayout(new GridLayout(10, 1));
		for (int i = 1; i <= mh.size(); i++) {
			JLabel j = new JLabel();
			Book b = mh.get(i);
			JButton jbt = new JButton("O");
			jbt.setBounds(194, 0, 25, 25);
			JOptionPane jop = new JOptionPane();
			jbt.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int a = jop.showConfirmDialog(null, "�뿩 ��Ͽ� �߰� �մϴ�.", "Ȯ��", JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.INFORMATION_MESSAGE);
					if (a == 0) {
						ta3.setText(ta3.getText() + b.getBook_name() + " (" + b.getWriter() + ") " + "["
								+ b.getPublisher() + "]" + "\n");
						jbt.setEnabled(false);
					}
				}
			});

			j.setBorder(lb);
			j.setText(b.getBook_name() + " (" + b.getWriter() + ") " + "[" + b.getPublisher() + "]");
			j.setToolTipText(b.book_story);
			j.addMouseListener(new Lo(b));
			j.addMouseListener(new MouseAdapter() {
				public void mouseExited(MouseEvent e) {
					j.setForeground(Color.black);
				}

				public void mouseEntered(MouseEvent e) {
					j.setForeground(Color.blue);
				}
			});
			jp1.add(j);
			j.add(jbt);
		}
		// JTextArea ����
		ta1.setToolTipText("���� ���");

		// �����ӿ��ٰ� JLabel �߰�
		frm.getContentPane().add(label1); // ���� å �뿩 �뿩?
		frm.getContentPane().add(label2); // �˻�
		frm.getContentPane().add(label3); // �帣
		frm.getContentPane().add(label4); // �̸�
		frm.getContentPane().add(label5); // ����
		frm.getContentPane().add(label6); // �ּ�
		frm.getContentPane().add(label7); // ����ó
		frm.getContentPane().add(label8); // <�Ű� ��û>
		frm.getContentPane().add(label9); // <�뿩 ���>
		frm.getContentPane().add(label10); // �뿩��
		frm.getContentPane().add(label11); // �ݳ���
		frm.getContentPane().add(label12); // <�뿩 ��Ȳ>

		// �����ӿ��ٰ� JTextField �߰�
		frm.getContentPane().add(tf1);// �˻�
		frm.getContentPane().add(tf2);// �̸�
		frm.getContentPane().add(tf3);// ����
		frm.getContentPane().add(tf4);// �ּ�
		frm.getContentPane().add(tf5);// ����ó
		frm.getContentPane().add(tf6);// �뿩��
		frm.getContentPane().add(tf7);// �ݳ���

		// �����ӿ��ٰ� TextArea �߰�
		frm.getContentPane().add(ta1);// ���� ���
		frm.getContentPane().add(ta2);// <�Ű� ��û>
		frm.getContentPane().add(ta3);// <�뿩 ���>
		frm.getContentPane().add(ta4);// <�뿩 ��Ȳ>

		// �����ӿ��ٰ� ��ư �߰�
		frm.getContentPane().add(btn1);// �˻�
		frm.getContentPane().add(btn2);// ����ó
		frm.getContentPane().add(btn3);// �ݳ���
		frm.getContentPane().add(btn4);// �뿩
		frm.getContentPane().add(btn5);// ���
		frm.getContentPane().add(btn6);// �뿩��
		frm.getContentPane().add(btn7);// �ּ�

		// �����ӿ��ٰ� JRadioButton �߰�
		frm.getContentPane().add(rb1);
		frm.getContentPane().add(rb2);
		frm.getContentPane().add(rb3);

		// �г� �߰�

		frm.add(jp1);
		// �������� ���̵��� ����
		frm.setVisible(true);
	}
}