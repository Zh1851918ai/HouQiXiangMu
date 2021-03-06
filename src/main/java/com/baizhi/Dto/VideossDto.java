package com.baizhi.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideossDto {
    private String id;//": "a11282389568441fa166ebedef03e530",
    private String videoTitle;//": "人民的名义",
    private String cover;//'/'": "http://q40vnlbog.bkt.clouddn.com/1578650041065_人民的名义.jpg",
    private String path;//": "http://q3th1ypw9.bkt.clouddn.com/1578650041065_人民的名义.mp4",
    private Date uploadTime;//": "2020-01-30",
    private String description;//": "人民的名义",
    private Integer likeCount;//": 0,      视频数据
    private String cateName;//": "Java",   类别名    用户头像
    private String categoryId;//"categoryId": "16",
    private String userId;         //"userId": "1",
    private String userPicImg;//: "1.jpg"
    private String userName;        //"userName": "xiaohei"
    private Integer playCount;//": 23,
    private Boolean isAttention;//: true,
    private List<ViDto> videoList;
}
