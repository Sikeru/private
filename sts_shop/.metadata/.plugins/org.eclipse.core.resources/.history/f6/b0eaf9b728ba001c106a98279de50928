package com.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "cart_item")
public class CartItem {
	@Id
	@GeneratedValue
	@Column(name = "cart_item_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "cart_id") // 하나의 장바구니에는 여러 상품을 담을 수 있기에 다대일 연관 관계
	private Cart cart;
	@ManyToOne
	@JoinColumn(name = "item_id") // 장바구니에 담을 상품 정보를 알아야 하므로 상품 엔티티를 매핑해준다.
	private Item item;
	private int count; // 같은 상품을 장바구니에 몇 개 담을지 저장한다.
}