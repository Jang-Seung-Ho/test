package com.itbank.finalProject4;

import java.util.List;

public interface ProductInter {
	//1.����Ʈ
	List<ProductDTO> list();
	//2.�Ѱ��˻�
	ProductDTO select(ProductDTO productDTO);
	//3.����
	void buy(ProductDTO productDTO);
	//4.��ٱ���
	void basket(ProductDTO productDTO);
}
