package teamp;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class text extends JFrame {
	ImageIcon i = new ImageIcon("C:\\Users\\Lee\\Desktop\\close.jpg");
	Image im = i.getImage();

	text() {
		this.setTitle("감사합니다");

		Background bg = new Background();
		bg.setLayout(null);

		// 감사문구
		JLabel j1 = new JLabel("이용해 주셔서");
		j1.setBounds(135, 55, 200, 50);
		j1.setFont(new Font("맑은 고딕", Font.BOLD, 28));
		bg.add(j1);

		JLabel j2 = new JLabel("감사합니다");
		j2.setBounds(150, 95, 200, 50);
		j2.setFont(new Font("맑은 고딕", Font.BOLD, 28));
		bg.add(j2);

		JLabel j3 = new JLabel("다음에 또 이용해주세요");
		j3.setBounds(70, 135, 300, 50);
		j3.setFont(new Font("맑은 고딕", Font.BOLD, 28));
		bg.add(j3);
		// 버튼
		JButton b = new JButton("대여하기");
		b.setBounds(110, 220, 100, 50);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.setBackground(Color.BLUE);
				new Fra();
				dispose();
			}
		});
		bg.add(b);

		JButton b1 = new JButton("나가기");
		b1.setBounds(240, 220, 100, 50);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		bg.add(b1);

		this.add(bg);
		this.setSize(450, 350);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setResizable(false); // 창크기 조절 불가
	}

	class Background extends JPanel {

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
		}
	}

	public static void main(String[] args) {
		new text();

	}

}