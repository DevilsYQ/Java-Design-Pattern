package com.devil.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RemoteControl//请求角色  就是调用者
{
    private DownCommand downCommand ;
    private UpCommand upCommand;
    public void up()
    {
        upCommand.execute();
    }
    public void down()
    {
        downCommand.execute();
    }
}
