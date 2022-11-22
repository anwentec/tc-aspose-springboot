package cn.plmnext.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pdf")
public class PdfController {

    /**
     * PDF文档签字
     * @return
     */
    @PostMapping("/sign")
    @ResponseBody
    public String sign()
    {
        // TODO

        return "sign";
    }
}
