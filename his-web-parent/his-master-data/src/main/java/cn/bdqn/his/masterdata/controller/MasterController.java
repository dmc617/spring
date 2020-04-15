package cn.bdqn.his.masterdata.controller;

import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.masterdata.entity.TbDoctoradvice;
import cn.bdqn.his.masterdata.entity.TbIllness;
import cn.bdqn.his.masterdata.service.impl.CheckitemServiceImpl;
import cn.bdqn.his.masterdata.service.impl.PatientInfoServiceImpl;
import cn.bdqn.his.masterdata.service.impl.TbDoctoradviceServiceImpl;
import cn.bdqn.his.masterdata.service.impl.TbIllnessServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
@RequestMapping("/api/masterdata")
public class MasterController {

    @Autowired
    TbDoctoradviceServiceImpl doctorAdviceService;
    @Autowired
    TbIllnessServiceImpl illnessService;
    @Autowired
    CheckitemServiceImpl checkitemService;
    @Autowired
    PatientInfoServiceImpl patientInfoService;

    
    @GetMapping("/getIllness")
    public Response getIllness(){
        return new Response(ResponseEnum.SUCCESS).setResponseBody(illnessService.getAll());
    }

    @GetMapping("/getAdvice")
    public Response getAdvice(){
        return new Response(ResponseEnum.SUCCESS).setResponseBody(doctorAdviceService.getAll());
    }

    @GetMapping("/getCheckItem")
    public Response getCheckItem(Integer status,String name){
        return new Response(ResponseEnum.SUCCESS).setResponseBody(checkitemService.find(status,name));
    }

    @GetMapping("/getPatient")
    public Response getPatient(String name){
        return new Response(ResponseEnum.SUCCESS).setResponseBody(patientInfoService.findByName(name));
    }

    @GetMapping("/saveIllness")
    public Response saveIllness(TbIllness illness){
        return new Response(ResponseEnum.SUCCESS).setResponseBody(illnessService.save(illness));
    }

    @GetMapping("/saveDoctorAdvice")
    public Response saveDoctorAdvice(TbDoctoradvice doctorAdvice){
        return new Response(ResponseEnum.SUCCESS).setResponseBody(doctorAdviceService.save(doctorAdvice));
    }
}
