package com.itbank.finalProject4;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO implements ProductInter {

	@Autowired
	SqlSessionTemplate my;
	//dependency injection(狼粮己 林涝, di)
	//Inversion of Control(力绢狼 开青, IoC)
	
	@Override
	public List<ProductDTO> list() {
		return my.selectList("product.list");
	}

	@Override
	public ProductDTO select(ProductDTO productDTO) {
		return my.selectOne("product.one", productDTO);
	}

	@Override
	public void buy(ProductDTO productDTO) {

	}

	@Override
	public void basket(ProductDTO productDTO) {

	}

}
