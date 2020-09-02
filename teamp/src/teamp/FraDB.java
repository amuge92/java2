package teamp;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.JOptionPane;

class FraDB extends JFrame {
	int cx = 1;
	int i = 0;
	int n = 1;

	ImageIcon img1 = new ImageIcon("C:\\Users\\Lee\\Desktop\\������.jpg");
	JLabel jim;

	PreparedStatement savenew = null;
	PreparedStatement savebor = null;
	Connection conn = null; // DB�� �����ϴ� �������̽�

	public static void main(String[] args) throws SQLException {
		new FraDB();

	}

	FraDB() throws SQLException {
		String name[] = new String[20];
		String phone1[] = new String[20]; // ����ó ��� 4�ڸ�
		String phone2[] = new String[20]; // ����ó ������ 4�ڸ�

		PreparedStatement pstm = null; // sql�� ��ü
		ResultSet r = null;// sql�� ���� ��ȯ
		HashMap<Integer, Book> mh = new HashMap<Integer, Book>();
		try {
			String que = "select * from book_list";
			conn = DB.get();
			pstm = conn.prepareStatement(que);
			r = pstm.executeQuery();

			while (r.next()) {
				String s_bookname = r.getString(1);
				String s_publisher = r.getString(2);
				String s_writer = r.getString(3);
				String a_plot = r.getString(4);
				int b_id = r.getInt(5);
				String b_img = r.getString(6);
				String genre = r.getString(7);
				Book dbbook = new Book(b_id, s_bookname, s_writer, s_publisher, a_plot, b_img, genre);
				mh.put(b_id, dbbook);
			}

		} catch (SQLException e) {
			System.out.println("���ܹ߻�");
			e.printStackTrace();
		}
		r.close();
//		pstm.close();
		JFrame frm = new JFrame("���� �뿩 ���α׷�");
		Container c = frm.getContentPane();
		c.setBackground(new Color(244, 164, 96));
		// ������ ũ�� ����
		frm.setSize(568, 820);

		// �������� ȭ�� ����� ��ġ
		frm.setLocationRelativeTo(null);

		// �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ���̾ƿ� ����
		frm.getContentPane().setLayout(null);

		// JLabel ����
		JLabel label1 = new JLabel("���� å �뿩 �뿩?");
		JLabel label2 = new JLabel("�˻�");
		JLabel label3 = new JLabel("�̸�");
		JLabel label4 = new JLabel("�������");
		JLabel label5 = new JLabel("�ּ�");
		JLabel label6 = new JLabel("����ó");
		JLabel label8 = new JLabel("<�Ű� ��û>");
		JLabel label9 = new JLabel("<�뿩 ���>");
		JLabel label10 = new JLabel("�뿩��");
		JLabel label11 = new JLabel("�ݳ���");
		JLabel label12 = new JLabel("<�뿩 ��Ȳ>");
		JLabel label13 = new JLabel("���� �̸�");
		JLabel label14 = new JLabel("���ǻ�");
		JLabel label15 = new JLabel("�۰�");
		JLabel label16 = new JLabel("��");
		JLabel label17 = new JLabel("��");
		JLabel label18 = new JLabel("��");
		JLabel label19 = new JLabel("-");// ����ó ù��° -
		JLabel label20 = new JLabel("-");// ����ó �ι�° -

		// JComboBox ����
		String[] year = { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000" };
		JComboBox box1 = new JComboBox(year);

		String[] month = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
		JComboBox box2 = new JComboBox(month);

		String[] day = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
				"18", "18", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
		JComboBox box3 = new JComboBox(day);

		String[] city = { "����Ư����", "�λ걤����", "�뱸������", "��õ������", "���ֱ�����", "����������", "��걤����", "����Ư����ġ��", "����Ư����ġ��", "������",
				"����", "���ν�", "������", "ȭ����", "��õ��", "�����ֽ�", "�Ȼ��", "�Ⱦ��", "���ý�", "�����", "���ֽ�", "�����ν�", "������", "���ֽ�",
				"�����", "�ϳ���", "������", "�����", "���ֽ�", "��õ��", "������", "�ȼ���", "�ǿս�", "��õ��", "����", "���ֽ�", "����õ��", "����",
				"��õ��", "��õ��", "��õ��", "���ֽ�", "������", "���ؽ�", "�¹��", "���ʽ�", "��ô��", "ȫõ��", "Ⱦ����", "������", "��â��", "������", "ö����",
				"ȭõ��", "�籸��", "������", "����", "��籺", "û�ֽ�", "���ֽ�", "��õ��", "������", "��õ��", "������", "����", "��õ��", "���걺", "������",
				"�ܾ籺", "õ�Ƚ�", "���ֽ�", "���ɽ�", "�ƻ��", "�����", "����", "����", "������", "�ݻ걺", "�ο���", "��õ��", "û�籺", "ȫ����", "���걺",
				"�¾ȱ�", "���ֽ�", "�ͻ��", "�����", "������", "������", "������", "���ֱ�", "��â��", "�ξȱ�", "�ӽǱ�", "��â��", "���ȱ�", "���ֱ�", "�����",
				"������", "���ȱ�", "���ֱ�", "ȭ����", "���", "��籺", "������", "���ֱ�", "����", "������", "���ֱ�", "���籺", "���ﱺ", "������", "������",
				"�س���", "�强��", "���ʱ�", "���ﱺ", "�ϵ���", "������", "��õ��", "���ϱ�", "�뱸��", "�޼���", "��걺", "��õ��", "���ֱ�", "���ϱ�", "������",
				"���籺", "û�۱�", "�ȵ���", "�Ǽ���", "������", "ĥ�", "��õ��", "��õ��", "���ֱ�", "��õ��", "���ֱ�", "��ȭ��", "���決", "���ֱ�", "��ɱ�",
				"û����", "���걺", "�ﵵ��", "�λ��", "�����", "��걺", "������", "â�籺", "��õ��", "�ϵ���", "��â��", "����", "�뿵��", "�Ծ籺", "��õ��",
				"�Ƿɱ�", "�Ծȱ�", "��û��", "â����", "���ֱ�", "���ر�", "�о籺", "��걺", "���ر�" };
		JComboBox box4 = new JComboBox(city);

		String[] gu = { "���α�", "�߱�", "��걸", "������", "������", "���빮��", "�߶���", "���ϱ�", "���ϱ�", "������", "�����", "����", "���빮��",
				"������", "��õ��", "������", "���α�", "��õ��", "��������", "���۱�", "���Ǳ�", "���ʱ�", "������", "���ı�", "������" };
		JComboBox box5 = new JComboBox(gu);

		String[] dong = { "û��ȿ�ڵ�", "������", "��û��", "�ξϵ�", "��â��", "���ǵ�", "������", "��ȸ��", "����1234����", "����56����", "��ȭ��", "��ȭ��",
				"â����1��", "â����2��", "â����3��", "������1��", "������2��" };
		JComboBox box6 = new JComboBox(dong);

		String[] phone_number = { "010", "011", "017", "016", "018", "019" };
		JComboBox box7 = new JComboBox(phone_number);

		// JTextArea ����
		JTextArea ta1 = new JTextArea();// ���� ���
//		JTextArea ta2 = new JTextArea();// <�Ű� ��û>
		JPanel ta3 = new JPanel();// <�뿩 ���>
		ta3.setBackground(new Color(240, 248, 255));
		ta3.setLayout(null);
		LineBorder lbta = new LineBorder(new Color(255, 182, 193));
		JLabel ta3jJLabel1 = new JLabel(" å ����");
		JLabel ta3jJLabel2 = new JLabel(" ����");
		JLabel ta3jJLabel3 = new JLabel(" ���ǻ�");
		ta3jJLabel1.setBorder(lbta);
		ta3jJLabel2.setBorder(lbta);
		ta3jJLabel3.setBorder(lbta);
		ta3jJLabel1.setBounds(0, 0, 73, 24);
		ta3jJLabel2.setBounds(73, 0, 73, 24);
		ta3jJLabel3.setBounds(146, 0, 74, 24);
		ta3.add(ta3jJLabel1);
		ta3.add(ta3jJLabel2);
		ta3.add(ta3jJLabel3);

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
		// �г� ����
		JPanel jp1 = new JPanel();
		jp1.setBackground(new Color(240, 248, 255));
		// JRadioButton ����

		LineBorder lb = new LineBorder(new Color(255, 182, 193));
		// JTextField ����
		JTextField tf1 = new JTextField(); // �˻�
		tf1.setText("���� �˻�");// �⺻ �Է� �� ����
		tf1.setEnabled(true);
		tf1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tf1.setText("");
			}
		});
		HashMap<Integer, Book> save = new HashMap<Integer, Book>();
		HashMap<Integer, Integer> savekey = new HashMap<Integer, Integer>();
		tf1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent arg0) {

				if (arg0.getKeyChar() == (char) 10) {
					jp1.removeAll();
					jp1.repaint();
					String str = "";
					for (int n = 1; n < mh.size(); n++) {
						if (mh.get(n).book_name.contains(tf1.getText())) {
							JLabel j = new JLabel();
							Book b = mh.get(n);
							JButton jbt = new JButton("��");
							jbt.setBounds(160, 0, 43, 25);
							JOptionPane jop = new JOptionPane();
							jbt.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									int a = jop.showConfirmDialog(null, "�뿩 ��Ͽ� �߰� �մϴ�.", "Ȯ��",
											JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
									if (cx >= 5) {
										jop.showConfirmDialog(null, "�ѹ��� 4�Ǳ����� �뿩 �����մϴ�.", "Ȯ��",
												JOptionPane.PLAIN_MESSAGE);
									} else if (a == 0) {
										save.put(b.book_id, b);
										savekey.put(cx, b.book_id);
										JLabel pl1 = new JLabel(b.getBook_name());
										JLabel pl2 = new JLabel(b.getWriter());
										JLabel pl3 = new JLabel(b.getPublisher());
										pl1.setBounds(0, 24 * cx, 73, 24);
										pl2.setBounds(73, 24 * cx, 73, 24);
										pl3.setBounds(146, 24 * cx, 74, 24);
										ta3.add(pl1);
										ta3.add(pl2);
										ta3.add(pl3);
										jbt.setEnabled(false);
										ta3.revalidate();
										ta3.repaint();
										cx++;
									}
								}
							});
							j.setBorder(lb);
							j.setText(b.getBook_name() + " (" + b.getWriter() + ") "
//							+ "[" + b.getPublisher() + "]"
							);
							j.setToolTipText(b.book_name + " " + "��" + b.getPublisher());
							j.addMouseListener(new Lo(b));

							j.addMouseListener(new MouseAdapter() {

								public void mouseExited(MouseEvent e) {
									j.setForeground(Color.black);
								}

								public void mouseEntered(MouseEvent e) {
									j.setForeground(Color.blue);
									j.setCursor(new Cursor(HAND_CURSOR));
								}
							});
							jp1.add(j);
							j.add(jbt);
							jp1.repaint();
						}
					}
					if (tf1.getText().equals("")) {
//						JOptionPane.showMessageDialog(null, "�˻�� �Է��ϼž� �մϴ�", "ERROR", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				jp1.repaint();
			}
		});

		JTextField tf2 = new JTextField(); // �̸�
//		JTextField tf3 = new JTextField(); // ����
//		JTextField tf4 = new JTextField(); // �ּ�
//		JTextField tf5 = new JTextField(); // ����ó
//		JTextField tf6 = new JTextField(); // �뿩��
//		JTextField tf7 = new JTextField(); // �ݳ���
		JTextField tf8 = new JTextField(); // (������û)���� �̸�
		tf8.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent arg0) {
				if (arg0.getKeyChar() == (char) 10) {
					tf8.nextFocus();
				}
			}
		});

		JTextField tf9 = new JTextField(); // (������û)���ǻ�
		tf9.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent arg0) {
				if (arg0.getKeyChar() == (char) 10) {
					tf9.nextFocus();
				}
			}
		});
		JTextField tf0 = new JTextField(); // (������û)�۰�
		JTextField tf10 = new JTextField(); // ����ó1 ��� 4�ڸ�
		JTextField tf11 = new JTextField(); // ����ó2 ������ 4�ڸ�

		// JButton ����
		JButton btn1 = new JButton("OK");// �˻�
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jp1.removeAll();
				jp1.repaint();
				String str = "";
				for (int n = 1; n < mh.size(); n++) {
					if (mh.get(n).book_name.contains(tf1.getText())) {
						JLabel j = new JLabel();
						Book b = mh.get(n);
						JButton jbt = new JButton("��");
						jbt.setBounds(160, 0, 43, 25);
						JOptionPane jop = new JOptionPane();
						jbt.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								int a = jop.showConfirmDialog(null, "�뿩 ��Ͽ� �߰� �մϴ�.", "Ȯ��",
										JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
								if (cx >= 5) {
									jop.showConfirmDialog(null, "�ѹ��� 4�Ǳ����� �뿩 �����մϴ�.", "Ȯ��", JOptionPane.PLAIN_MESSAGE);
								} else if (a == 0) {

									JLabel pl1 = new JLabel(b.getBook_name());
									JLabel pl2 = new JLabel(b.getWriter());
									JLabel pl3 = new JLabel(b.getPublisher());
									save.put(b.book_id, b);
									savekey.put(cx, b.book_id);
									pl1.setBounds(0, 24 * cx, 73, 24);
									pl2.setBounds(73, 24 * cx, 73, 24);
									pl3.setBounds(146, 24 * cx, 74, 24);
									ta3.add(pl1);
									ta3.add(pl2);
									ta3.add(pl3);
									jbt.setEnabled(false);
									ta3.revalidate();
									ta3.repaint();
									cx++;
								}
							}
						});
						j.setBorder(lb);
						j.setText(b.getBook_name() + " (" + b.getWriter() + ") "
//						+ "[" + b.getPublisher() + "]"
						);
						j.setToolTipText(b.book_name + " " + "��" + b.getPublisher());
						j.addMouseListener(new Lo(b));

						j.addMouseListener(new MouseAdapter() {
							public void mouseExited(MouseEvent e) {
								j.setForeground(Color.black);
							}

							public void mouseEntered(MouseEvent e) {
								j.setForeground(Color.blue);
								j.setCursor(new Cursor(HAND_CURSOR));
							}
						});
						jp1.add(j);
						j.add(jbt);
						jp1.repaint();
					}
				}
				if (tf1.getText().equals("")) {
//					JOptionPane.showMessageDialog(null, "�˻�� �Է��ϼž� �մϴ�", "ERROR", JOptionPane.INFORMATION_MESSAGE);
				}
				jp1.repaint();
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
		ta4.setFont(new Font(null, 1, 20));
		JButton btn4 = new JButton("�뿩");// �뿩
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tf2.getText().equals("") || tf10.getText().equals("") || tf11.getText().equals("")
				/* || tf5.getText().equals("") */) {
					JOptionPane.showMessageDialog(null, "�ʼ� �Է�ĭ�� ����ֽ��ϴ�.", "�˸�", JOptionPane.PLAIN_MESSAGE);

				} else {
					name[i] = tf2.getText();
					phone1[i] = tf10.getText();// ����ó ��� 4�ڸ�
					phone2[i] = tf11.getText();// ����ó ������ 4�ڸ�
					i++;
					btn4.setEnabled(false);
					for (int i = 0; i < save.size(); i++) {
						try {
							savebor = conn.prepareStatement("insert into borrow_list values(?,?,?,?,?,?)");
							savebor.setString(1, tf2.getText());
							savebor.setString(2, year[box1.getSelectedIndex()] +"/"+ month[box2.getSelectedIndex()]
									+"/"+ day[box3.getSelectedIndex()]);
							savebor.setString(3, rentday.getText());
							savebor.setString(4, rentday1.getText());
							savebor.setInt(5, save.get(savekey.get(i+1)).book_id);
							savebor.setInt(6, Integer.parseInt(phone_number[box7.getSelectedIndex()]
									.concat(tf10.getText().concat(tf11.getText()))));
							
							conn.setAutoCommit(true);
							savebor.executeUpdate();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
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
				ta4.setText("�ݳ����� �뿩�Ϸκ��� " + "\n" + " 1~15�̳��� �����մϴ�." + "\n" + "�ݳ����� �� �����ּ���.");

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
		JButton btn8 = new JButton("��û");// ��û
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JOptionPane().showConfirmDialog(null, "���� ��û�� �Ͻðڽ��ϱ�?", "Ȯ��", JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.INFORMATION_MESSAGE);
				try {

					savenew = conn.prepareStatement("insert into new_book values(?,?,?)");
					savenew.setString(1, tf8.getText());
					savenew.setString(2, tf9.getText());
					savenew.setString(3, tf0.getText());
					conn.setAutoCommit(true);

					savenew.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		// JComboBox ��ġ�� ũ�� ����
		box1.setBounds(295, 105, 53, 20);// ��(year)
		box2.setBounds(365, 105, 53, 20);// ��(month)
		box3.setBounds(435, 105, 53, 20);// ��(day)
		box4.setBounds(280, 135, 85, 20);// city
		box5.setBounds(370, 135, 61, 20);// gu
		box6.setBounds(435, 135, 85, 20);// dong
		box7.setBounds(280, 165, 46, 20);// phone_number

		// JLabel ��ġ�� ũ�� ����
//		label1.setBounds(225, 0, 100, 50); // ���� å �뿩 �뿩?
		label2.setBounds(240, 30, 100, 50); // �˻�
		label3.setBounds(240, 60, 100, 50); // �̸�
		label4.setBounds(240, 90, 100, 50); // �������
		label5.setBounds(240, 120, 100, 50); // �ּ�
		label6.setBounds(240, 150, 100, 50); // ����ó
//		label7.setBounds(240, 180, 100, 50); // ����ó
		label8.setBounds(240, 190, 100, 50); // <�Ű� ��û>
		label9.setBounds(10, 310, 85, 50); // <�뿩 ���>
		label10.setBounds(240, 338, 65, 50); // �뿩��
		label11.setBounds(240, 368, 65, 50); // �ݳ���
		label12.setBounds(240, 460, 90, 50); // <�뿩 ��Ȳ>
		label13.setBounds(240, 210, 100, 50); // ���� �̸�
		label14.setBounds(240, 240, 100, 50); // ���ǻ�
		label15.setBounds(240, 270, 100, 50); // �۰�
		label16.setBounds(350, 90, 100, 50); // ��
		label17.setBounds(420, 90, 100, 50); // ��
		label18.setBounds(490, 90, 100, 50); // ��
		label19.setBounds(330, 168, 10, 10); // ����ó ù��° -
		label20.setBounds(376, 168, 10, 10); // ����ó �ι�° -

		// JTextArea ��ġ�� ũ�� ����

//		ta2.setBounds(245, 250, 270, 60); // <�Ű� ��û>
		ta3.setBounds(10, 350, 220, 270); // <�뿩 ���>
		ta4.setBounds(245, 500, 270, 120); // <�뿩 ��Ȳ>

		// JTextField ��ġ�� ũ�� ����
		tf1.setBounds(270, 45, 195, 20); // �˻�
		tf2.setBounds(270, 75, 80, 20); // �̸�
//		tf3.setBounds(270, 135, 80, 20); // ����
//		tf4.setBounds(270, 165, 210, 20); // �ּ�
//		tf5.setBounds(280, 195, 200, 20); // ����ó
		tf6.setBounds(280, 355, 200, 20); // �뿩��
		tf7.setBounds(280, 385, 200, 20); // �ݳ���
		tf8.setBounds(295, 225, 170, 20); // <�Ű� ��û> ���� �̸�
		tf9.setBounds(295, 255, 170, 20); // <�Ű� ��û> ���ǻ�
		tf0.setBounds(295, 285, 170, 20); // <�Ű� ��û> �۰�
		tf10.setBounds(338, 166, 35, 20); // ����ó1 ��� 4�ڸ�
		tf11.setBounds(385, 166, 35, 20); // ����ó2 ������ 4�ڸ�

		// JButton ��ġ�� ũ�� ����
		btn1.setBounds(480, 45, 58, 20); // �˻�
//		btn2.setBounds(485, 195, 58, 20); // ����ó
		btn3.setBounds(485, 385, 58, 20); // �ݳ���
		btn4.setBounds(280, 425, 88, 40); // �뿩
		btn5.setBounds(390, 425, 88, 40); // ���
		btn6.setBounds(485, 355, 58, 20); // �뿩��
//		btn7.setBounds(485, 165, 58, 20); // �ּ�
		btn8.setBounds(480, 285, 62, 20); // ��û ��ư

		// �г� ��ġ ũ�� �׵θ�

//		jp1.setBounds(10, 40, 220, 270); // ���� ���
		jp1.setLayout(new GridLayout(15, 1));
		jp1.setSize(110, 800);
		JScrollPane jsp = new JScrollPane(jp1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jsp.setBounds(10, 40, 220, 270);
		for (int i = 1; i <= mh.size(); i++) {
			JLabel j = new JLabel();
			Book b = mh.get(i);
			JButton jbt = new JButton("��");
			jbt.setBounds(160, 0, 43, 25);
			JOptionPane jop = new JOptionPane();
			jbt.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int a = jop.showConfirmDialog(null, "�뿩 ��Ͽ� �߰� �մϴ�.", "Ȯ��", JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.INFORMATION_MESSAGE);
					if (cx >= 5) {
						jop.showConfirmDialog(null, "�ѹ��� 4�Ǳ����� �뿩 �����մϴ�.", "Ȯ��", JOptionPane.PLAIN_MESSAGE);
					} else if (a == 0) {
						save.put(b.book_id, b);
						savekey.put(cx, b.book_id);
						JLabel pl1 = new JLabel(b.getBook_name());
						JLabel pl2 = new JLabel(b.getWriter());
						JLabel pl3 = new JLabel(b.getPublisher());
						pl1.setBounds(0, 24 * cx, 73, 24);
						pl2.setBounds(73, 24 * cx, 73, 24);
						pl3.setBounds(146, 24 * cx, 74, 24);
						ta3.add(pl1);
						ta3.add(pl2);
						ta3.add(pl3);
						jbt.setEnabled(false);
						ta3.revalidate();
						ta3.repaint();
						cx++;
					}
				}
			});

			j.setBorder(lb);
			j.setText(b.getBook_name() + " (" + b.getWriter() + ") "
//			+ "[" + b.getPublisher() + "]"
			);
			j.setToolTipText(b.book_name + " " + "��" + b.getPublisher());
			j.addMouseListener(new Lo(b));

			j.addMouseListener(new MouseAdapter() {
				public void mouseExited(MouseEvent e) {
					j.setForeground(Color.black);
				}

				public void mouseEntered(MouseEvent e) {
					j.setForeground(Color.blue);
					j.setCursor(new Cursor(HAND_CURSOR));
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
//		frm.getContentPane().add(label7); // ����ó
		frm.getContentPane().add(label8); // <�Ű� ��û>
		frm.getContentPane().add(label9); // <�뿩 ���>
		frm.getContentPane().add(label10); // �뿩��
		frm.getContentPane().add(label11); // �ݳ���
		frm.getContentPane().add(label12); // <�뿩 ��Ȳ>
		frm.getContentPane().add(label13);// (������û)���� �̸�
		frm.getContentPane().add(label14);// (������û)���ǻ�
		frm.getContentPane().add(label15);// (������û)�۰�
		frm.getContentPane().add(label16);// ��
		frm.getContentPane().add(label17);// ��
		frm.getContentPane().add(label18);// ��
		frm.getContentPane().add(label19);// ����ó ù��° -
		frm.getContentPane().add(label20);// ����ó �ι�°-

		// �����ӿ��ٰ� Jeld �߰�
		frm.getContentPane().add(tf1);// �˻�
		frm.getContentPane().add(tf2);// �̸�
//		frm.getContentPane().add(tf3);// ����
//		frm.getContentPane().add(tf4);// �ּ�
//		frm.getContentPane().add(tf5);// ����ó
		frm.getContentPane().add(tf6);// �뿩��
		frm.getContentPane().add(tf7);// �ݳ���
		frm.getContentPane().add(tf8);//
		frm.getContentPane().add(tf9);
		frm.getContentPane().add(tf0);
		frm.getContentPane().add(tf10);// ����ó ��� 4�ڸ�
		frm.getContentPane().add(tf11);// ����ó ������ 4�ڸ�

		// �����ӿ��ٰ� TextArea �߰�
		frm.getContentPane().add(ta1);// ���� ���
//		frm.getContentPane().add(ta2);// <�Ű� ��û>
		frm.getContentPane().add(ta3);// <�뿩 ���>
		frm.getContentPane().add(ta4);// <�뿩 ��Ȳ>

		// �����ӿ��ٰ� ��ư �߰�
		frm.getContentPane().add(btn1);// �˻�
//		frm.getContentPane().add(btn2);// ����ó
		frm.getContentPane().add(btn3);// �ݳ���
		frm.getContentPane().add(btn4);// �뿩
		frm.getContentPane().add(btn5);// ���
		frm.getContentPane().add(btn6);// �뿩��
		frm.getContentPane().add(btn7);// �ּ�
		frm.getContentPane().add(btn8);

		// �����ӿ��ٰ� JComboBox �߰�
		frm.getContentPane().add(box1);// year
		frm.getContentPane().add(box2);// month
		frm.getContentPane().add(box3);// day
		frm.getContentPane().add(box4);// city
		frm.getContentPane().add(box5);// gu
		frm.getContentPane().add(box6);// dong
		frm.getContentPane().add(box7);// phone_number

		// �г� �߰�
		JPanel jp = new JPanel();
		frm.add(jp);
		jp.setLayout(new FlowLayout());
		jp.setBounds(10, 650, 510, 85);
		JLabel foot = new JLabel("����Ư���� ���α� Copyright �� ������ All rights reserved.");
		jim = new JLabel(img1);
		jp.add(jim);
		jp.setBackground(new Color(240, 248, 255));

		foot.setBounds(25, 740, 400, 30);
		new Thread(new Runnable() {
			public void run() {
				for (;;) {
					int x = jim.getX() + 5;
					int y = jim.getY();
					if (x > jim.getWidth() - 850) {
						jim.setLocation(-380, 0);
					} else
						jim.setLocation(x, y);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
				}
			}
		}).start();
//		frm.add(jp1);
		frm.add("center", jsp);
		frm.add(foot);

		// �������� ���̵��� ����
		frm.setVisible(true);

//		conn.close();

	}
}
