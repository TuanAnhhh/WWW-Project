package com.websitedungcuthethao.controller.quantri;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quan-tri/quan-ly-nguoi-dung")
public class NguoiDungController {
	@GetMapping
	public String index() {
		return "quantri/danhsachnguoidung";
	}
}
