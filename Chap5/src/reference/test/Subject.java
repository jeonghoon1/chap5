package reference.test;

public class Subject {
	String subjectName;
	int subjectScore;
	
	// ������� �Ű������� ���� ������
	
	public Subject(String name) {
		subjectName = name;
	}
	public Subject(int score) {
		subjectScore = score;
		
	}
		
	
	// �� ��� ������ ���� �����ϰ� ��ȯ�ϴ� �޼��� �߰�

	public void setSubjectName(String name) {
		subjectName = name;
		
	}
	public String getSubjectName() {
		return subjectName;
		
	}
	public void setSubjectScore(int score) {
		subjectScore = score;
	}
	public int getSubjectScore() {
		return subjectScore;
		
	}
}

