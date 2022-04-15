package com.shop.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shop.dto.OrderDto;
import com.shop.entity.Item;
import com.shop.entity.Member;
import com.shop.entity.Order;
import com.shop.entity.OrderItem;
import com.shop.repository.ItemRepository;
import com.shop.repository.MemberRepository;
import com.shop.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderService {
	private final ItemRepository itemRepository;
	private final MemberRepository memberRepository;
	private final OrderRepository orderRepository;

	public Long order(OrderDto orderDto, String email) {
		Item item = itemRepository.findById(orderDto.getItemId()) // 주문할 상품을 조회한다.
				.orElseThrow(EntityNotFoundException::new);
		Member member = memberRepository.findByEmail(email); // 현재 로그인한 회원의 이메일 정보를 이용해서
// 회원정보를 조회한다.
		List<OrderItem> orderItemList = new ArrayList<>();
		OrderItem orderItem = OrderItem.createOrderItem(item, orderDto.getCount()); // 주문할 상품 엔티티와 주문수량을
// 이용해서 주문상품 엔티티를 생성한다.
		orderItemList.add(orderItem);
		Order order = Order.createOrder(member, orderItemList); // 회원정보와 주문할 상품 리스트 정보를 이용하여
// 주문 엔티티를 생성한다.
		orderRepository.save(order); // 생성한 주문 엔티티를 저장한다.
		return order.getId();
	}
}