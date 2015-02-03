package com.guolf.treelistview.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YQQ on 2015/2/3.
 */
public class Node
{

    private int id;

    private String tName;

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    /**
     * ���ڵ�pIdΪ0
     */
    private int pId = 0;

    private String name;

    /**
     * ��ǰ�ļ���
     */
    private int level;

    /**
     * �Ƿ�չ��
     */
    private boolean isExpand = false;

    private int icon;

    /**
     * ��һ������Node
     */
    private List<Node> children = new ArrayList<Node>();

    /**
     * ��Node
     */
    private Node parent;

    public Node()
    {
    }

    public Node(int id, int pId, String name,String tName)
    {
        super();
        this.id = id;
        this.pId = pId;
        this.name = name;
        this.tName=tName;
    }

    public int getIcon()
    {
        return icon;
    }

    public void setIcon(int icon)
    {
        this.icon = icon;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getpId()
    {
        return pId;
    }

    public void setpId(int pId)
    {
        this.pId = pId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public boolean isExpand()
    {
        return isExpand;
    }

    public List<Node> getChildren()
    {
        return children;
    }

    public void setChildren(List<Node> children)
    {
        this.children = children;
    }

    public Node getParent()
    {
        return parent;
    }

    public void setParent(Node parent)
    {
        this.parent = parent;
    }

    /**
     * �Ƿ�Ϊ���ڵ�
     *
     * @return
     */
    public boolean isRoot()
    {
        return parent == null;
    }

    /**
     * �жϸ��ڵ��Ƿ�չ��
     *
     * @return
     */
    public boolean isParentExpand()
    {
        if (parent == null)
            return false;
        return parent.isExpand();
    }

    /**
     * �Ƿ���Ҷ�ӽ��
     *
     * @return
     */
    public boolean isLeaf()
    {
        return children.size() == 0;
    }

    /**
     * ��ȡlevel
     */
    public int getLevel()
    {
        return parent == null ? 0 : parent.getLevel() + 1;
    }

    /**
     * ����չ��
     *
     * @param isExpand
     */
    public void setExpand(boolean isExpand)
    {
        this.isExpand = isExpand;
        if (!isExpand)
        {

            for (Node node : children)
            {
                node.setExpand(isExpand);
            }
        }
    }

}