package com.example.demo.bean;

import com.example.demo.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTORequest {
    private String firstName;
    private String secondName;
    private Integer id;
    private List<Integer> users;
}
