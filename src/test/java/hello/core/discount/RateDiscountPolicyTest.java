package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.AbstractIntegerAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인 적용이 되어야함.")
        //
    void vip_o() {
        //given
        Member memberVIP = new Member(1L, "memberVIP", Grade.VIP);
        //when
        int discount = rateDiscountPolicy.discount(memberVIP, 10000); //만원
        //then
        Assertions.assertThat(discount).isEqualTo(1000); //할인된 금액은 1000원이 나와야한다.
    }

    @Test
    @DisplayName("할인이 적용되지 않아야 한다.")
    void vip_x() {
        //given
        Member memberVIP = new Member(2L, "memberBasic", Grade.BASIC);
        //when
        int discount = rateDiscountPolicy.discount(memberVIP, 10000); //만원
        //then
        //Assertions.assertThat(discount).isEqualTo(1000);
        Assertions.assertThat(discount).isEqualTo(0);
    }
}