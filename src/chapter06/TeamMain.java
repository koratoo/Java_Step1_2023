package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		TeamGroup team = new TeamGroup();
		TeamMember t = new TeamMember();
		//메소드를 통해 팀명 초기화
		System.out.println("-------[팀 명]-------");
		t.setTeamName("IT프렌즈");
		System.out.println("팀명  : " + t.getTeamName());
		t.setmName("김병효");
		t.setmPhone("010-1234-1234");
		t.setsName("이채윤");
		System.out.println("팀장  : " + t.getmName());
		System.out.println("핸드폰 : " + t.getmPhone());
		System.out.println("부팀장 : " + t.getsName());
		System.out.println("------[팀원 명단]------");
		team.init();//초기화 -> 안넣어주면 nullpointException이 뜬다.
		team.Disp();//출력
		
		
	}
}
