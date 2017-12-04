package example1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.xml.bind.Marshaller.Listener;
/*
 * MyFrame ��ü�� Component type �� �ǰ� JFrame type �� �ǰ� ActionListener type �� �ȴ�. 
 */
public class MyFrame4 extends JFrame implements ActionListener{
	//��ư�� �������� ������ �ʵ�
	JButton button1=null;
	JButton button2;
	JButton button3;
	
	//������
	public MyFrame4() {
		 initUI();
		
	}
	//�ʱ�ȭ �޼ҵ�
	public void initUI() {
		//���̾ƿ� ����
		setLayout(new BorderLayout());
		
		//�г� ��ü ����
		JPanel panel=new JPanel();
		
		//��ư ��ü ����
		this.button1=new JButton("��ư1");
		button2=new JButton("��ư2");
		button3=new JButton("��ư3");
//		JButton button1, button2, button3;
		
		//��ư�� ActionListener ����ϱ�
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);

		//��ư�� �гο� �߰�
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		//�г��� �������� ���� �� ��ġ
		add(panel, BorderLayout.NORTH);
		
		//setBounds(x, y, width, height)
		setBounds(200, 200, 500, 500);
		//x �� ������ â�� ������ ���μ����� ���� �ǵ���
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// ������ ��ü�� ȭ�鿡 ���̵��� 
		setVisible(true);
		
	}
	//���� �޼ҵ� 
	public static void main(String[] args) {
		new MyFrame4();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//������ ��ư�� �������� ������
		Object btn =e.getSource();
		String msg="";
		//btn �� ��� �ִ� �������� �ʵ��� ���� �� �Ѵ�.
		if(btn==button1) {
			msg="1�� ��ư";
		}else if(btn==button2) {
			msg="2�� ��ư";
		}else if(btn==button3) {
			msg="3�� ��ư";
		}
		
		//System.out.println("��ư�� �����׿�?);
		JOptionPane.showMessageDialog(this, msg+"��ư�� �����׿�");
		
	}
}
