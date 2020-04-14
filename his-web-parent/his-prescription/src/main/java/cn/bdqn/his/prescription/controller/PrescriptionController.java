package cn.bdqn.his.prescription.controller;

import cn.bdqn.his.common.http.HttpClientHelper;
import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.prescription.entity.PTemp;
import cn.bdqn.his.prescription.service.PInfoService;
import cn.bdqn.his.prescription.service.PTempService;
import cn.bdqn.his.prescription.service.impl.PTempServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api
@RestController
@Slf4j
@RequestMapping("/api")
public class PrescriptionController {
    @Value("${server.medicine.url}")
    private String serverMedicineUrl;
    @Value("${server.masterdata.url}")
    private String serverMasterdataUrl;
    @Resource
    private HttpClientHelper httpClientHelper;

    @Autowired
    PTempService pTempService;
    @Resource
    PInfoService pInfoService;

    @ApiOperation(value = "调用药品模块api,分页查询药品列表",response = Response.class)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码，查询第几页数据,必填",name = "pageNum", required = true),
            @ApiImplicitParam(value = "每页显示几条,必填",name = "pageSize", required = true)
    })
    @GetMapping("getMedicines")
    public Response getMedicines(Integer pageNum, Integer pageSize) {
        return httpClientHelper.getForResponse(serverMedicineUrl + "/api/medicines?pageNum="+pageNum+"&pageSize="+pageSize);
    }
    @ApiOperation(value = "调用药品模块api,分页查询药品列表",response = Response.class)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码，查询第几页数据,必填",name = "pageNum", required = true),
            @ApiImplicitParam(value = "每页显示几条,必填",name = "pageSize", required = true),
            @ApiImplicitParam(value = "药品分类ID",name = "typeId"),
            @ApiImplicitParam(value = "药品名称，模糊匹配",name = "name")
    })
    @GetMapping(value = "getMedicines/findBy")
    public Response getMedicines(Integer pageNum, Integer pageSize, Integer typeId, String name) throws Exception {
        if(pageNum == null) pageNum = 1;
        if(pageSize == null) pageSize = 5;
        StringBuffer buffer = new StringBuffer("?").append("pageNum=").append(pageNum).append("&pageSize=").append(pageSize);
        if(typeId!=null) {
            buffer.append("&typeId=").append(typeId);
        }
        if(!StringUtils.isEmpty(name)) {
            buffer.append("&name=").append(URLEncoder.encode(name, "UTF-8"));
        }
        log.debug("params:{}", buffer);
        return httpClientHelper.getForResponse(serverMedicineUrl + "/api/medicines/findBy"+ buffer);
    }

    @ApiOperation(value = "查询处方模板",response = Response.class)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "处方类别，不填默认查全部",name = "typeId"),
            @ApiImplicitParam(value = "模板权限，不填默认查全部",name = "permissionId"),
            @ApiImplicitParam(value = "模板编码/模板名称，模糊匹配",name = "name")
    })
    @GetMapping(value = "getTemplate/findBy")
    public Response getTemplate(Integer typeId,Integer permissionId,String name) throws Exception {
        List<PTemp> list = pTempService.findTemplate(typeId,permissionId,name);
        return new Response().setResponseBody(list);
    }

    @ApiOperation(value = "根据处方编号查询详情",response = Response.class)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "处方编号",name = "code")
    })
    @GetMapping(value = "/getPInfo")
    public Response findPInfo(String code) throws Exception {
        return new Response().setResponseBody(pInfoService.findPreInfo(code));
    }

    @ApiOperation(value = "查询所有诊断(疾病)字典",response = Response.class)
    @GetMapping(value = "/getIllness")
    public Response getIllness() throws Exception {
        return httpClientHelper.getForResponse(serverMasterdataUrl+"/api/masterdata/getIllness");
    }

    @ApiOperation(value = "查询所有医嘱字典",response = Response.class)
    @GetMapping(value = "/getAdvice")
    public Response getAdvice() throws Exception {
        return httpClientHelper.getForResponse(serverMasterdataUrl+"/api/masterdata/getAdvice");
    }

}
