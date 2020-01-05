package com.itbank.finalProject4;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@Autowired
	ProductDAO dao;
	
	@RequestMapping("product")
	public void list(Model model) {
		List<ProductDTO> list =  dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("one")
	public void one(ProductDTO productDTO, Model model) {
		ProductDTO dto = dao.select(productDTO);
		model.addAttribute("dto", dto);
	}
	
	@RequestMapping("basket")
	public void basket(ProductDTO productDTO, HttpSession session) {
		//1.������ �̿��� ��ٱ��� ó��
		//��ٱ��ϰ� �̹� ������� �ִ��� Ȯ��
		//��ٱ��� ������ ������� �ִ��� Ȯ��
		ArrayList<ProductDTO> list = (ArrayList<ProductDTO>)session.getAttribute("basket");
		
		if(list != null){
			list.add(productDTO);			
		}else {
			list = new ArrayList<ProductDTO>();
			list.add(productDTO);
		}
		session.setAttribute("basket", list);
		System.out.println("��ٱ��ϳ���");
		System.out.println(list);
		//2. ��ٱ���(list session)�� �̹� �ִ� ���
		//   -> ����� �ڱ���ͼ�
		//   -> ��Ͽ� �� dto�� �߰�
		//   -> dto�� �߰��� ����� �ٽ� �������� ����
		//3. ��ٱ��ϰ� ���°��
		//   -> list�� ����
		//   -> �� list�� �������� ����
		
		//4. ��ٱ����� ��������� �� �ݾ���
		//   ������ top2.jsp�� �־��ֱ� ���ؼ���
		//   �ѱݾ��� ���ؼ� session�� �Ӽ����� set!
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			ProductDTO dto2 = list.get(i);
			sum = sum + Integer.parseInt(dto2.getPrice());
		}
		session.setAttribute("total", sum);
		
		session.setAttribute("count", list.size());
//		basket.add(productDTO);
//		session.setAttribute("basket", basket);
		
	}
}
