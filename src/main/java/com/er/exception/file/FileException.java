package com.er.exception.file;

import com.er.exception.base.BaseException;

/**
 * 文件信息异常类
 * 
 * @author Ryuusei
 */
public class FileException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
