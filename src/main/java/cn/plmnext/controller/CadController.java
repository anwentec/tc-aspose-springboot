package cn.plmnext.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cad")
public class CadController {

    /**
     * CAD文档签字
     * @return
     */
    @PostMapping("/sign")
    @ResponseBody
    public String sign()
    {
        // TODO

        return "sign";
    }

    /**
     * CAD文档转PDF
     * @return
     */
    @PostMapping("/trans2pdf")
    @ResponseBody
    public String trans2pdf()
    {
        // TODO
        return "trans2pdf";
    }

    /**
     * CAD文档签字，并且转PDF
     * @return
     */
    @PostMapping("/sign2pdf")
    @ResponseBody
    public String sign2pdf()
    {
        // TODO
        return "sign2pdf";
    }
}
