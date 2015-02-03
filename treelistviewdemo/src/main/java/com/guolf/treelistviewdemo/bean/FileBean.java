package com.guolf.treelistviewdemo.bean;

import com.guolf.treelistview.bean.*;

/**
 * Created by YQQ on 2015/2/3.
 */
public class FileBean {
    @TreeNodeId
    private int _id;
    @TreeNodePid
    private int parentId;
    @TreeNodeLabel
    private String name;

    public FileBean(int _id, int parentId, String name) {
        super();
        this._id = _id;
        this.parentId = parentId;
        this.name = name;
    }
}
