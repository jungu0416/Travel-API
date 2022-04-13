package dev.potatoo.travel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.potatoo.travel.model.CheckArea;
import dev.potatoo.travel.repository.TravelMapper;


@Service
public class TravelService {
	TravelMapper travelMapper;
	
	//생성자
	public TravelService(TravelMapper travelMapper) {
		this.travelMapper = travelMapper;
	}
	
	/* 지역 색칠여부 확인 */
	public List<CheckArea> checkArea(){
		return travelMapper.checkArea();
	}
	
	/* 지역 삽입 */
	public int insertArea(List<String> location) {
		return travelMapper.insertArea(location);
	}
	
	/* 지역 Y로 업데이트 */
	public int updateAreaY(String location) {
		return travelMapper.updateAreaY(location);
	}
	
	/* 지역 N으로 업데이트 */
	public int updateAreaN(String location) {
		return travelMapper.updateAreaN(location);
	}
	
	
	
	
}
