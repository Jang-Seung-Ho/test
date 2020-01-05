package com.itbank.finalProject4;

import java.util.List;

public interface ProductInter {
	//1.리스트
	List<ProductDTO> list();
	//2.한개검색
	ProductDTO select(ProductDTO productDTO);
	//3.구매
	void buy(ProductDTO productDTO);
	//4.장바구니
	void basket(ProductDTO productDTO);
}
