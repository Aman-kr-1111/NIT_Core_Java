package nov09.test.set_B.library_system;

public class Member {
	private int memberId;
	private String memberName;
	private String membershipType;
	private Book book;

	public Member(int memberId, String memberName, String membershipType, Book book) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.membershipType = membershipType;
		this.book = book;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", membershipType=" + membershipType
				+ ", book=" + book + "]";
	}

}
