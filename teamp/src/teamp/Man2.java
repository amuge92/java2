package teamp;

import java.awt.GridLayout;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Gu extends JFrame {
	int n = 0;

	Gu() {
		HashMap<Integer, Book> mh = new HashMap<Integer, Book>();
		Book bk = new Book(1, "�ҳ���", "Ȳ����", "�Ѻ�����", "����Ҽ� ��¼��", "C:\\Users\\Lee\\Desktop\\bono.jpg", 1);
		mh.put(bk.book_id, bk);
		Book bk2 = new Book(2, "19��", "Ȳ����", "���Ǵ�", "��� �ǰ����", "C:\\Users\\Lee\\Desktop\\no1.jpg", 1);
		mh.put(bk2.book_id, bk2);
		Book bk3 = new Book(3, "JAVA", "������", "�ֵ���ũ", "�����", "C:\\Users\\Lee\\Desktop\\bono.jpg", 4);
		mh.put(bk3.book_id, bk3);
		Book bk4 = new Book(4, "C", "Ȳ����", "���Ǵ�", "��� �ǰ����", "C:\\Users\\Lee\\Desktop\\no1.jpg", 3);
		mh.put(bk4.book_id, bk4);
		Book bk5 = new Book(5, "������", "Ȳ����", "���Ǵ�", "��� �ǰ����", "C:\\Users\\Lee\\Desktop\\no1.jpg", 2);
		mh.put(bk5.book_id, bk5);

		setLayout(new GridLayout(10, 1));
		for (int i = 1; i <= mh.size(); i++) {
			JLabel j = new JLabel();
			Book b = mh.get(i);
			j.setText(b.getBook_name() + " (" + b.getWriter() + ") " + "[" + b.getPublisher() + "]");
			j.setToolTipText(b.book_story);
			j.addMouseListener(new Lo(b));
			add(j);
			n = i;
		}

		setSize(500, 500);
		setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Man2 {
	public static void main(String[] args) {
		Gu g1 = new Gu();
	}
}
