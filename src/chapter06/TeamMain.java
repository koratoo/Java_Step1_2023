package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		TeamGroup team = new TeamGroup();
		TeamMember t = new TeamMember();
		//�޼ҵ带 ���� ���� �ʱ�ȭ
		System.out.println("-------[�� ��]-------");
		t.setTeamName("IT������");
		System.out.println("����  : " + t.getTeamName());
		t.setmName("�躴ȿ");
		t.setmPhone("010-1234-1234");
		t.setsName("��ä��");
		System.out.println("����  : " + t.getmName());
		System.out.println("�ڵ��� : " + t.getmPhone());
		System.out.println("������ : " + t.getsName());
		System.out.println("------[���� ���]------");
		team.init();//�ʱ�ȭ -> �ȳ־��ָ� nullpointException�� ���.
		team.Disp();//���
		
		
	}
}
