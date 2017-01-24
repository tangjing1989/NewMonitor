package com.cn.web.util.page;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.collections.map.HashedMap;

import java.util.List;
import java.util.Map;

/**
 * Describe:
 * User:tangjing
 * Date:17/1/23
 * Time:下午12:23
 */

public class PageBaseUtil<T> {

    private String              rowNum;        //行号
    private String              sEcho;
    private int                 iDisplayStart;  // 起始索引
    private int                 iDisplayLength; // 每页显示的行数
    private int                 iTotalRecords;  //总页数
    private int                 sumNum;         //总记录数
    private List<T>             list;
    private String              PageObject;
    private Map<String, String> paraMap;//查询参数


    public PageBaseUtil() {
        this.rowNum = rowNum;
        this.sEcho = null;
        this.iDisplayStart = 0;
        this.iDisplayLength = 0;
        this.iTotalRecords = 0;
    }

    public String getRowNum() {
        return rowNum;
    }

    public void setRowNum(String rowNum) {
        this.rowNum = rowNum;
    }


    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getSumNum() {
        return sumNum;
    }

    public void setSumNum(int sumNum) {
        this.sumNum = sumNum;
    }

    public void setPageObject(String aoData) {
        JSONArray jsonarray = JSONArray.fromObject(aoData);
        for (int i = 0; i < jsonarray.size(); i++) {
            net.sf.json.JSONObject obj = (net.sf.json.JSONObject) jsonarray.get(i);
            if (obj.get("name").equals("sEcho"))
                this.sEcho = obj.get("value").toString();

            if (obj.get("name").equals("iDisplayStart"))
                this.iDisplayStart = obj.getInt("value");

            if (obj.get("name").equals("iDisplayLength"))
                this.iDisplayLength = obj.getInt("value");
            if (obj.get("name").equals("param"))
            {
                JSONObject  jasonObject = JSONObject.fromObject(obj.getString("value"));
                paraMap= (Map<String,String>)jasonObject;
            }
        }
    }


    public String getPageObject(List<T> list) {
        JSONObject getObj = new JSONObject();
        getObj.put("sEcho", this.sEcho);// 不知道这个值有什么用,有知道的请告知一下
        getObj.put("iTotalRecords", this.iTotalRecords);//实际的行数
        getObj.put("iTotalDisplayRecords", sumNum);//显示的行数,这个要和上面写的一样
        if ((iDisplayStart + iDisplayLength) < iTotalRecords)
            getObj.put("aaData", list.subList(iDisplayStart, iDisplayStart + iDisplayLength));//要以JSON格式返回
        else
            getObj.put("aaData", list);//要以JSON格式返回
        return getObj.toString();

    }

    public Map<String, Object> getParam() {
        Map<String, Object> resultMap = new HashedMap();
        resultMap.put("start", iDisplayStart);
        resultMap.put("end", iDisplayLength);
        return resultMap;
    }
}
