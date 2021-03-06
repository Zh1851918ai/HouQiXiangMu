package com.baizhi.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideosDto {
    private String id;//": "a11282389568441fa166ebedef03e530",
    private String videoTitle;//": "人民的名义",
    private String cover;//'/'": "http://q40vnlbog.bkt.clouddn.com/1578650041065_人民的名义.jpg",
    private String path;//": "http://q3th1ypw9.bkt.clouddn.com/1578650041065_人民的名义.mp4",
    private Date uploadTime;//": "2020-01-30",
    private String description;//": "人民的名义",
    private String likeCount;//": 0,      视频数据
    private String cateName;//": "Java",   类别名    用户头像
    private String categoryId;//"categoryId": "16",
    private String userId;         //"userId": "1",
    private String username;        //"userName": "xiaohei"

}
