package src.employment.board;

public class BoardObject {
	private int employmentBoardId;
	private String title;
	private String jobType;
	private String career;
	private String hiringProcess;
	private String qualifications;
	private String preferred;
	private int mainCategory1Id;
	private int mainCategory2Id;
	private int subCategory1Id;
	private int subCategory2Id;
	private String companyName;
	
	// 게시글의 정보는 임의로 바꿀 수 없게 setter 를 없앴음.
	public int getEmploymentBoardId() {
		return employmentBoardId;
	}
	public String getTitle() {
		return title;
	}
	public String getJobType() {
		return jobType;
	}
	public String getCareer() {
		return career;
	}
	public String getHiringProcess() {
		return hiringProcess;
	}
	public String getQualifications() {
		return qualifications;
	}
	public String getPreferred() {
		return preferred;
	}
	public int getMainCategory1Id() {
		return mainCategory1Id;
	}
	public int getMainCategory2Id() {
		return mainCategory2Id;
	}
	public int getSubCategory1Id() {
		return subCategory1Id;
	}
	public int getSubCategory2Id() {
		return subCategory2Id;
	}
	public String getCompanyName() {
		return companyName;
	}
	
	// 생성자에서 모든 값들을 초기화하고, 수정은 불가능함.
	public BoardObject(int employmentBoardId, String title, String jobType, String career,
			String hiringProcess, String qualifications, String preferred, int mainCategory1Id,
			int mainCategory2Id, int subCategory1Id, int subCategory2Id, String companyName) {
		this.employmentBoardId = employmentBoardId;
		this.title = title;
		this.jobType = jobType;
		this.career = career;
		this.hiringProcess = hiringProcess;
		this.qualifications = qualifications;
		this.preferred = preferred;
		this.mainCategory1Id = mainCategory1Id;
		this.mainCategory2Id = mainCategory2Id;
		this.subCategory1Id = subCategory1Id;
		this.subCategory2Id = subCategory2Id;
		this.companyName = companyName;
	}
	
}
