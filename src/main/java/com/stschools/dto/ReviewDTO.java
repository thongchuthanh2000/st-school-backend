package com.stschools.dto;
import lombok.Data;

@Data
public class ReviewDTO {
    private Long id;
    private String createdTime;
    private Integer rate;
    private String content;
    private UserDTO user;
    private CourseDTO course;
}
