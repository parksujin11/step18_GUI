package example1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.xml.bind.Marshaller.Listener;

public class MyFrame2 extends JFrame{
	//�ɹ� �ʵ�� ActionListener ��ü�� ������ ������
	ActionListener listener =new ActionListener() { 
		//�����ʵ� ����� ��ü���� �̺�Ʈ�� �Ͼ�� ȣ��Ǵ� �޼ҵ� 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	};

	
	//������
	public MyFrame2() {
		 initUI();
		
	}
	//�ʱ�ȭ �޼ҵ�
	public void initUI() {
		//���̾ƿ� ����
		setLayout(new BorderLayout());
		//�г� ��ü ����
		JPanel panel=new JPanel();
		//��ư ��ü ����
		JButton button=new JButton("����������");
		//��ư�� ActionListener ����ϱ�
		button.addActionListener(listener);
		//��ư�� �гο� �߰�
		panel.add(button);
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
		new MyFrame2();
	}
}
