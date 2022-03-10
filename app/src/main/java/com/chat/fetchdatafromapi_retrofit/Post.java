package com.chat.fetchdatafromapi_retrofit;

public class Post {


        private float userId;
        private Double id;
        private String title;
        private String body;


        // Getter Methods

        public float getUserId() {
            return userId;
        }

        public Double getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getBody() {
            return body;
        }

        // Setter Methods

        public void setUserId(float userId) {
            this.userId = userId;
        }

        public void setId(Double id) {
            this.id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setBody(String body) {
            this.body = body;
        }
    }

