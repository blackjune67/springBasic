package hello.core.member;

public class MemberServiceImpl implements MemberService {

    /*
    * Change, DIP 위반을 하기때문에 아래와 같이 변경함.
    * */
    //private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final MemberRepository memberRepository;

    //생성자를 만들었다, 생성자 주입을 위한 용도.
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
