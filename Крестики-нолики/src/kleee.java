import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class kleee extends JFrame{
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
	String p, o, i, u, y, t, r, e, w;
	
	public kleee(String s){
		super(s);
		setLayout(new FlowLayout());
		b1 =  new JButton(p);
		b1.setPreferredSize(new Dimension(100, 100));
		b2 =  new JButton(o);
		b2.setPreferredSize(new Dimension(100, 100));
		b3 =  new JButton(i);
		b3.setPreferredSize(new Dimension(100, 100));
		b4 =  new JButton(u);
		b4.setPreferredSize(new Dimension(100, 100));
		b5 =  new JButton(y);
		b5.setPreferredSize(new Dimension(100, 100));
		b6 =  new JButton(t);
		b6.setPreferredSize(new Dimension(100, 100));
		b7 =  new JButton(r);
		b7.setPreferredSize(new Dimension(100, 100));
		b8 =  new JButton(e);
		b8.setPreferredSize(new Dimension(100, 100));
		b9 =  new JButton(w);
		b9.setPreferredSize(new Dimension(100, 100));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
	}	
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1){
				p = "X";
			}
		}
	}
}
