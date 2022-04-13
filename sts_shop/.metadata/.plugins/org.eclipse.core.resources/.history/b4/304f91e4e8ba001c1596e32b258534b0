package com.shop.service;

import com.shop.entity.ItemImg;
import com.shop.repository.ItemImgRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.util.StringUtils;

@Service
@RequiredArgsConstructor
@Transactional
public class ItemImgService {
	@Value("${itemImgLocation}") // applicatin.properties에 등록한 itemImgLocation값을 불러와 변수 itemImgLocation 에 넣는다.
	private String itemImgLocation;
	private final ItemImgRepository itemImgRepository;
	private final FileService fileService;

	public void saveItemImg(ItemImg itemImg, MultipartFile itemImgFile) throws Exception {
		String oriImgName = itemImgFile.getOriginalFilename();
		String imgName = "";
		String imgUrl = "";
//파일 업로드
		if (!StringUtils.isEmpty(oriImgName)) {
			imgName = fileService.uploadFile(itemImgLocation, oriImgName, itemImgFile.getBytes()); // 사용자가 상품 이미지를 등록했다면
																									// 저장할 경로, 파일 이름, 파일
																									// 바이트수를 파라미터로 하는
																									// uploadFile 매소드를
																									// 호출한다.
			imgUrl = "/images/item/" + imgName; // 저장한 상품 이미지를 불러올 경로를 설정한다. C:/shop/images/item/
		}
//상품 이미지 정보 저장
		itemImg.updateItemImg(oriImgName, imgName, imgUrl); // 업로드했던 상품 이미지 파일의 원래 이름, 실제 로컬에 저장된 상품 이미지 파일의 이름,
		itemImgRepository.save(itemImg); // 업로드 결과 로컬에 저장된 상품 이미지 파일을 불러오는 경로 등의 상품 이미지 정보를 저장한다.
	}
}