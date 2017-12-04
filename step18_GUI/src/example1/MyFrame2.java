package example1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.xml.bind.Marshaller.Listener;

public class MyFrame2 extends JFrame{
	//맴버 필드로 ActionListener 객체의 참조값 정의학
	ActionListener listener =new ActionListener() { 
		//리스너도 등록한 객체에서 이벤트가 일어나면 호출되는 메소드 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	};

	
	//생성자
	public MyFrame2() {
		 initUI();
		
	}
	//초기화 메소드
	public void initUI() {
		//레이아웃 설정
		setLayout(new BorderLayout());
		//패널 객체 생성
		JPanel panel=new JPanel();
		//버튼 객체 생성
		JButton button=new JButton("눌러보세요");
		//버튼에 ActionListener 등록하기
		button.addActionListener(listener);
		//버튼을 패널에 추가
		panel.add(button);
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
		new MyFrame2();
	}
}
