package project_demo;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TrafficLight extends JFrame {

	JButton jbt_red,jbt_yellow,jbt_blue;  // ������ ����

	Object sycObject = new Object();
	
	//����Ŭ����(Inner class) : �ܺ�Ŭ����(_02_ThreadTest2_Block_Sync)��  ��� ��Ҹ� ����� �� �ִ�.
	class signalRunnable implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			//this�ƴ�
			String name = Thread.currentThread().getName();
			
			while(true){
				if(name.equals("R")){
					synchronized(sycObject){
						//����ȭ�� �����ָ� �ٲ����ų� �ΰ��� ������ ������ �Ͼ��.
						jbt_red.setBackground(Color.red);
						jbt_yellow.setBackground(Color.gray);
						jbt_blue.setBackground(Color.gray);

						jbt_red.setText("O");
						jbt_yellow.setText("X");
						jbt_blue.setText("X");

						try {
							//������ �����ָ� ��û ������
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
		super("������ ����ȭ");

		this.setLayout(new GridLayout(1,3));
		
		this.add(jbt_red = new JButton());
		this.add(jbt_yellow = new JButton());
		this.add(jbt_blue = new JButton());
		
		jbt_red.setBackground(Color.red);
		jbt_yellow.setBackground(Color.yellow);
		jbt_blue.setBackground(Color.blue);
		
		//������ ���ఴü ����
		Runnable runnable =new signalRunnable();
		//                      ���ఴü �̸�
		Thread t_red = new Thread(runnable,"R"); //�� 
		Thread t_yellow = new Thread(runnable,"Y"); //��
		Thread t_blue = new Thread(runnable,"B"); //��
		
		//������ ���� : �����Ǵ°� �ƴ� ����Ǵ� ����, �����ڵ�X, ���� ��������
		t_red.start();
		t_yellow.start();
		t_blue.start();
		
		
		//��ġ
		this.setLocation(200, 100);
		//ũ��
		this.setSize(300, 120);
		//�����ֱ�
		this.setVisible(true);
		//����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new TrafficLight();
	}

}
