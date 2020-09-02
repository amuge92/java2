package teamp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

class Lo extends MouseAdapter {
	Book book;
	Lo(Book book) {
		this.book = book;
	}

	public void mouseClicked(MouseEvent arg0) {
		temp1 a = new temp1(book);

	}
}