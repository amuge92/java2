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

		JFrame frm = new JFrame("도서 대여 프로그램");

		// 프레임 크기 설정
		frm.setSize(568, 680);
		// 프레임을 화면 가운데에 배치
		frm.setLocationRelativeTo(null);
		// 프레임을 닫았을 때 메모리에서 제거되도록 설정
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 레이아웃 설정
		frm.getContentPane().setLayout(null);

		// JLabel 생성
		JLabel label10 = new JLabel("대여일");
		JLabel label11 = new JLabel("반납일");
		JLabel label12 = new JLabel("<대여 현황>");

		// <대여 현황>
		JTextArea ta4 = new JTextArea();
		ta4.setText("대여일을 선택해 주세요.");

		// 대여일(오늘날짜)
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		// 반납일(오늘로부터 7일 후)
		cal.add(Calendar.DAY_OF_YEAR, 7);
		Date nomal = cal.getTime();
		// 반납일(오늘로부터 15일 후)
		cal.add(Calendar.DAY_OF_YEAR, 15);
		Date max = cal.getTime();

		// 대여일 (고정값)
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

		// JButton 생성
		JButton btn4 = new JButton("대여");// 대여
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setEnabled(false);
				Thread t = new Thread() {
					public void run() {
						try {
							int time=(int)(Math.random()*1000)+800;
							ta4.setText("진행중입니다...");
							Thread.sleep(time);
							ta4.setText("잠시만 기다려 주십시오.");
							Thread.sleep(time);
							ta4.setText("<대여>가 완료되었습니다."+"\n"+"<반납일>을 지켜주세요.");
							Thread.sleep(2000);
							
							new text();
							
							
						} catch (InterruptedException e) {
							ta4.setText("시스템 오류입니다."+"\n"+"처음부터 다시 시작해주세요.");
						}
					}
				};
				t.start();
			}
		});
		JButton btn5 = new JButton("취소");// 취소
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta4.setText("<취소>되었습니다." + "\n" + "처음부터 다시 시작해주세요.");
				btn5.setEnabled(false);
			}
		});
		JButton btn3 = new JButton("OK");// 반납일
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta4.setText("<대여>를 눌러주세요.");
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn3.setEnabled(false);
			}	
		});
		JButton btn6 = new JButton("OK");// 대여일
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf7.setVisible(true);
				btn6.setEnabled(false);
				ta4.setText("반납일은 대여일로부터 1~15이내에 가능합니다." + "\n" + "반납일을 잘 지켜주세요.");
				btn3.setEnabled(true);
			}
		});
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		
		// JLabel 위치와 크기 설정
		label10.setBounds(240, 330, 65, 65); // 대여일
		label11.setBounds(240, 360, 65, 65); // 반납일
		label12.setBounds(240, 450, 65, 65); // <대여 현황>
		// JTextArea 위치와 크기 설정
		ta4.setBounds(245, 500, 270, 120); // <대여 현황>
		// JTextField 위치와 크기 설정
		tf6.setBounds(280, 355, 200, 20); // 대여일
		tf7.setBounds(280, 385, 200, 20); // 반납일
		// JButton 위치와 크기 설정
		btn3.setBounds(485, 385, 58, 20); // 반납일
		btn4.setBounds(350, 415, 58, 20); // 대여
		btn5.setBounds(350, 445, 58, 20); // 취소
		btn6.setBounds(485, 355, 58, 20); // 대여일
		// 프레임에다가 JLabel 추가
		frm.getContentPane().add(label10); // 대여일
		frm.getContentPane().add(label11); // 반납일
		frm.getContentPane().add(label12); // <대여 현황>
		// 프레임에다가 JTextField 추가
		frm.getContentPane().add(tf6);// 대여일
		frm.getContentPane().add(tf7);// 반납일
		// 프레임에다가 TextArea 추가
		frm.getContentPane().add(ta4);// <대여 현황>
		// 프레임에다가 버튼 추가
		frm.getContentPane().add(btn3);// 반납일
		frm.getContentPane().add(btn4);// 대여
		frm.getContentPane().add(btn5);// 취소
		frm.getContentPane().add(btn6);// 대여일
		// 프레임이 보이도록 설정
		frm.setVisible(true);
	}

}

