//package com.ct.nerverCT_master.service.serviceImpl;
//import com.bigdata.fxzcbx.dao.EdimMapper;
//import com.bigdata.fxzcbx.model.Edim;
//import com.bigdata.fxzcbx.service.EdimService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class EdimServiceImpl implements EdimService{
//
//	@Autowired
//	private EdimMapper edimMapper;
//
//	@Override
//	public List<Edim> getallDim() {
//		return edimMapper.getallDim();
//	}
//
//    @Override
//    public List<Edim> getallDimByUserId(String userid) {
//        return edimMapper.getallDimByUserId(userid);
//    }
//
//    @Override
//    public List<Edim> getallUploadgruop() {
//        return edimMapper.getallUploadgruop();
//    }
//
//    @Override
//    public List<String> getallUploadgruopname() {
//        return edimMapper.getallUploadgruopname();
//    }
//
//    @Override
//    public List getInvestmentEntityByUserId(String userid) {
//        return edimMapper.getInvestmentEntityByUserId(userid);
//    }
//
//
//}
