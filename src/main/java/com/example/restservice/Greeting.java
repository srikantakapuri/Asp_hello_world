package com.example.restservice;

public class Greeting{
        public long id; 
        public String content;

        public Greeting(long id, String content){
            this.id= id;
            this.content = content;
        }
        public long getId(){
            return this.id;
        }

        public void setId(long id){
            this.id = id;
        }

        public String getContent(){
            return this.content;
        }

        public void setContent(String content){
            this.content = content;
        }
    }
