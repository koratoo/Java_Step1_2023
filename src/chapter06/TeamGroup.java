package chapter06;

public class TeamGroup {

	//�������
	private TeamMember[] member = new TeamMember[6];
	
	//�⺻ ������
	
	//�ʱ�ȭ �޼ҵ� init�� �⺻������ �ʱ�ȭ �۾��� �����
	public void init() {
		
		//����
		member[0] = new TeamMember("�躴ȿ","��");
		member[1] = new TeamMember("��ä��","��");
		member[2] = new TeamMember("������","��");
		member[3] = new TeamMember("������","��");
		member[4] = new TeamMember("������","��");
		member[5] = new TeamMember("������","��");
		

	}
	
	//��� �޼ҵ�
	public void Disp() {
		
		for(int i=0; i<member.length; i++) {
			System.out.println("���� : "+ member[i].getName() + " | ����: " +member[i].getGender() +" |");
		}
		
	}


	
	
	
	
}
