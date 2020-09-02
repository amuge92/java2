package teamp;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
public class Book implements Serializable{
	int book_id;// �� ���̵� Hashmap�� Ű ������ ��� and DB �⺻Ű�� ���
	String book_name;// �̸�
	String writer;// �ۻ�
	String publisher;// ���ǻ�
	String book_story;// �ٰŸ�
	String book_img = "�⺻ �̹��� ���� ���";// �̹��� ��� �� ������ �⺻ �̹���
	String genre; // �帣�� �ڵ� ex> 1. �θǽ� 2. ������ 3.ȣ��.....

	Book(int book_id, String book_name, String writer, String publisher, String book_story, String book_img,
			String genre) {
		this.book_id = book_id;
		this.book_img = book_img;
		this.book_name = book_name;
		this.writer = writer;
		this.publisher = publisher;
		this.book_story = book_story;
		this.genre = genre;
	}

	public int getBook_id() {
		return book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public String getWriter() {
		return writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getBook_story() {
		return book_story;
	}

	public String getBook_img() {
		return book_img;
	}

	public String getGenre() {
		return genre;
	}
}
