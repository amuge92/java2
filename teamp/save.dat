package teamp;

import java.awt.GridLayout;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Gu extends JFrame {
   int n = 0;

   Gu() {
      HashMap<Integer, Book> mh = new HashMap<Integer, Book>();
      Book bk = new Book(1, "소나기", "황순원", "한빛문고", "단편소설 어쩌고", "C:\\Users\\Lee\\Desktop\\bono.jpg", 1);
      mh.put(bk.book_id, bk);
      Book bk2 = new Book(2, "19세", "황순원", "문의당", "어른이 되고싶은", "C:\\Users\\Lee\\Desktop\\no1.jpg", 1);
      mh.put(bk2.book_id, bk2);

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