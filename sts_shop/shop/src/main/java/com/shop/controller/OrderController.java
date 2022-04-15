package com.shop.controller;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.dto.OrderDto;
import com.shop.service.OrderService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class OrderController {
	private final OrderService orderService;

	@PostMapping(value = "/order")
	public @ResponseBody ResponseEntity order(@RequestBody @Valid OrderDto orderDto, BindingResult bindingResult,
			Principal principal) { // 스프링에서 비동기 처리한다.
// @RequestBody: http 요청 body 담긴 내용을 자바객체로 전달, @ResponseBody: 자바객체를 body로 전달
		if (bindingResult.hasErrors()) { // 주문정보를 받는 orderDto객체에 데이터바인딩 시 에러가 있는지 검사한다.
			StringBuilder sb = new StringBuilder();
			List<FieldError> fieldErrors = bindingResult.getFieldErrors();
			for (FieldError fieldError : fieldErrors) {
				sb.append(fieldError.getDefaultMessage());
			}
			return new ResponseEntity<String>(sb.toString(), HttpStatus.BAD_REQUEST);
		} // 에러정보를 ResponseEntity 객체에 담아 반환한다.
		String email = principal.getName(); // 현재 로그인 유저의 정보를 얻기 위해서 @Controller가 선언된 클래스에서 메소드 인자로
// principal 객체를 넘겨 줄 경우, 해당 객체에 직접 접근할 수 있다. principal 객체에서 현재 로그인한 회원의 이메일 정보를 조회한다.
		Long orderId;
		try {
			orderId = orderService.order(orderDto, email); // 화면으로 넘어오는 주문정보와 회원의 이메일 정보를 이용하여 주문로직을 호출한다.
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Long>(orderId, HttpStatus.OK);
	} // 결과값으로 생성된 주문번호와 요청이 성공했다는 http응답상태코드를 반환한다.
}