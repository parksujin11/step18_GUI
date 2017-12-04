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
public class MyFrame5 extends JFrame implements ActionListener{
	
	//������
	public MyFrame5() {
		 initUI();
		
	}
	//�ʱ�ȭ �޼ҵ�
	public void initUI() {
		//���̾ƿ� ����
		setLayout(new BorderLayout());
		
		//�г� ��ü ����
		JPanel panel=new JPanel();
		
		//��ư ��ü ����
		JButton button1=new JButton("�Է�");
		JButton button2=new JButton("����");
		JButton button3=new JButton("����");
		//JButton button1, button2, button3;
		
		//��ư�� action command ���
		button1.setActionCommand("input");
		button2.setActionCommand("update");
		button3.setActionCommand("delete");
		
		button1.getActionCommand();
		
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
		new MyFrame5();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//������ ��ư�� �������� ������
		//(JButton) ĳ����! ĳ�����ϸ� ��ư�� ��� �� �� �ִ�.
		JButton btn =(JButton)e.getSource();
		//��ư�� ������ action command �� �о�´�.
		String command=btn.getActionCommand();
		//java ���� ���ڿ� �񱳴� �ݵ�� .equals()�޼ҵ带 �̿��ؼ� ���Ѵ�.
		//���� �� �����ھ��� �ʴ´�. == �Ⱦ���.
		if(command.equals("input")) {
			JOptionPane.showMessageDialog(this, "�Է��մϴ�.");
		}else if(command.equals("update")){
			JOptionPane.showMessageDialog(this, "�����մϴ�.");
		}else if(command.equals("delete")){
			JOptionPane.showMessageDialog(this, "�����մϴ�.");
		}
	}
}
