package com.example.lit.domain.vo.review;

import com.example.lit.domain.vo.user.UserFileVO;
import com.example.lit.domain.vo.user.UserVO;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class LikeVO {
    private Long reviewNumber;
    private Long userNumber;
    private String registerData;
}
