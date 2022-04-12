package com.shop.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import com.shop.dto.MemberFormDto;
import com.shop.repository.CartRepository;
import com.shop.repository.MemberRepository;


@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
class CartTest {
	@Autowired
	CartRepository cartRepository;

	@Autowired
	MemberRepository memberRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	@PersistenceContext
	EntityManager em;

	public Member createMember() {
		MemberFormDto memberFormDto = new MemberFormDto();
		memberFormDto.setEmail("test@email.com");
		memberFormDto.setName("홍길동");
		memberFormDto.setAddress("서울시 마포구 합정동");
		memberFormDto.setPassword("1234");
		return Member.createMember(memberFormDto, passwordEncoder);
	}

	@Test
	@DisplayName("장바구니 회원 엔티티 매핑 조회 테스트")
	public void findCartAndMemberTest() {
		Member member = createMember();
		memberRepository.save(member);
		Cart cart = new Cart();
		cart.setMember(member);
		cartRepository.save(cart);
		em.flush(); // 트랜잭션이 끝날 때 영속성 컨텍스트에 저장 후 flush()를 호출하여 DB에 반영한다.
		em.clear(); // 장바구니 엔티티를 가지고 올 때 회원 엔티티도 함께 가져오는지 보기 위해서 영속성 컨텍스트를 비워준다.
		Cart savedCart = cartRepository.findById(cart.getId()) // 저장된 장바구니 엔티티를 조회한다.
				.orElseThrow(EntityNotFoundException::new);
		assertEquals(savedCart.getMember().getId(), member.getId()); // 처음에 저장한 member엔티티의 id와
		// savedCart에 매핑된 member엔티티의 id를 비교한다.
	}
}
