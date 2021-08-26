package org.zerock.ajaxserver.service;

import org.zerock.ajaxserver.dto.StoreDTO;

import java.util.ArrayList;
import java.util.List;

public enum StoreService {
    INSTANCE;

    private List<StoreDTO> storeDTOList;

    StoreService() {

//        {sno: 1, name: '무교동북어국집', lat: 37.5677429, lng: 126.9776194, menus: '북어국', cat: '한식'},
//        {sno: 2, name: '오카구라', lat: 37.5698057, lng: 126.9900538, menus: '라멘', cat: '일식'},
//        {sno: 3, name: '동원집', lat: 37.5698057, lng: 126.9900538, menus: '감자국', cat: '한식'},
//        {sno: 4, name: '하노이의 아침', lat: 37.57259873471039, lng: 126.98563597434777, menus: '쌀국수', cat: '분식'},
//        {sno: 5, name: '우육면관', lat: 37.56852804283341, lng: 126.98613289688826, menus: '우육면', cat: '분식'}

        storeDTOList = new ArrayList<>();
        storeDTOList.add(new StoreDTO(1L, "무교동북어국집", 37.5677429,126.9776194, "북어국", "한식"));
        storeDTOList.add(new StoreDTO(2L, "아현이의김치찌개", 37.5698057,126.9900538, "김치찌개", "한식"));
        storeDTOList.add(new StoreDTO(3L, "한슬이의순두부", 37.5698057,126.9900538, "순두부찌개", "한식"));
        storeDTOList.add(new StoreDTO(4L, "민지의비빔밥", 37.56852804283341,126.98613289688826, "비빔밥", "한식"));

    }

    public List<StoreDTO> getAll() {
        return this.storeDTOList;
    }

}
