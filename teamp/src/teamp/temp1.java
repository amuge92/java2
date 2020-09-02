package teamp;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class temp1 extends JFrame {
	ImageIcon i; // �̹��� �������ּ���
	Image im;

	class Background extends JPanel {

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
		}
	}

	temp1(Book book) {
		this.setTitle("��������");

		i = new ImageIcon(book.book_img);
		im = i.getImage();

		JLabel j0 = new JLabel("NO." + book.book_id);
		JLabel j1 = new JLabel(book.book_name);
		JLabel j2 = new JLabel("��   �� : " + book.writer);
		JLabel j3 = new JLabel("���ǻ� ");
		JLabel j4 = new JLabel(book.publisher);
		JLabel j5 = new JLabel("�ٰŸ�");

		JTextArea text = new JTextArea(20, 30);// �ؽ�Ʈ â
		text.setEditable(false);
		JScrollPane scroll = new JScrollPane(text);// ��ũ��

		scroll.setViewportView(text);
		text.setLineWrap(true);
		text.setFont(new Font(null, 1, 20));
		text.setText("" + book.book_story);
		scroll.setBounds(100, 320, 360, 220);
		j1.setAutoscrolls(true);
		j0.setFont(new Font("", 1, 21));
		j1.setFont(new Font("", 1, 21));
		j1.setToolTipText(book.book_name);
		j2.setFont(new Font("", 1, 21));
		j3.setFont(new Font("", 1, 21));
		j4.setFont(new Font("", 1, 21));
		j5.setFont(new Font("", 1, 21));

		j0.setBounds(100, 60, 200, 30);
		j1.setBounds(100, 110, 170, 60);
		j2.setBounds(100, 170, 200, 30);
		j3.setBounds(100, 200, 200, 30);
		j4.setBounds(100, 230, 200, 30);
		j5.setBounds(100, 280, 200, 30);// �ٰŸ� ��

		Background bg = new Background();
		bg.setLayout(null);

		// ���⿡ Jlabel�̶� ��ġ�������ؼ� bg.add();���� �ٿ��ּ���. �����Ӵ�� bg�� �ٿ����ؿ�

		bg.add(j0);
		bg.add(j1);
		bg.add(j2);
		bg.add(j3);
		bg.add(j4);
		bg.add(j5);
		bg.add("Center", scroll);

		this.add(bg);
		this.setSize(550, 650);
		this.setVisible(true);
		setResizable(false); // âũ�� ���� �Ұ�
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {

	}

}
