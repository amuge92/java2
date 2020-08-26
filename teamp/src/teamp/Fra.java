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
 헤더 제목: 지금 책 대여 대여?
미들왼쪽: <도서목록>, 
미들오른쪽:<검색창>, <신간요청>, <장르>(라디오 버튼)
푸터왼쪽: <대여목록>
푸터오른쪽: <대여일자>,<반납일>, 
         <대여>, <취소>
                   라벨
                   
제목
저자
출판일
도서번호
출판사
책ID
줄거리

목록추가(버튼) 대여중(버튼)
 */

class Fra extends JFrame {
	public static void main(String[] args) {
		new Fra();

	}

	Fra() {
		HashMap<Integer, Book> mh = new HashMap<Integer, Book>();
		Book bk = new Book(1, "소나기", "황순원", "한빛문고",
				"원로 소설가 황순원 선생의 소설들 가운데 초기 작품"
						+ " 에 속하는 서정적 성장기 소설인 <소나기>, <닭제>, <산골아이>, <별>, <송아지> 등 5편의 단편을 삽화와 함께 실었다.",
				"C:\\Users\\Lee\\Desktop\\1.jpg", 1);
		mh.put(bk.book_id, bk);
		Book bk2 = new Book(2, "19세", "황순원", "문의당", "어른이 되고싶은", "C:\\Users\\Lee\\Desktop\\2.jpg", 1);
		mh.put(bk2.book_id, bk2);
		Book bk3 = new Book(3, "JAVA", "신지원", "솔데스크", "강사님", "C:\\Users\\Lee\\Desktop\\bono.jpg", 4);
		mh.put(bk3.book_id, bk3);
		Book bk4 = new Book(4, "C", "황순원", "문의당", "어른이 되고싶은", "C:\\Users\\Lee\\Desktop\\no1.jpg", 3);
		mh.put(bk4.book_id, bk4);
		Book bk5 = new Book(5, "집으로", "황순원", "문의당", "어른이 되고싶은", "C:\\Users\\Lee\\Desktop\\no1.jpg", 2);
		mh.put(bk5.book_id, bk5);

		JFrame frm = new JFrame("도서 대여 프로그램");
		Container c = frm.getContentPane();
		c.setBackground(new Color(244, 164, 96));
		// 프레임 크기 설정
		frm.setSize(568, 680);

		// 프레임을 화면 가운데에 배치
		frm.setLocationRelativeTo(null);

		// 프레임을 닫았을 때 메모리에서 제거되도록 설정
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 레이아웃 설정
		frm.getContentPane().setLayout(null);

		// JLabel 생성
		JLabel label1 = new JLabel("지금 책 대여 대여?");
		JLabel label2 = new JLabel("검색");
		JLabel label3 = new JLabel("장르");
		JLabel label4 = new JLabel("이름");
		JLabel label5 = new JLabel("나이");
		JLabel label6 = new JLabel("주소");
		JLabel label7 = new JLabel("연락처");
		JLabel label8 = new JLabel("<신간 요청>");
		JLabel label9 = new JLabel("<대여 목록>");
		JLabel label10 = new JLabel("대여일");
		JLabel label11 = new JLabel("반납일");
		JLabel label12 = new JLabel("<대여 현황>");

		// JTextArea 생성
		JTextArea ta1 = new JTextArea();// 도서 목록
		JTextArea ta2 = new JTextArea();// <신간 요청>
		JTextArea ta3 = new JTextArea();// <대여 목록>
		ta3.setEditable(false);
		JTextArea ta4 = new JTextArea();// <대여 현황>
		ta4.setText("대여일을 선택해 주세요.");

		// 대여일(오늘날짜)
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		// 반납일(오늘로부터 7일 후)
		cal.add(Calendar.DAY_OF_YEAR, 7);
		Date nomal = cal.getTime();
		cal.add(Calendar.DAY_OF_YEAR, 15);
		Date max = cal.getTime();

		// 대여일 (아직 증가하면 반납일도 같이 증가시키는 법을 못 찾아서 증가안되게 정해둠)
		SpinnerDateModel model = new SpinnerDateModel(today, today, null, Calendar.DAY_OF_MONTH);
		// (표기할 날짜,최소,최대,바꿀 부분)
		JSpinner tf6 = new JSpinner(model);

		JSpinner.DateEditor editor = new JSpinner.DateEditor(tf6, "yyyy-MM-dd");
		JFormattedTextField rentday = editor.getTextField();
		rentday.setEditable(false);
		rentday.setHorizontalAlignment(JTextField.CENTER);

		tf6.setEditor(editor);

		// 반납일을 기본적으로 오늘날짜의+7로 설정해두고 대여자가 반납일을 +,-할수있음 최대 15일까지 가능
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

		// JTextField 생성
		JTextField tf1 = new JTextField(); // 검색
		tf1.setText("도서 검색");// 기본 입력 값 설정
		tf1.setEnabled(true);
		JTextField tf2 = new JTextField(); // 이름
		JTextField tf3 = new JTextField(); // 나이
		JTextField tf4 = new JTextField(); // 주소
		JTextField tf5 = new JTextField(); // 연락처
//		JTextField tf6 = new JTextField(); // 대여일
//		JTextField tf7 = new JTextField(); // 반납일

		// JButton 생성
		JButton btn1 = new JButton("OK");// 검색
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = "";
				if (tf1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "검색어를 입력하셔야 합니다", "ERROR", JOptionPane.INFORMATION_MESSAGE);
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

		JButton btn2 = new JButton("OK");// 연락처

		JButton btn3 = new JButton("OK");// 반납일
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta4.setText("<대여>를 눌러주세요.");
				btn3.setEnabled(false);
			}
		});
//대여 버튼 
		JButton btn4 = new JButton("대여");// 대여
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tf2.getText().equals("") || tf3.getText().equals("") || tf4.getText().equals("")
						|| tf5.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "필수 입력칸이 비어있습니다.", "알림", JOptionPane.PLAIN_MESSAGE);

				} else {
					btn4.setEnabled(false);
					Thread t = new Thread() {
						public void run() {
							try {
								int time = (int) (Math.random() * 1000) + 800;
								ta4.setText("진행중입니다...");
								Thread.sleep(time);
								ta4.setText("잠시만 기다려 주십시오.");
								Thread.sleep(time);
								ta4.setText("<대여>가 완료되었습니다." + "\n" + "<반납일>을 지켜주세요.");
								Thread.sleep(2000);

								new text();
								frm.dispose();
							} catch (InterruptedException e) {
								ta4.setText("시스템 오류입니다." + "\n" + "처음부터 다시 시작해주세요.");
							}
						}
					};
					t.start();
				}
			}
		});

		JButton btn6 = new JButton("OK");// 대여일
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btn6.setEnabled(false);
				tf7.setVisible(true);
				ta4.setText("반납일은 대여일로부터 1~15이내에 가능합니다." + "\n" + "반납일을 잘 지켜주세요.");

			}
		});

		JButton btn5 = new JButton("취소");// 취소
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta4.setText("<취소>되었습니다." + "\n" + "처음부터 다시 시작해주세요.");

				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn6.setEnabled(true);
			}
		});

		JButton btn7 = new JButton("OK");// 주소

		// 패널 생성
		JPanel jp1 = new JPanel();
		jp1.setBackground(new Color(240, 248, 255));
		// JRadioButton 생성
		JRadioButton rb1 = new JRadioButton("소설");
		JRadioButton rb2 = new JRadioButton("수필");
		JRadioButton rb3 = new JRadioButton("시");

		// rb1 라디오버튼 눌러져있도록
		rb1.setSelected(true);

		// 라디오 버튼을 그룹화 하기 위한 객체 생성
		ButtonGroup bg = new ButtonGroup();

		// 그룹에 라디오 버튼을 포함시킨다.
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);

		// JLabel 위치와 크기 설정
		label1.setBounds(225, 0, 150, 50); // 지금 책 대여 대여?
		label2.setBounds(240, 30, 100, 50); // 검색
		label3.setBounds(240, 60, 100, 50); // 장르
		label4.setBounds(240, 90, 100, 50); // 이름
		label5.setBounds(240, 120, 100, 50); // 나이
		label6.setBounds(240, 150, 100, 50); // 주소
		label7.setBounds(240, 180, 100, 50); // 연락처
		label8.setBounds(240, 210, 100, 50); // <신간 요청>
		label9.setBounds(10, 300, 65, 65); // <대여 목록>
		label10.setBounds(240, 330, 65, 65); // 대여일
		label11.setBounds(240, 360, 65, 65); // 반납일
		label12.setBounds(240, 450, 65, 65); // <대여 현황>

		// JTextArea 위치와 크기 설정

		ta2.setBounds(245, 250, 270, 60); // <신간 요청>
		ta3.setBounds(10, 350, 220, 270); // <대여 목록>
		ta4.setBounds(245, 500, 270, 120); // <대여 현황>

		// JTextField 위치와 크기 설정
		tf1.setBounds(270, 45, 200, 20); // 검색
		tf2.setBounds(270, 105, 80, 20); // 이름
		tf3.setBounds(270, 135, 80, 20); // 나이
		tf4.setBounds(270, 165, 210, 20); // 주소
		tf5.setBounds(280, 195, 200, 20); // 연락처
		tf6.setBounds(280, 355, 200, 20); // 대여일
		tf7.setBounds(280, 385, 200, 20); // 반납일

		// JButton 위치와 크기 설정
		btn1.setBounds(475, 45, 58, 20); // 검색
		btn2.setBounds(485, 195, 58, 20); // 연락처
		btn3.setBounds(485, 385, 58, 20); // 반납일
		btn4.setBounds(280, 415, 88, 50); // 대여
		btn5.setBounds(400, 415, 88, 50); // 취소
		btn6.setBounds(485, 355, 58, 20); // 대여일
		btn7.setBounds(485, 165, 58, 20); // 주소

		// JRadioButton 위치와 크기 설정
		rb1.setBounds(265, 70, 49, 30); // 소설
		rb2.setBounds(315, 70, 49, 30); // 수필
		rb3.setBounds(365, 70, 49, 30); // 시

		// 패널 위치 크기 테두리
		LineBorder lb = new LineBorder(new Color(255, 182, 193));
		jp1.setBounds(10, 40, 220, 270); // 도서 목록
		jp1.setLayout(new GridLayout(10, 1));
		for (int i = 1; i <= mh.size(); i++) {
			JLabel j = new JLabel();
			Book b = mh.get(i);
			JButton jbt = new JButton("O");
			jbt.setBounds(194, 0, 25, 25);
			JOptionPane jop = new JOptionPane();
			jbt.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int a = jop.showConfirmDialog(null, "대여 목록에 추가 합니다.", "확인", JOptionPane.OK_CANCEL_OPTION,
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
		// JTextArea 툴팁
		ta1.setToolTipText("도서 목록");

		// 프레임에다가 JLabel 추가
		frm.getContentPane().add(label1); // 지금 책 대여 대여?
		frm.getContentPane().add(label2); // 검색
		frm.getContentPane().add(label3); // 장르
		frm.getContentPane().add(label4); // 이름
		frm.getContentPane().add(label5); // 나이
		frm.getContentPane().add(label6); // 주소
		frm.getContentPane().add(label7); // 연락처
		frm.getContentPane().add(label8); // <신간 요청>
		frm.getContentPane().add(label9); // <대여 목록>
		frm.getContentPane().add(label10); // 대여일
		frm.getContentPane().add(label11); // 반납일
		frm.getContentPane().add(label12); // <대여 현황>

		// 프레임에다가 JTextField 추가
		frm.getContentPane().add(tf1);// 검색
		frm.getContentPane().add(tf2);// 이름
		frm.getContentPane().add(tf3);// 나이
		frm.getContentPane().add(tf4);// 주소
		frm.getContentPane().add(tf5);// 연락처
		frm.getContentPane().add(tf6);// 대여일
		frm.getContentPane().add(tf7);// 반납일

		// 프레임에다가 TextArea 추가
		frm.getContentPane().add(ta1);// 도서 목록
		frm.getContentPane().add(ta2);// <신간 요청>
		frm.getContentPane().add(ta3);// <대여 목록>
		frm.getContentPane().add(ta4);// <대여 현황>

		// 프레임에다가 버튼 추가
		frm.getContentPane().add(btn1);// 검색
		frm.getContentPane().add(btn2);// 연락처
		frm.getContentPane().add(btn3);// 반납일
		frm.getContentPane().add(btn4);// 대여
		frm.getContentPane().add(btn5);// 취소
		frm.getContentPane().add(btn6);// 대여일
		frm.getContentPane().add(btn7);// 주소

		// 프레임에다가 JRadioButton 추가
		frm.getContentPane().add(rb1);
		frm.getContentPane().add(rb2);
		frm.getContentPane().add(rb3);

		// 패널 추가

		frm.add(jp1);
		// 프레임이 보이도록 설정
		frm.setVisible(true);
	}
}