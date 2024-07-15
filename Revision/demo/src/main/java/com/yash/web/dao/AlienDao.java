package com.yash.web.dao;

import com.yash.web.model.Alienmodel;

public class AlienDao 
{
    public Alienmodel getAlien(int roll)
    {
        Alienmodel a=new Alienmodel();
        a.setMarks(67);
        a.setName("ujjjwal");
        a.setRoll(roll);

        return a;
    }
}
