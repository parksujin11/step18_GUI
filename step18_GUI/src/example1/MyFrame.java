package example1;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	//������
	public MyFrame() {
		//setBounds(x, y, width, height)
		setBounds(200, 200, 500, 500);
		//x �� ������ â�� ������ ���μ����� ���� �ǵ���
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// ������ ��ü�� ȭ�鿡 ���̵��� 
		setVisible(true);
		
	}
	//���� �޼ҵ�
	public static void main(String[] args) {
		//MyFrame() ��ü �����ϱ�
		new MyFrame();
	}

}
