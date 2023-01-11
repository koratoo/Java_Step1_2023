package chapter06;

public class TeamMember {

	//멤버변수(나중에 오라클의 데이터 역할)
	//데이터베이스 이름이랑 대소문자도 틀리면 안됨
	//데이터 베이스가 없기 때문에 TeamGroup의 init을 통해 사용 중임
	public String teamName;//팀명
	public String mName;//팀장
	public String sName;//부팀장
	public String mPhone;//팀장번호
	public String name;//팀원
	public String gender;//팀원 성별
	
	
	
	//기본 생성자
	public TeamMember() {}
	
	//오버로딩(생성자 일부를 초기화)
	public TeamMember(String name, String gender) {
		this.name=name;
		this.gender=gender;
	}

	//메서드를 통한 초기화 작업
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getmPhone() {
		return mPhone;
	}

	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
