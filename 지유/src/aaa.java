import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.StyledEditorKit.BoldAction;

class keya extends KeyAdapter {
	String str;

	public void keyPressed(KeyEvent e) {
		JTextArea ja = (JTextArea) e.getSource();
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			str = ja.getText();
			ja.setEnabled(false);
		}
	}
}

class it extends JFrame {

	JMenuItem jm[] = new JMenuItem[5];

	it(JMenu j) {
		for (int i = 0; i < 5; i++) {
			jm[i] = new JMenuItem("저장 목록");
			jm[i].setEnabled(false);
			j.add(jm[i]);

		}
	}
}

class Profile {
	String sabun, name, buseo, juso, ex;
	iim iim;
String a;
	Profile(String sabun, String name, String buseo, String juso, String ex, iim iim) {
		this.sabun = sabun;
		this.name = name;
		this.buseo = buseo;
		this.juso = juso;
		this.ex = ex;
		this.iim = iim;
		a=iim.str;
	}

}

class GU extends JFrame {
	String sabun, name, buseo, juso, ex;
	iim iim;
	int n = -1;
	clcl a = new clcl();
	keya keya = new keya();
	HashMap<String, Profile> hm = new HashMap<String, Profile>();
HashMap<ImageIcon, String> hi  = new HashMap<ImageIcon, String>();
	GU() {
		addMouseListener(a);

		setTitle("프로필");
		Container c = getContentPane();
		c.setLayout(null);
		JPanel jp1 = new JPanel();
		jp1.setBounds(20, 445, 352, 80);
		jp1.setBackground(new Color(200, 200, 200));
		add(jp1);

		JLabel jl[] = new JLabel[8];
		JTextArea jt[] = new JTextArea[5];
		jl[0] = new JLabel("사번 : ");
		jl[1] = new JLabel("이름 : ");
		jl[2] = new JLabel("부서 : ");
		jl[3] = new JLabel("주소 : ");
		jl[4] = new JLabel("특이사항");
		for (int i = 0; i < 5; i++) {
			jl[i].setBounds(43, 100 + 40 * i, 90, 30);
			c.add(jl[i]);
		}
		for (int i = 0; i < 4; i++) {
			jt[i] = new JTextArea(1, 10);
			jt[i].setBounds(120, 105 + 40 * i, 90, 20);
			c.add(jt[i]);
			jt[i].setVisible(false);
		}

		jt[0].addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				JTextArea ja = (JTextArea) e.getSource();
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					sabun = ja.getText();
					ja.setEnabled(false);
				}
			}
		});
		jt[1].addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				JTextArea ja = (JTextArea) e.getSource();
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					name = ja.getText();
					ja.setEnabled(false);
				}
			}
		});
		jt[2].addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				JTextArea ja = (JTextArea) e.getSource();
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					buseo = ja.getText();
					ja.setEnabled(false);
				}
			}
		});
		jt[3].addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				JTextArea ja = (JTextArea) e.getSource();
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					juso = ja.getText();
					ja.setEnabled(false);
				}
			}
		});
		jt[4] = new JTextArea(4, 100);
		jt[4].setBounds(43, 300, 300, 130);
		c.add(jt[4]);
		jt[4].addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				JTextArea ja = (JTextArea) e.getSource();
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					ex = ja.getText();
				}
			}
		});
		JLabel label = new JLabel();
		jt[4].setVisible(false);
		JButton proi = new JButton("사진 첨부");
		proi.setBounds(250, 150, 90, 30);
		
		
		
		ImageIcon mage = new ImageIcon("C:\\Users\\Lee\\Downloads\\no1.jpg");
		JLabel jima = new JLabel(mage);
		label.add(jima);
		jima.setBounds(250, 15, 90, 120);
		

		
		
		
		
		label.add(proi);
		proi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iim = new iim(label);
			}
		});
		label.setBackground(new Color(200, 200, 200));
		label.setOpaque(true);
		label.setBounds(20, 85, 352, 350);
		c.add(label);

		
		
		
		
		JMenuBar jm = new JMenuBar();
		JMenu jm1 = new JMenu("저장");
		JMenu jm2 = new JMenu("불러오기");
		it it = new it(jm2);
		it it1 = new it(jm1);
		for (int i = 0; i < 5; i++) {
			it1.jm[i].setEnabled(true);
		}
		it1.jm[0].addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				n = 0;
				Profile pr = new Profile(sabun, name, buseo, juso, ex, iim);
				hm.put(pr.sabun, pr);
				it.jm[n % 5].setEnabled(true);
				it1.jm[n % 5].setFont(new Font("굴림", Font.BOLD, 20));
				it1.jm[n % 5].setText(pr.sabun);
				it.jm[n % 5].setFont(new Font("굴림", Font.BOLD, 20));
				it.jm[n % 5].setText(pr.sabun);
				
			}
		});
		it1.jm[1].addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				n = 1;
				Profile pr = new Profile(sabun, name, buseo, juso, ex, iim);
				hm.put(pr.sabun, pr);
				it.jm[n % 5].setEnabled(true);
				it1.jm[n % 5].setFont(new Font("굴림", Font.BOLD, 20));
				it1.jm[n % 5].setText(pr.sabun);
				it.jm[n % 5].setFont(new Font("굴림", Font.BOLD, 20));
				it.jm[n % 5].setText(pr.sabun);

			}
		});
		it1.jm[2].addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				n = 2;
				Profile pr = new Profile(sabun, name, buseo, juso, ex, iim);
				hm.put(pr.sabun, pr);
				it.jm[n % 5].setEnabled(true);
				it1.jm[n % 5].setFont(new Font("굴림", Font.BOLD, 20));
				it1.jm[n % 5].setText(pr.sabun);
				it.jm[n % 5].setFont(new Font("굴림", Font.BOLD, 20));
				it.jm[n % 5].setText(pr.sabun);

			}
		});
		it1.jm[3].addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				n = 3;
				Profile pr = new Profile(sabun, name, buseo, juso, ex, iim);
				hm.put(pr.sabun, pr);
				it.jm[n % 5].setEnabled(true);
				it1.jm[n % 5].setFont(new Font("굴림", Font.BOLD, 20));
				it1.jm[n % 5].setText(pr.sabun);
				it.jm[n % 5].setFont(new Font("굴림", Font.BOLD, 20));
				it.jm[n % 5].setText(pr.sabun);

			}
		});
		it1.jm[4].addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				n = 4;
				Profile pr = new Profile(sabun, name, buseo, juso, ex, iim);
				hm.put(pr.sabun, pr);
				it.jm[n % 5].setEnabled(true);
				it1.jm[n % 5].setFont(new Font("굴림", Font.BOLD, 20));
				it1.jm[n % 5].setText(pr.sabun);
				it.jm[n % 5].setFont(new Font("굴림", Font.BOLD, 20));
				it.jm[n % 5].setText(pr.sabun);

			}
		});
//			it.jm[i].addMouseListener(new MouseAdapter() {
//				public void mousePressed(MouseEvent e) {
//					JMenuItem bul = (JMenuItem) e.getSource();
//					Profile bul1 = hm.get(bul.getText());
//					for(int i = 0;i<5;i++)
//						jt[i].setEnabled(true);
//					jt[0].setText(bul1.sabun);
//					jt[1].setText(bul1.name);
//					jt[2].setText(bul1.buseo);
//					jt[3].setText(bul1.juso);
//					jt[4].setText(bul1.ex);
//				}
//			});
		it.jm[0].addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JMenuItem bul = (JMenuItem) e.getSource();
				pp(0, jt, bul);
			}
		});
		it.jm[1].addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JMenuItem bul = (JMenuItem) e.getSource();
				pp(1, jt, bul);
			}
		});
		it.jm[2].addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JMenuItem bul = (JMenuItem) e.getSource();
				pp(2, jt, bul);
			}
		});
		it.jm[3].addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JMenuItem bul = (JMenuItem) e.getSource();
				pp(3, jt, bul);
			}
		});
		it.jm[4].addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JMenuItem bul = (JMenuItem) e.getSource();
				pp(4, jt, bul);
			}
		});

		JMenu jm3 = new JMenu("종료");

		jm3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});

		JButton bt = new JButton("ADD");
		bt.setFont(new Font("굴림", Font.PLAIN, 20));
		add(bt);
		bt.setBounds(20, 20, 100, 30);
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					jt[i].setText("");
					jt[i].setEnabled(true);
					jt[i].setVisible(true);
				}
			}
		});
		JButton btc = new JButton("DEL");
		btc.setFont(new Font("굴림", Font.PLAIN, 20));
		add(btc);
		btc.setBounds(140, 20, 100, 30);
		btc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hm.remove(it.jm[n].getText());
				it.jm[n].setText("저장 목록");
				it.jm[n].setFont(null);
				it.jm[n].setEnabled(false);
				it1.jm[n].setText("저장 목록");
				it1.jm[n].setFont(null);
				jt[0].setText("");
				jt[1].setText("");
				jt[2].setText("");
				jt[3].setText("");
				jt[4].setText("");
			}
		});
		JButton ad[] = new JButton[4];

		jm.add(jm1);
		jm.add(jm2);
		jm.add(jm3);
		setJMenuBar(jm);
		setResizable(false);
		setSize(412, 612);
		setVisible(true);
	}

	void pp(int a, JTextArea[] jt, JMenuItem bul) {
		n = a;
		
		Profile bul1 = hm.get(bul.getText());
		for (int i = 0; i < 5; i++)
			jt[i].setEnabled(true);
		jt[0].setText(bul1.sabun);
		jt[1].setText(bul1.name);
		jt[2].setText(bul1.buseo);
		jt[3].setText(bul1.juso);
		jt[4].setText(bul1.ex);
	}
}

public class 아무GUI {
	public static void main(String[] args) {

		new GU();
	}
}

class clcl extends MouseAdapter {
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX() + "  " + e.getY());
	}

	clcl() {
	}
}

class iim extends JFrame {
	String str;

	iim(JLabel label) {
		setTitle("이미지 주소를 입력해 주세요");
		JTextField j = new JTextField(50);
		setLayout(new FlowLayout());
		add(j);
		j.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					str = j.getText();
					ImageIcon ima = new ImageIcon(str);
					JLabel proima1 = new JLabel(ima);
					proima1.removeAll();
					label.add(proima1);
					proima1.setBounds(250, 15, 90, 120);
					validate();
				}
			}
		});
		setVisible(true);
		setSize(600, 100);
	}
}