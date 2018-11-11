package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class _02_TextUndoRedo implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<Character> deleted = new Stack<Character>();
	Stack<Character> saved = new Stack<Character>();

	public static void main(String[] args) {
		new _02_TextUndoRedo();
	}
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */

	public _02_TextUndoRedo() {
		frame.add(panel);
		panel.add(label);
		label.setText("work");
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.addKeyListener(this);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() != KeyEvent.VK_0) {

			char c = e.getKeyChar();

			label.setText(label.getText() + c);

			if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
				deleted.push(label.getText().charAt(label.getText().length() - 2));
				label.setText(label.getText().substring(0, label.getText().length() - 2));

			}
		}
		if (e.getKeyCode() == KeyEvent.VK_0) {
			try {
				label.setText(label.getText() + deleted.pop());
			} catch (Exception e2) {

			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
