package project_demo;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TrafficLight extends JFrame {

	JButton jbt_red,jbt_yellow,jbt_blue;  // 변수명 설정

	Object sycObject = new Object();
	
	//내부클래스(Inner class) : 외부클래스(_02_ThreadTest2_Block_Sync)의  모든 요소를 사용할 수 있다.
	class signalRunnable implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			//this아님
			String name = Thread.currentThread().getName();
			
			while(true){
				if(name.equals("R")){
					synchronized(sycObject){
						//동기화를 안해주면 다꺼지거나 두개가 켜지는 현상이 일어난다.
						jbt_red.setBackground(Color.red);
						jbt_yellow.setBackground(Color.gray);
						jbt_blue.setBackground(Color.gray);

						jbt_red.setText("O");
						jbt_yellow.setText("X");
						jbt_blue.setText("X");

						try {
							//슬립을 안해주면 엄청 빨리돔
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
					
				}else if(name.equals("Y")) {
					
					
					synchronized (sycObject)
					{
						jbt_red.setBackground(Color.gray);
						jbt_yellow.setBackground(Color.yellow);
						jbt_blue.setBackground(Color.gray);

						jbt_red.setText("X");
						jbt_yellow.setText("O");
						jbt_blue.setText("X");

						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					
					
				}else if(name.equals("B")) {
					
					
					synchronized (sycObject) 
					{
						jbt_red.setBackground(Color.gray);
						jbt_yellow.setBackground(Color.gray);
						jbt_blue.setBackground(Color.blue);

						jbt_red.setText("X");
						jbt_yellow.setText("X");
						jbt_blue.setText("O");

						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					
				}
	
				
			}// while-end
			
			
		}// run - end
		
	} // SignalRunnable - end 

	
	
	public TrafficLight() {
		super("쓰레드 동기화");

		this.setLayout(new GridLayout(1,3));
		
		this.add(jbt_red = new JButton());
		this.add(jbt_yellow = new JButton());
		this.add(jbt_blue = new JButton());
		
		jbt_red.setBackground(Color.red);
		jbt_yellow.setBackground(Color.yellow);
		jbt_blue.setBackground(Color.blue);
		
		//쓰레드 수행객체 생성
		Runnable runnable =new signalRunnable();
		//                      수행객체 이름
		Thread t_red = new Thread(runnable,"R"); //빨 
		Thread t_yellow = new Thread(runnable,"Y"); //노
		Thread t_blue = new Thread(runnable,"B"); //파
		
		//쓰레드 구동 : 공유되는게 아닌 복사되는 개념, 같은코드X, 각각 독립적임
		t_red.start();
		t_yellow.start();
		t_blue.start();
		
		
		//위치
		this.setLocation(200, 100);
		//크기
		this.setSize(300, 120);
		//보여주기
		this.setVisible(true);
		//종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new TrafficLight();
	}

}
