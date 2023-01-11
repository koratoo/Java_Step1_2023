package chapter06;

public class TeamGroup {

	//멤버변수
	private TeamMember[] member = new TeamMember[6];
	
	//기본 생성자
	
	//초기화 메소드 init은 기본적으로 초기화 작업을 얘기함
	public void init() {
		
		//팀원
		member[0] = new TeamMember("김병효","남");
		member[1] = new TeamMember("이채윤","여");
		member[2] = new TeamMember("김형우","남");
		member[3] = new TeamMember("김지성","남");
		member[4] = new TeamMember("윤민주","여");
		member[5] = new TeamMember("김주은","여");
		

	}
	
	//출력 메소드
	public void Disp() {
		
		for(int i=0; i<member.length; i++) {
			System.out.println("성명 : "+ member[i].getName() + " | 성별: " +member[i].getGender() +" |");
		}
		
	}


	
	
	
	
}
