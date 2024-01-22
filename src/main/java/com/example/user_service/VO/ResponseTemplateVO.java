package com.example.user_service.VO;

import com.example.user_service.entity.Userssz;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    Department department;
    Userssz user;
}
