package core.sangdologis.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(String memberId);
}
