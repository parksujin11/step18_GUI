package example1;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.bind.Marshaller.Listener;
/*
 * MyFrame 객체는 Component type 도 되고 JFrame type 도 되고 ActionListener type 도 된다. 
 */
public class MyFrame7 extends JFrame implements ActionListener{
	//JTextField 객체의 참조값을 저장할 필드 선언
	JTextField inputNum1, inputNum2,result;
	//생성자
	public MyFrame7() {
		 initUI();
		
	}
	//초기화 메소드
	public void initUI() {
		//레이아웃 설정
		setLayout(new BorderLayout());
		
		//패널 객체 생성
		JPanel panel=new JPanel();
		
		//문자열을 입력 받을 수 있는 JTextField 객체
		inputNum1 =new JTextField(10);
		inputNum2 =new JTextField(10);
		
		
		//결과를 출력한 TextField
		result=new JTextField(10);
		
		JButton plusBtn=new JButton("+");
		JButton minusBtn=new JButton("-");
		JButton multiBtn=new JButton("*");
		JButton divideBtn=new JButton("/");
		
		//버튼에 ActionListener 객체 등록
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		multiBtn.addActionListener(this);
		divideBtn.addActionListener(this);
		//버튼에 action command 등록
		plusBtn.setActionCommand("plus");
		minusBtn.setActionCommand("minus");
		multiBtn.setActionCommand("multi");
		divideBtn.setActionCommand("divide");
		
		//레이블 객체 생성 
		JLabel equalLabel=new JLabel("=");
		
		//패널에 UI  추가
		panel.add(inputNum1);
		panel.add(plusBtn);
		panel.add(minusBtn);
		panel.add(multiBtn);
		panel.add(divideBtn);
		panel.add(inputNum2);
		panel.add(equalLabel);
		panel.add(result);
		

		//패널을 프레임의 위쪽 에 배치
		add(panel, BorderLayout.NORTH);
		
		//setBounds(x, y, width, height)
		setBounds(200, 200, 800, 500);
		//x 를 눌러서 창을 닫을때 프로세스가 종료 되도록
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 프레임 객체가 화면에 보이도록 
		setVisible(true);
		
	}
	//메인 메소드 
	public static void main(String[] args) {
		new MyFrame7();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		double num1=Double.parseDouble(inputNum1.getText());
		double num2=Double.parseDouble(inputNum2.getText());
		
		String command=e.getActionCommand();
		//입력한 문자열을 
		//결과 값을 담을 변수 만들기
		double result=0;
		
		if(command.equals("plus")) {
				result=num1+num2;
		}else if(command.equals("minus")) {
				result=num1-num2;
		}else if(command.equals("multi")) {
				result=num1*num2;
		}else if(command.equals("divide")){
				result=num1/num2;
		}
		

		//출력하기
		this.result.setText(Double.toString(result));
		}

}

