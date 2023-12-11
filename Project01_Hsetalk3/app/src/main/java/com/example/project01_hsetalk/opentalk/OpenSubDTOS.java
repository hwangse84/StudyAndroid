package com.example.project01_hsetalk.opentalk;

public class OpenSubDTOS {

    public class OpenSubDTO {

        private int imgTitle, chatCnt;
        private String roomTitie;

        public OpenSubDTO(int imgTitle, int chatCnt, String roomTitie, String recentChat, String chatDate) {
            this.imgTitle = imgTitle;
            this.chatCnt = chatCnt;
            this.roomTitie = roomTitie;
            this.recentChat = recentChat;
            this.chatDate = chatDate;
        }

        private String recentChat;
        private String chatDate;

        public int getImgTitle() {
            return imgTitle;
        }

        public void setImgTitle(int imgTitle) {
            this.imgTitle = imgTitle;
        }

        public int getChatCnt() {
            return chatCnt;
        }

        public void setChatCnt(int chatCnt) {
            this.chatCnt = chatCnt;
        }

        public String getRoomTitie() {
            return roomTitie;
        }

        public void setRoomTitie(String roomTitie) {
            this.roomTitie = roomTitie;
        }

        public String getRecentChat() {
            return recentChat;
        }

        public void setRecentChat(String recentChat) {
            this.recentChat = recentChat;
        }

        public String getChatDate() {
            return chatDate;
        }

        public void setChatDate(String chatDate) {
            this.chatDate = chatDate;
        }
    }

    public class OpenSub2DTO {
        private int imgTitle, chatCnt;
        private String roomTitie, recent;
        private String[] tagArr;

        public OpenSub2DTO(int imgTitle, int chatCnt, String roomTitie, String recent, String[] tagArr) {
            this.imgTitle = imgTitle;
            this.chatCnt = chatCnt;
            this.roomTitie = roomTitie;
            this.recent = recent;
            this.tagArr = tagArr;
        }

        public int getImgTitle() {
            return imgTitle;
        }

        public void setImgTitle(int imgTitle) {
            this.imgTitle = imgTitle;
        }

        public String[] getTagArr() {
            return tagArr;
        }

        public void setTagArr(String[] tagArr) {
            this.tagArr = tagArr;
        }

        public int getChatCnt() {
            return chatCnt;
        }

        public void setChatCnt(int chatCnt) {
            this.chatCnt = chatCnt;
        }

        public String getRoomTitie() {
            return roomTitie;
        }

        public void setRoomTitie(String roomTitie) {
            this.roomTitie = roomTitie;
        }

        public String getRecent() {
            return recent;
        }

        public void setRecent(String recent) {
            this.recent = recent;
        }
    }

    public class OpenSub3DTO {
        private int chatCnt, backgroungImgRes;
        private String roomTitie, recentChat;
        private String[] tagArr;


        public OpenSub3DTO(int chatCnt, int backgroungImgRes, String roomTitie, String recentChat, String[] tagArr) {
            this.chatCnt = chatCnt;
            this.backgroungImgRes = backgroungImgRes;
            this.roomTitie = roomTitie;
            this.recentChat = recentChat;
            this.tagArr = tagArr;
        }

        public int getChatCnt() {
            return chatCnt;
        }

        public int getBackgroungImgRes() {
            return backgroungImgRes;
        }

        public String getRoomTitie() {
            return roomTitie;
        }

        public String getRecentChat() {
            return recentChat;
        }

        public void setChatCnt(int chatCnt) {
            this.chatCnt = chatCnt;
        }

        public void setBackgroungImgRes(int backgroungImgRes) {
            this.backgroungImgRes = backgroungImgRes;
        }

        public void setRoomTitie(String roomTitie) {
            this.roomTitie = roomTitie;
        }

        public void setRecentChat(String recentChat) {
            this.recentChat = recentChat;
        }
    }
}

