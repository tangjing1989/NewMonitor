import com.cn.web.util.page.IPageList;

import java.util.List;

/**
 * 分页抽象类，实现公用的部分 
 * 1.分页参数的处理pageSize、currentPage、totalCount、totalPage 
 * 2.查询生命周期 
 * @non javadocs 
 * @see IPageList 
 */
public abstract class AbstractPageList<R> implements IPageList<R> {

    private int pageSize=20;//默认20
    private int currentPage=1;//默认1  
    private int totalCount;
    private int totalPage;
    /**
     * 数据 
     */
    private List<R> result;


    public void doList(){
        beforeQuery();
        result=queryList();
        totalCount=queryTotalCount();
        //计算总页数  
        calTotalPage();
        afterQuery();
    }
    /**
     * 计算总页数 
     */
    private void calTotalPage(){
        totalPage=(int)Math.ceil((double)totalCount/pageSize);
    }
    /**
     * 抽象方法，根据currentPage和pageSize查询数据 
     * @return
     */
    protected abstract List<R> queryList();
    /**
     * 抽象方法，查询总的数据数量 
     * @return
     */
    protected abstract int queryTotalCount();
    /**
     * 两个回调函数 
     */
    protected abstract void beforeQuery();
    protected abstract void afterQuery();




    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getCurrentPage() {
        return currentPage;
    }
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    public int getTotalCount() {
        return totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public List<R> getResult() {
        return result;
    }
}  