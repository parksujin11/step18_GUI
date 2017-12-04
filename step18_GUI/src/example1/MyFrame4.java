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
 * MyFrame 객체는 Component type 도 되고 JFrame type 도 되고 ActionListener type 도 된다. 
 */
public class MyFrame4 extends JFrame implements ActionListener{
	//버튼의 참조값을 저장할 필드
	JButton button1=null;
	JButton button2;
	JButton button3;
	
	//생성자
	public MyFrame4() {
		 initUI();
		
	}
	//초기화 메소드
	public void initUI() {
		//레이아웃 설정
		setLayout(new BorderLayout());
		
		//패널 객체 생성
		JPanel panel=new JPanel();
		
		//버튼 객체 생성
		this.button1=new JButton("버튼1");
		button2=new JButton("버튼2");
		button3=new JButton("버튼3");
//		JButton button1, button2, button3;
		
		//버튼에 ActionListener 등록하기
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);

		//버튼을 패널에 추가
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		//패널을 프레임의 위쪽 에 배치
		add(panel, BorderLayout.NORTH);
		
		//setBounds(x, y, width, height)
		setBounds(200, 200, 500, 500);
		//x 를 눌러서 창을 닫을때 프로세스가 종료 되도록
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 프레임 객체가 화면에 보이도록 
		setVisible(true);
		
	}
	//메인 메소드 
	public static void main(String[] args) {
		new MyFrame4();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 참조값을 얻어오기
		Object btn =e.getSource();
		String msg="";
		//btn 에 들어 있는 참조값과 필드의 값을 비교 한다.
		if(btn==button1) {
			msg="1번 버튼";
		}else if(btn==button2) {
			msg="2번 버튼";
		}else if(btn==button3) {
			msg="3번 버튼";
		}
		
		//System.out.println("버튼을 눌렀네요?);
		JOptionPane.showMessageDialog(this, msg+"버튼을 눌렀네요");
		
	}
}
