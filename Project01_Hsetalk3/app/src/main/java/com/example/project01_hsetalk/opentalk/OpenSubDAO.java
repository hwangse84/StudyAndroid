package com.example.project01_hsetalk.opentalk;

import com.example.project01_hsetalk.R;

import java.util.ArrayList;

public class OpenSubDAO {

    public ArrayList<OpenSubDTOS.OpenSubDTO> getOpenSubList() {
        ArrayList<OpenSubDTOS.OpenSubDTO> list = new ArrayList<>();
        list.add(new OpenSubDTOS().new OpenSubDTO(R.drawable.friend_back_img1, 1500, "광주 월전동", "사진2개 보냄" , "오후 1시"));
        list.add(new OpenSubDTOS().new OpenSubDTO(R.drawable.friend_back_img2, 1500, "서구청", "사진2개 보냄",  "오후 1시"));
        list.add(new OpenSubDTOS().new OpenSubDTO(R.drawable.friend_back_img3, 1500, "한울201반", "사진2개 보냄",  "오후 1시"));
        list.add(new OpenSubDTOS().new OpenSubDTO(R.drawable.friend_back_img4, 1500, "어린이모임", "사진2개 보냄", "오후 1시"));

        return list;
    }
    public ArrayList<OpenSubDTOS.OpenSub2DTO> getOpenSub2List() {
        ArrayList<OpenSubDTOS.OpenSub2DTO> list = new ArrayList<>();
        list.add(new OpenSubDTOS().new OpenSub2DTO(R.drawable.friend_back_img5, 1500, "언니들모여",  "오후 1시"));
        list.add(new OpenSubDTOS().new OpenSub2DTO(R.drawable.friend_back_img6, 1500, "다같이놀자",  "오후 1시"));
        list.add(new OpenSubDTOS().new OpenSub2DTO(R.drawable.friend_back_img7, 1500, "동네한바퀴",  "오후 1시"));
        list.add(new OpenSubDTOS().new OpenSub2DTO(R.drawable.friend_back_img8, 1500, "바둑이랑함께해",  "오후 1시"));

        return list;
    }
    public ArrayList<OpenSubDTOS.OpenSub3DTO> getOpenSub3List() {
        ArrayList<OpenSubDTOS.OpenSub3DTO> list = new ArrayList<>();
        String[] arr = {"aa","bb","cc","dd"};

        list.add(new OpenSubDTOS().new OpenSub3DTO(R.drawable.friend_back_img9, 1500, "학교종", "사진2개 보냄",new String[]{"aa"}));
        list.add(new OpenSubDTOS().new OpenSub3DTO(R.drawable.friend_back_img10, 1500, "땡떙떙", "사진2개 보냄",new String[]{"bb"}));
        list.add(new OpenSubDTOS().new OpenSub3DTO(R.drawable.friend_back_img3, 1500, "땡떙떙", "사진2개 보냄",new String[]{"cc"}));
        list.add(new OpenSubDTOS().new OpenSub3DTO(R.drawable.friend_back_img5, 1500, "땡떙떙", "사진2개 보냄",new String[]{"dd"}));

        return list;
    }

}
