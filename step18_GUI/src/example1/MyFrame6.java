package example1;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.bind.Marshaller.Listener;
/*
 * MyFrame 객체는 Component type 도 되고 JFrame type 도 되고 ActionListener type 도 된다. 
 */
public class MyFrame6 extends JFrame implements ActionListener{
	//JTextField 객체의 참조값을 저장할 필드 선언
	JTextField textField, textField2;
	//생성자
	public MyFrame6() {
		 initUI();
		
	}
	//초기화 메소드
	public void initUI() {
		//레이아웃 설정
		setLayout(new BorderLayout());
		
		//패널 객체 생성
		JPanel panel=new JPanel();
		
		//문자열을 입력 받을 수 있는 JTextField 객체
		textField =new JTextField(10);
		textField2 =new JTextField(10);
		JButton sendBtn=new JButton("전송");
		
		sendBtn.addActionListener(this);
		
		//패널에 UI  추가
		panel.add(textField);
		panel.add(sendBtn);
		panel.add(textField2);
		
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
		new MyFrame6();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//첫번째 JTextField 에 입력한 문자열 읽어오기
		String msg=textField.getText();
		//e두번째 JTextField 에 넣어준다.
		textField2.setText(msg);
		//첫번째 JTextField 에 내용 삭제
		textField.setText("");
		}

}

